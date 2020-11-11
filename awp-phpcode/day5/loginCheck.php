<?php 
   $message = "";
    if(isset($_GET["uname"]))
    {

        //You will write code here to collect 
        //username and password from $_POST i.e. data coming from login.html
        //and revert to user true / false
        // echo $_GET["uname"];
        // echo   $_GET["password"];
        if($_GET["uname"] == "admin" && $_GET["password"] =="admin"){

            $message = '{"isvalid": 1}';
        }
        else
        {
            $message = '{"isvalid": 0}';
        }
        header("Content-Type:application/json");
        echo $message;
    }
    else
    {
        $message =  '{"isvalid": -1}';
        header("Content-Type:application/json");
        echo $message;
    }

?>