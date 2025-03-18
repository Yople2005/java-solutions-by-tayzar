<?php 
$myText = <<<END_TEXT
But think not that this famous town has
only harpooneers, cannibals, and 
bumpkins to show her visitors. Not at
all. Still New Bedford is a queer place.
Had it not been for us whalemen, that 
tract of land would this day perhaps
have been in as howling condition as the
coast of Labrador.
END_TEXT; 
$lineLength = 40; 
$paragraphs = explode("\n\n", $myText);
$justifiedText = "";

foreach ($paragraphs as $paragraphIndex => $paragraph) {
    if ($paragraphIndex > 0) {
        $justifiedText .= "\n";
    }
    
    $words = preg_split('/\s+/', $paragraph);
    $currentLine = [];
    $currentLength = 0;
    $lines = [];
    foreach ($words as $word) {
        $wordLength = strlen($word);
        if ($currentLength + $wordLength + count($currentLine) <= $lineLength) {
            $currentLine[] = $word;
            $currentLength += $wordLength;
        } else {
            if (!empty($currentLine)) {
                $lines[] = $currentLine;
            }
            $currentLine = [$word];
            $currentLength = $wordLength;
        }
    }
    if (!empty($currentLine)) {
        $lines[] = $currentLine;
    }

    // Process each line
    for ($i = 0; $i < count($lines); $i++) {
        $line = $lines[$i];
        $wordsInLine = count($line);
        $baseLength = array_sum(array_map('strlen', $line));
        
        if ($i == count($lines) - 1 || $wordsInLine == 1) {
            $justifiedText .= implode(" ", $line);
            $justifiedText .= str_repeat(" ", $lineLength - ($baseLength + $wordsInLine - 1));
        } else {
            $spaces = $lineLength - $baseLength;
            $gaps = $wordsInLine - 1;
            $spacesPerGap = floor($spaces / $gaps);
            $extraSpaces = $spaces % $gaps;
            $justifiedLine = $line[0];
            for ($j = 1; $j < $wordsInLine; $j++) {
                $spaceCount = $spacesPerGap + ($j <= $extraSpaces ? 1 : 0);
                $justifiedLine .= str_repeat(" ", $spaceCount) . $line[$j];
            }
            $justifiedText .= $justifiedLine;
        }
        $justifiedText .= "\n";
    }
}
?> 
<h2> Original text: </h2> 
<pre> <?php echo $myText ?> </pre> 
<?php 
echo "<pre>$justifiedText</pre>"; 
?>