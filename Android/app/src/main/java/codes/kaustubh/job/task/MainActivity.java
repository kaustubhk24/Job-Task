package codes.kaustubh.job.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mAdd,mlist,mEdit;
        mAdd=findViewById(R.id.add);
        mEdit=findViewById(R.id.edit);
        mlist=findViewById(R.id.viewbtn);


        mAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,add.class);
                startActivity(i);


            }
        });
        mEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,delete.class);
                startActivity(i);

            }
        });
        mlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,delete.class);
                startActivity(i);

            }
        });

    }
}