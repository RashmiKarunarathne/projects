<?php
    include("db.php");
    $pagename="Make your home smart"; 
    //Create and populate a variable called $pagename 
    echo "<link rel=stylesheet type=text/css href=mystylesheet.css>"; //Call in stylesheet
    echo "<title>".$pagename."</title>";
    echo "<body>";
    include ("headfile.html");
    echo "<h4>".$pagename."</h4>";
    //retrieve the product id passed from previous page using the GET method and the $_GET superglobal variable
    //applied to the query string u_prod_id
    //store the value in a local variable called $prodid
    $prodid=$_GET['u_prod_id'];

    $SQL="select prodId, prodName, prodPicNameLarge, prodDescripLong, prodPrice, prodQuantity from Product where prodId=${prodid}";
    //run SQL query for connected DB or exit and display error message
    $exeSQL=mysqli_query($conn, $SQL) or die (mysqli_error($conn));
    
    //display the value of the product id, for debugging purposes
    echo "<table style='border: 0px'>";
    //create an array of records (2 dimensional variable) called $arrayp.
    //populate it with the records retrieved by the SQL query previously executed.
    //Iterate through the array i.e while the end of the array has not been reached, run through it
    while ($arrayp=mysqli_fetch_array($exeSQL))
    {
    echo "<tr>";
    echo "<td style='border: 0px'>";
    echo "<img src=images/".$arrayp['prodPicNameLarge']." height=400 width=400>";
    echo "</td>";
    echo "<td style='border: 0px'>";
    echo "<h5>".$arrayp['prodName']."</h5>";
    echo "<p>".$arrayp['prodDescripLong']."</p>";
    echo "<br>";
    echo "<p><b>$ ".$arrayp['prodPrice']."</b></p>";
    echo "<br>";
    echo "<p>".$arrayp['prodQuantity']." Available</p>";
    echo "<br>";
    echo "<p>Number to be purchased: ";
    //create form made of one text field and one button for user to enter quantity
    //the value entered in the form will be posted to the basket.php to be processed
    echo "<form action=basket.php method=post>";
    
    echo "<select name='quantity'";
    for($item = 0; $item <= $arrayp['prodQuantity']; $item++) {
        echo "<option value='${item}'>${item}</option>";
    }
    echo "</select>";

    echo "<br>";
    echo "<input type=submit name='submitbtn' value='ADD TO BASKET' id='submitbtn'>";
    //pass the product id to the next page basket.php as a hidden value
    echo "<input type=hidden name=h_prodid value=".$prodid.">";
    echo "<input type=hidden name=h_prodquantity value=quantity>";
    echo "</form>";
    echo "</p>";
    echo "</td>"; 
    echo "</tr>";
    }
    echo "</table>";
    //display name of the page as window title
    //include header layout file
    //display name of the page on the web page
    //display random text
    include("footfile.html"); //include head layout
    echo "</body>";
?>