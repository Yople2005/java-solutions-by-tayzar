<!DOCTYPE html>
<html>
<head>
    <title>Testing the Numbers 1-10</title>
    <link rel="stylesheet" type="text/css" href="common.css" />
</head>
<body>
    <h1>Testing the Numbers 1-10</h1>
    <table border="1" style= "border-collapse: collapse; ">
        <tr>
            <th>Number</th>
            <th>Odd or Even?</th>
            <th>Prime?</th>
        </tr>
        <?php
        for ($i = 1; $i <= 10; $i++) {
            $oddEven = ($i % 2 == 0) ? "Even" : "Odd";
            switch ($i) {
                case 2:
                case 3:
                case 5:
                case 7:
                    $prime = "Yes";
                    break;
                    
                default:
                    $prime = "No";
                    break;
            }
            
            echo `<tr>
            
            <td>${$i}</td>
            <td>${$oddEven}</td>
            <td>${$prime}</td>
            
            </tr>`;
        }
        ?>
    </table>
</body>
</html>