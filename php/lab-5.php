<?php 
// The text to justify 
$myText = <<<END_TEXT
But think not that this famous town has only harpooneers, cannibals, and bumpkins to show her visitors. Not at all. Still New Bedford is a queer place. Had it not been for us whalemen, that tract of land would this day perhaps have been in as howling condition as the coast of Labrador. 
END_TEXT; 
//Desired line length 
$lineLength = 40; 
// Break the text into lines 
$lines = explode("\n", $myText); 
$justifiedText = ""; 
// Process each line 
foreach ($lines as $index => $line) { 
    $justifiedLine = $line; 
    $justifiedLineLength = strlen($justifiedLine); 
    // If it's not the last line, justify it 
    if ($index < count($lines) - 1) { 
        // If the line is shorter than the target length, add spaces 
        if ($justifiedLineLength < $lineLength) { 
            $words = explode(" ", $justifiedLine); 
            $numWords = count($words); 
            // If there's more than one word, justify by adding spaces between them 
            if ($numWords > 1) { 
                $spacesToAdd = $lineLength - $justifiedLineLength; 
                $numSpaces = $numWords - 1; // Spaces between words 
                // Add one space for each space between words first
                for ($i = 0; $i < $numSpaces; $i++) {
                  $words[$i] .= " ";
                }
                // Distribute the remaining spaces one by one 
                $i = 0; 
                while ($spacesToAdd > 0) { 
                    $words[$i] .= " "; // Add an extra space 
                    $spacesToAdd--; 
                    $i = ($i + 1) % $numSpaces; // Move to the next space 
                } 

                // Rebuild the justified line 
                $justifiedLine = implode("", $words); 
            } 
        } 
    } else { 
        // If it's the last line, leave it as is without justification 
        // Just make sure it's left-aligned (no extra spaces added) 
        $justifiedLine = rtrim($justifiedLine); // remove any trailing spaces from the last line 
    } 
    // Add the justified line to the final text 
    $justifiedText .= $justifiedLine . "\n"; 
} 
?> 
<h2> Original text: </h2> 
<pre> <?php echo $myText ?> </pre> 
<?php 
echo "<pre>$justifiedText</pre>"; 
?>