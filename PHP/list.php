<?PHP
require('config.php');


   
$res = $conn->query('SELECT * FROM STUDENT');
$rows = $res->fetch_all(MYSQLI_ASSOC);
echo json_encode($rows)

?>