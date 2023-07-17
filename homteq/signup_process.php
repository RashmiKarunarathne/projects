<?php
    session_start();
    include ("db.php");
    $pagename="Sign up results"; 
    //Create and populate a variable called $pagename 
    echo "<link rel=stylesheet type=text/css href=mystylesheet.css>"; //Call in stylesheet
    echo "<title>".$pagename."</title>";
    echo "<body>";
    include ("headfile.html");
    echo "<h4>".$pagename."</h4>";
    $firstName = $_POST['r_firstname'];
    $lastName = $_POST['r_lastname'];
    $address = $_POST['r_address'];
    $postcode = $_POST['r_postcode'];
    $telno = $_POST['r_telno'];
    $email = $_POST['r_email'];
    $password = $_POST['r_password'];
    if(isset( $_POST['r_lastname'])) {
        echo ("Works");
        echo ($lastName);
    }
    $SQL="insert into Users (userFName, userSName, userAddress, userPostCode, userTelNo, userEmail, userPassword) values ('${firstName}', '${lastName}', '${address}', '${postcode}', '${telno}', '${email}', '${password}')";
    //run SQL query for connected DB or exit and display error message
    $exeSQL=mysqli_query($conn, $SQL) or die (mysqli_error($conn));

    //display name of the page as window title
    //include header layout file
    //display name of the page on the web page
    //display random text
    include("footfile.html"); //include head layout
    echo "</body>";
?>