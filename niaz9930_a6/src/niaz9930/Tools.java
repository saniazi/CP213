package niaz9930;
import java.util.Scanner;

/**
 * Tools is a class used to process, collect, and store statistics of 
 * single lines of input into a Counters object.
 * 
 * @author Shakeel Niazi
 *         ID: 151749930
 *         Email: niaz9930@mylaurier.ca
 * @version 1.8 24 January 2017
 */

public class Tools {
	
	/**
	 * Processes a line and collects statistics from it.
	 * @param s A single line.
	 * @return A Counters object with statistics collected from
	 *         processing a line.
	 */
	public static Counters ProcessLine(String s) {
		Scanner line = new Scanner(s);
		double spent = 0.0;
		int items = 0;
		int wordCount = 0;
		double total = 0.0;
		String longestWord = "";
		String current;
		while (line.hasNext()) {
			current = line.next();
			char c = current.charAt(0);
			if (c >= '0' && c <= '9') {
				int currentItems = Integer.parseInt(current);
				items += currentItems;
			}
			else if (c == '$') {
				String amount = current.substring(1);
				double dollars = Double.parseDouble(amount);
				spent += dollars;
			}
			else {
				wordCount++;
				total += current.length();
				if (current.length() > longestWord.length())
					longestWord = current;
			}
		}
		double averageWordLength = total/wordCount;
		line.close();
		return new Counters(longestWord, items, spent, wordCount,
				averageWordLength, s);
	}

}
