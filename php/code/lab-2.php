<!DOCTYPE html>
<html>
<head>
    <title>Variable Comparisons</title>
</head>
<body>
    <?php
    $x = 7;
    $y = 5;

    echo `<p>x == y: ${$x == $y ? 'true' : 'false'}</p>`;
    echo `<p>x > y: ${$x > $y ? 'true' : 'false'}</p>`;
    echo `<p>x <= y: ${$x <= $y ? 'true' : 'false'}</p>`;
    echo `<p>x != y: ${$x != $y ? 'true' : 'false'}</p>`;
    ?>
</body>
</html>

x==y: false

if ($x==$y) {
echo "x==y: true";
}
else {
echo false;
}