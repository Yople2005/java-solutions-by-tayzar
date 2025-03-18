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
    // Define and sort a simple array
    $authors = array("Steinbeck", "Kafka", "Tolkien", "Dickens");
    
    // Sort in ascending order
    sort($authors);
    echo "<p>Sorted in ascending order:</p>";
    echo "<pre>";
    print_r($authors);
    echo "</pre>";
    
    // Sort in descending order
    rsort($authors);
    echo "<p>Sorted in descending order:</p>";
    echo "<pre>";
    print_r($authors);
    echo "</pre>";
    ?>

    <h2>Sorting Associative Array Values</h2>
    <?php
    // Define an associative array
    $myBook = array(
        "title" => "The Grapes of Wrath",
        "author" => "John Steinbeck",
        "pubYear" => 1939
    );
    
    // Sort by values in ascending order
    asort($myBook);
    echo "<p>Sorted by values in ascending order:</p>";
    echo "<pre>";
    print_r($myBook);
    echo "</pre>";
    
    // Sort by values in descending order
    arsort($myBook);
    echo "<p>Sorted by values in descending order:</p>";
    echo "<pre>";
    print_r($myBook);
    echo "</pre>";
    ?>
</body>
</html>