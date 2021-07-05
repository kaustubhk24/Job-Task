<?PHP
require('config.php');

if(isset($_REQUEST['STUDENT_NAME']) && isset($_REQUEST['STUDENT_NO']) && isset($_REQUEST['STUDENT_DOB']) &&isset($_REQUEST['STUDENT_DOJ']) )
{
    //cleaning input 
    $STUDENT_NAME = mysqli_real_escape_string($conn , $_REQUEST['STUDENT_NAME']);
    $STUDENT_DOB = mysqli_real_escape_string($conn , $_REQUEST['STUDENT_DOB']);
    $STUDENT_DOJ = mysqli_real_escape_string($conn , $_REQUEST['STUDENT_DOJ']);
    $STUDENT_NO = mysqli_real_escape_string($conn , $_REQUEST['STUDENT_NO']);


    $update_query = "UPDATE STUDENT SET STUDENT_NAME = '$STUDENT_NAME', STUDENT_DOB = '$STUDENT_DOB', STUDENT_DOJ = '$STUDENT_DOJ'  WHERE (STUDENT_NO='$STUDENT_NO')";


    $update_query_result = mysqli_query($conn , $update_query) or die(mysqli_error($conn));
      if($update_query_result)
      {
          echo 'Record updated';
      }
      else
      {
          echo 'unable to update record';
      }
}
else
{
    echo 'Invalid Arguments';
}
?>