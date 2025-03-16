<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" 
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"> 
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en"> 
<head> 
<title>Sorting the Array Values</title> 
<link rel="stylesheet" type="text/css" href="common.css"/> 
</head> 
<body> 
<h2>Sorting the Array Values</h2> 
<?php 
$authors = array("Steinbeck", "Kafka", "Tolkien", "Dickens"); 
sort($authors); 
echo "<br/>"; 
print_r($authors); 
rsort($authors); 
echo "<br/>"; 
print_r($authors); 
?> 
<h2>Sorting Associative Array Values</h2> 
<?php 
$myBook = array("title" => "The Grapes of Wrath", "author" => "John Steinbeck", "pubYear" => 1939); 
asort($myBook); 
echo "<br/>"; 
print_r($myBook); 
arsort($myBook); 
echo "<br/>"; 
print_r($myBook); 
?> 
</body> 
</html>