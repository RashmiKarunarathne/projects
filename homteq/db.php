<?php
    $dbhost = "localhost";
    $dbuser = "root";
    $dbpass = "";
    $dbname = "w1866971";
    // echo "LOL"
    $conn = mysqli_connect($dbhost, $dbuser, $dbpass, $dbname);
    // $mysqli = new mysqli($dbhost,$dbname,$dbpass,$dbname);

    if (!$conn) {
        die("Could not connect: " . mysqli_error($conn));
    }

    mysqli_select_db($conn, $dbname);
?>