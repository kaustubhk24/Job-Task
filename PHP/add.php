<?PHP
require('config.php');

if(isset($_REQUEST['STUDENT_NAME']) && isset($_REQUEST['STUDENT_DOB']) &&isset($_REQUEST['STUDENT_DOJ']) )
{
    //cleaning input 
    $STUDENT_NAME = mysqli_real_escape_string($conn , $_REQUEST['STUDENT_NAME']);
    $STUDENT_DOB = mysqli_real_escape_string($conn , $_REQUEST['STUDENT_DOB']);
    $STUDENT_DOJ = mysqli_real_escape_string($conn , $_REQUEST['STUDENT_DOJ']);

    $insert_query = "INSERT INTO STUDENT (STUDENT_NAME,STUDENT_DOB,STUDENT_DOJ) VALUES ('$STUDENT_NAME','$STUDENT_DOB','$STUDENT_DOJ')";
    $insert_query_result = mysqli_query($conn , $insert_query) or die(mysqli_error($conn));
      if($insert_query_result)
      {
          echo 'Record Added';
      }
      else
      {
          echo 'unable to add record';
      }
}
else
{
    echo 'Invalid Arguments';
}
?>