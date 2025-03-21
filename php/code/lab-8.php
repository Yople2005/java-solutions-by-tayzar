<html> 
<head> 
<title>Calculating factorials using recursion</title> 
<link rel="stylesheet" type="text/css" href="common.css" /> 
<style type="text/css"> 
th { text-align: left; background-color: #999; } 
th, td { padding: 0.4em; } 
tr.alt td {background: #ddd; } 
</style> 
</head> 
<body> 
<h2>Calculating Factorials Using Recursion</h2> 
<table cellspacing="0" border="0" style="width: 20em; border: 1px solid #666;"> 
<tr> 
<th>Integer</th> 
<th>Factorial</th> 
</tr> 
<?php 
$iterations = 10; 
function factorial($n) { 
    if ($n == 0) return 1; 
    return factorial($n - 1) * $n; 
} 
for ($i = 0; $i <= $iterations; $i++) { 
?> 
    <tr <?php if ($i % 2 != 0) echo 'class="alt"'; ?>> 
        <td><?php echo $i; ?></td> 
        <td><?php echo factorial($i); ?></td> 
    </tr> 
<?php 
} 
?> 
</table> 
</body> 
</html>