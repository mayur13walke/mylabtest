<?php
$file = fopen("data.txt", "r");
echo fread($file,filesize("data.txt"));
//echo fgets($file);
fclose($file);
?>