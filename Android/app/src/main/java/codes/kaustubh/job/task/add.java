package codes.kaustubh.job.task;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.snackbar.Snackbar;

import java.util.Date;

public class add extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        String API_URL="https://job-task-api.herokuapp.com/";

        EditText mName;
        EditText mDOB,mDOJ;
        Button mSave;
        mName=findViewById(R.id.student_name);
        mDOB=findViewById(R.id.dob);
        mDOJ=findViewById(R.id.doj);
        mSave=findViewById(R.id.addSave);



        mSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initiateRegistration(mName.getText().toString(),mDOB.getText().toString(),mDOJ.getText().toString(),API_URL);
                Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), "Please wait....", Snackbar.LENGTH_SHORT);
                snackbar.show();
                mSave.setEnabled(false);
            }
        });


    }



    public void initiateRegistration(String fname, String DOB, String DOJ, String API_URL) {

            String PING_URL = API_URL + "add?STUDENT_NAME=" + fname +  "&STUDENT_DOJ=" + DOJ + "&STUDENT_DOB=" + DOB;
            RequestQueue queue = Volley.newRequestQueue(this);
            StringRequest stringRequest = new StringRequest(Request.Method.GET, PING_URL,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String res) {
                            String[] items = res.split(",");
                            String response = items[0];
                            Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), response, Snackbar.LENGTH_SHORT);
                            snackbar.show();


                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), "Something went wrong\nPlease check internet connection", Snackbar.LENGTH_SHORT);
                    snackbar.show();


                }
            });

// Add the request to the RequestQueue.
            queue.add(stringRequest);





    }





}