<?php
/*$db=new mysqli("localhost","root","","tds");
if($db->connect_error){
die("connection failed:"$db->connect_error);
}
$result=$db->query("SELECT * FROM student");
while($row=$result->fetch_assoc()){
echo"Name:".$row['name'],"<br>";
}
$db->close();*/
$servername = "localhost";
$username = "root";
$password = "";
$db = "tds";

// Create connection
$conn = new mysqli($servername, $username, $password,$db);

// Check connection
if ($conn->connect_error) {
  die("Connection failed: " . $conn->connect_error);
}
echo "Connected successfully";
$result=$conn->query("SELECT * FROM student");
while($row=$result->fetch_assoc()){
echo"Name:".$row['name'],"<br>";
}
$db->close();
?>
