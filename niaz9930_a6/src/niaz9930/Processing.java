package niaz9930;
import java.util.Scanner;

/**
 * Processing is a class used to process a multi-line text inputed by a
 * user and collects statistics from the text. Input is processed line
 * by line after user enters multiple lines followed by an empty line 
 * that signifies the end of the input from the keyboard.
 * @author Shakeel Niazi
 *         ID: 151749930
 *         Email: niaz9930@mylaurier.ca
 * @version 1.8 24 January 2017
 */

public class Processing {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		if (line.equals("")) {
			System.out.println("Text is empty!");
			System.out.println("DONE");
			input.close();
		}
		else {
			int lines = 0;
			int totalWords = 0;
			String longestWord = "";
			int totalItems = 0;
			double spent = 0.0;
			int largestWordCount = 0;
			String largestWordCountLine = "";
			double averageWordLength = 0.0;
			String averageWordLengthLine = "";
			String longestWordsList = "";
			while (!line.equals("")) {
				Counters stats = Tools.ProcessLine(line);
				lines++;
				totalWords += stats.getWordCount();
				totalItems += stats.getItems();
				spent += stats.getSpent();
				longestWordsList += stats.getLongestWord() + "\n";
				if (stats.getLongestWord().length() > longestWord.length())
					longestWord = stats.getLongestWord();
				if (stats.getWordCount() > largestWordCount) {
					largestWordCount = stats.getWordCount();
					largestWordCountLine = stats.getLine();
				}
				if (stats.getAverageWordLength() > averageWordLength) {
					averageWordLength = stats.getAverageWordLength();
					averageWordLengthLine = stats.getLine();
				}
				line = input.nextLine();
			}
			double averageWordsLine = totalWords/lines;
			double averagePrice = spent/totalItems;
			System.out.println("Lines: " + lines);
			System.out.println("Average words per line: " + averageWordsLine);
			System.out.println("Total words count: " + totalWords);
			System.out.println("Longest word is: " + longestWord);
			if (totalItems == 0) {
				System.out.println("No purchases have been made");
				System.out.println("");
				System.out.println("Line with largest word count is:");
				System.out.println(largestWordCountLine);
				System.out.println("");
				System.out.println("Line with largest average word length is:");
				System.out.println(averageWordLengthLine);
				System.out.println("");
				System.out.println("List of longest words in each line is:");
				System.out.print(longestWordsList);
				System.out.print("DONE");
				input.close();
			}
			else {
			System.out.println("Items purchased: " + totalItems);
			System.out.println("Dollars spent: $" + spent);
			System.out.printf("Average price of item: $%.2f\n", averagePrice);
			System.out.println("");
			System.out.println("Line with largest word count is:");
			System.out.println(largestWordCountLine);
			System.out.println("");
			System.out.println("Line with largest average word length is:");
			System.out.println(averageWordLengthLine);
			System.out.println("");
			System.out.println("List of longest words in each line is:");
			System.out.print(longestWordsList);
			System.out.print("DONE");
			input.close();
			}
		}

	}

}
