This project processes multi-line text inputed by a user and collects statistics from the text. Statistics include:
 * Number of lines given
 * Average words per line
 * Total number of alphabetic words 
 * Longest word given
 * Number of items purchased
 * Dollars spent
 * Average price of items
 
 Input is processed line by line after user enters multiple lines followed by an empty line that signifies the end of the input from the keyboard. Lines should not contain periods except when denoting a price.
 
Example input:
 
 * "I purchased 2 items that cost $4.25
    
   "
 
Example output:
 
 * Lines: 1  
Average words per line: 5.0  
Total words count: 5  
Longest word is: purchased  
Items purchased: 2  
Dollars spend: $4.25  
Average price of item: $2.13  <br>
Line with largest word count is:  
I purchased 2 items that cost $4.25  <br>
Line with largest average word length is:  
I purchased 2 items that cost $4.25  <br>
List of longest words in each line is:  
purchased  
DONE  

Example input:
   
 * "2 cans cost $2.50<br>
    1 large fries costs $5.75
   
   " 	

Example output:
 
 * Lines: 2  
Average words per line: 2.0  
Total words count: 5  
Longest word is: large  
Items purchased: 3  
Dollars spend: $8.25  
Average price of item: $2.75  <br>
Line with largest word count is:  
1 large fries costs $5.75  <br>
Line with largest average word length is:  
1 large fries costs $5.75  <br>
List of longest words in each line is:  
cans  
large  
DONE