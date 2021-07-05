<?php

$server_name = "remotemysql.com";
$username = "wx2j0z2kNU";
$password = "tZrl2EMoOV";
$DB_Name ='wx2j0z2kNU';



// Create connection
$conn = new mysqli($server_name, $username, $password,$DB_Name);

// Check connection
if ($conn->connect_error) {
  echo "<div class='alert alert-danger' role='alert'>Something went wrong and we're unable to connect Database</div>";
  // die("Connection failed: " . $conn->connect_error);
  die("");
  $is_connected=FALSE;

}
else
{
    $is_connected=TRUE;
}
?>