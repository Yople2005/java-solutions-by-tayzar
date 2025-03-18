<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" 
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
    <title>Defining and Using Object Properties</title>
    <link rel="stylesheet" type="text/css" href="common.css"/>
</head>
<body>
    <h1>Defining and Using Object Properties</h1>

    <?php
    // Define the Car class with properties
    class Car {
        public $color;
        public $manufacturer;
    }

    // Create and initialize the Beetle object
    $beetle = new Car();
    $beetle->color = "red";
    $beetle->manufacturer = "Volkswagen";

    // Create and initialize the Mustang object
    $mustang = new Car();
    $mustang->color = "green";
    $mustang->manufacturer = "Ford";

    // Display specific properties
    echo "<h2>Some properties:</h2>";
    echo "<p>The Beetle's color is " . $beetle->color . ".</p>";
    echo "<p>The Mustang's manufacturer is " . $mustang->manufacturer . ".</p>";

    // Display complete object information
    echo "<h2>The \$beetle Object:</h2>";
    echo "<pre>";
    print_r($beetle);
    echo "</pre>";

    echo "<h2>The \$mustang Object:</h2>";
    echo "<pre>";
    print_r($mustang);
    echo "</pre>";
    ?>

</body>
</html>