package myPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Multiline comment at the top of the file.
 */

/**
 * This is a description of what this class will do...
 *
 * @author  Kaleb Moreno (kalebm2@uw.edu)
 * @version Mar 8, 2019 (Date of class creation)
 */
public class Word implements Comparable<Word> {

	/**
	 * This is the word in its original form.
	 */
	private String myOriginalWord;

	/**
	 * This is the word in its standardized form.
	 */
	private String myCanonicalWord;

	/*
	 * This is a constructor sets the original word field to the word
	 * passed. It then calls a method to convert that word into a
	 * Canonical version of that word, then sets the associated field.
	 *
	 * @param theOriginalWord : This is the word to be converted into a
	 * word object.
	 */
	public Word(String theOriginalWord) {
		myOriginalWord = theOriginalWord;
		myCanonicalWord = convertToCanonicalVersion(theOriginalWord);
	}

	/**
	 * This is a getter.
	 *
	 * @return : This should return the original word field.
	 */
	public String getMyOriginalWord() {
		return myOriginalWord;
	}

	/**
	 * This is a getter.
	 *
	 * @return : This should return the Canonical word field.
	 */
	public String getMyCanonicalWord() {
		return myCanonicalWord;
	}

	/**
	 * This method should receive a word and convert it to its Canonical
	 * version.
	 *
	 * @param  theOriginalWord : This is the original word passed.
	 * @return                 : This method returns the Canonical Word.
	 */
	public String convertToCanonicalVersion(String theOriginalWord) {
		char[] theChars = theOriginalWord.toCharArray();
		List<Character> characterHolding = new ArrayList<Character>();
		for (int i = 0; i < theChars.length; i++) {
			characterHolding.add(theChars[i]);
		}
		Collections.sort(characterHolding);
		return characterHolding.toString();
	}

	/**
	 * This is the CompareTo method that is overridden form the Comparable
	 * interface.
	 * 
	 * @param  o : This is the word object to be compared.
	 * @return   : This method returns an int indicating the nature of the
	 *           comparison.
	 */
	@Override
	public int compareTo(Word o) {
		int result = 0;
		if (myCanonicalWord.length() < o.myCanonicalWord.length()) {
			result = -1;
		} else if (myCanonicalWord.length() > o.myCanonicalWord.length()) {
			result = 1;
		} else if (myCanonicalWord.length() == o.myCanonicalWord.length()) {
			if (myCanonicalWord.compareTo(o.myCanonicalWord) < 0) {
				result = -1;
			}
			if (myCanonicalWord.compareTo(o.myCanonicalWord) > 0) {
				result = 1;
			}
		}
		return result;
	}

	/**
	 * This method copies the word from the field.
	 *
	 * @return :
	 */
	public Word copyWord() {
		Word word = new Word(myOriginalWord);
		return word;
	}

	/**
	 * This is an overidden method..
	 *
	 *
	 */
	@Override
	public String toString() {
		return " Word: " + myOriginalWord;
	}
}
