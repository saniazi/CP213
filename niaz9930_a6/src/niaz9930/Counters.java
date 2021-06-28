package niaz9930;
/**
 * This immutable class is used to store and represent statistics 
 * involving single lines of input.
 * 
 * @author Shakeel Niazi
 *         ID: 151749930
 *         Email: niaz9930@mylaurier.ca
 * @version 1.8, 24 January 2017
 */
public class Counters {
	private String longestWord;
	private int items;
	private double spent;
	private int wordCount;
	private double averageWordLength;
	private String line;
	
	/**
	 * Stores statistics collected involving single lines of input
	 * 
	 * @param longestWord       The longest word in a line.
	 * @param items             The total number of items purchased that 
	 *                          is indicated in a line.
	 * @param spent             The amount of dollars spent indicated in
	 *                          a line.
	 * @param wordCount         The total amount of words in a line.
	 * @param averageWordLength The average word length in a line.
	 * @param line              The line that is being indicated. 
	 */
	public Counters(String longestWord, int items, double spent, 
			int wordCount, double averageWordLength, String line) {
		this.longestWord = longestWord;
		this.items = items;
		this.spent = spent;
		this.wordCount = wordCount;
		this.averageWordLength = averageWordLength;
		this.line = line;
	}
	
	/**
	 * Method that retrieves the line which the statistics refer to.
	 * 
	 * @return The line that the statistics are being collected from.
	 */
	public String getLine() {
		return line;
	}
	
	/**
	 * Method that retrieves the longest word in a line.
	 * 
	 * @return Longest word in a line.
	 */
	public String getLongestWord() {
		return longestWord;
	}
	
	/** 
	 * Method that retrieves the total number of items purchased in a line.
	 *
	 * @return Number of items purchased in a line.
	 */
	public int getItems() {
		return items;
	}
	
	/**
	 * Method that retrieves total amount of dollars spent.
	 * @return Amount of dollars spent.
	 */
	public double getSpent() {
		return spent;
	}
	
	/**
	 * Method that retrieves number of words in a line.
	 * 
	 * @return Number of words.
	 */
	public int getWordCount() {
		return wordCount;
	}
	
	/**
	 * Method that retrieves the average word length of a line.
	 * 
	 * @return Average word length of a line.
	 */
	public double getAverageWordLength() {
		return averageWordLength;
	}
	
}
