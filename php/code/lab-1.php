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
       echo "The Circle has <br>";
       echo `A Radius of $radius <br>`;
       echo "A Diameter of ".$diameter."<br>";
       echo "Volume of a given cone is ".$volume."<br>";
       echo "An Area of ".$area."<br>";
        ?>
    </div>
</body>
</html>