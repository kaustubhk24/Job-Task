<?PHP
require('config.php');

if(isset($_REQUEST['id'])  )
{
    //cleaning input 
    $id = mysqli_real_escape_string($conn , $_REQUEST['id']);
    

    


    $delete_query = "delete from STUDENT WHERE STUDENT_NO=".$id;
    $delete_query_result = mysqli_query($conn , $delete_query) or die(mysqli_error($conn));
      if($delete_query_result)
      {
          echo 'Record Deleted';
      }
      else
      {
          echo 'Unable to delete';
      }
}
else
{
    echo 'Invalid Arguments';
}
?>