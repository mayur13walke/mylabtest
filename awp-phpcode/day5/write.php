<?php 
$myfile = fopen("data.txt", "w"); 
$txt = "munshi";
fwrite($myfile, $txt);
fclose($myfile);
echo "done";
?>