<!DOCTYPE html>
<html>
<head>
    <title>Cone Calculator</title>
</head>
<body>
    <div class="container">
        <h1>Cone Calculator</h1>
        <?php 
        // Define variables
        $radius = 5;
        $diameter = $radius * 2;
        $area = M_PI * pow($radius, 2);
        $height = 7;
        $volume = ($area * $height) / 3;

        // Display results
        echo "Radius: " . $radius . "<br>";
        echo "Diameter: " . $diameter . "<br>";
        echo "Base Area: " . number_format($area, 2) . "<br>";
        echo "Height: " . $height . "<br>";
        echo "Volume: " . number_format($volume, 2) . "<br>";
        ?>
    </div>
</body>
</html>