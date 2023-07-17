<?php
    session_start();
    include("db.php");
    $pagename="smart basket"; 
    //Create and populate a variable called $pagename 
    echo "<link rel=stylesheet type=text/css href=mystylesheet.css>"; //Call in stylesheet
    echo "<title>".$pagename."</title>";
    echo "<body>";
    include ("headfile.html");
    echo "<h4>".$pagename."</h4>";
    
    //display name of the page as window title
    //include header layout file
    //display name of the page on the web page
    //display random text

    if(isset($_POST['h_prodid'])) {
            $newprodid = $_POST['h_prodid'];
            $reququantity = $_POST['quantity'];
            $_SESSION['basket'][$newprodid]=$reququantity;
            echo "<p>1 item added";
    } 
    
    if(isset($_POST['del_prodid'])) {
        unset($_SESSION['basket'][$_POST['del_prodid']]);
    }

    $total = 0;
    
    echo "<table id=checkouttable>";
        echo "<tr>";
            echo "<th>Product Name</th>";
            echo "<th>Price</th>";
            echo "<th>Quantity</th>";
            echo "<th>Subtotal</th>";
            echo "<th>Remove Product</th>";
        echo "</tr>";
        if(isset($_SESSION['basket'])) {
            foreach($_SESSION['basket'] as $index => $quantity) {
                $SQL="select prodName, prodPrice from Product where prodId=${index}";
                $exeSQL=mysqli_query($conn, $SQL) or die (mysqli_error($conn));
                while ($arrayp=mysqli_fetch_array($exeSQL)) {
                    echo "<tr>";
                        echo "<td>".$arrayp['prodName']."</td>";
                        echo "<td>$ ".$arrayp['prodPrice']."</td>";
                        echo "<td>${quantity}</td>";
                        echo "<td>$ ".$arrayp['prodPrice'] * $quantity."</td>";
                        echo "<td>";
                        echo "<form method=post action=basket.php>";
                            echo "<input type=submit name='submitbtn' value='Remove' id='submitbtn'>";
                            echo "<input type=hidden name=del_prodid value=".$index.">";
                        echo "</form>";
                        echo "</td>";
                        $total += $arrayp['prodPrice'] * $quantity;
                    echo "</tr>";
                }
            }
        }
        echo "<tr>";
            echo "<td colspan=4>TOTAL </td>";
            echo "<td>$ ".$total."</td>";
        echo "</tr>";
    echo "</table>";
    echo "<br>";
    echo "<br>";
    echo "<a href=clearbasket.php>CLEAR BASKET</a>";
    echo "<br>";
    echo "<br>";
    echo "<p>New hometeq customers: <a href=signup.php>Sign Up</a></p>";
    echo "<br>";
    echo "<p>Returning hometeq customers: <a href=login.php>Log In</a></p";


    // echo ("<table></table>")
    include("footfile.html"); //include head layout
    echo "</body>";
?>