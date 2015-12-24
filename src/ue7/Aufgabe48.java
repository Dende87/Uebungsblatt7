package ue7;

import java.util.ArrayList;

public class Aufgabe48 {

	static char[] secretWord = { 'J', 'a', 'v', 'a' };
	static ArrayList<Character> playerTries = new ArrayList<Character>();

	public static void main(String[] args) {

		int roundCounter = 10;
		boolean victoryFlag = false;

		for (int i = 0; i < roundCounter; i++) {

			char sign = IO.readChar(
					"Runde " + (i + 1) + ". Bisher geraten " + getPlayerWord() + ". Was wählst du für ein Zeichen?");
			addWord(sign);
			if (getPlayerWord().equals(getSecretWord())) {
				victoryFlag = true;
				break;
			}

		}
		
		if(victoryFlag){
			IO.println("Gratualation! Du hast das Wort '" + getSecretWord() + "' erraten!");
		}else{
			IO.println("Tja, das war wohl nichts ;)");
		}

	}

	private static String getSecretWord() {

		String word = "";
		for (char s : secretWord) {
			word = word + s;
		}

		return word;
	}

	private static String getPlayerWord() {

		String word = "";
		for (char s : secretWord) {
			if (playerTries.contains(s)) {
				word = word + s;
			} else {
				word = word + "_";
			}
		}

		return word;
	}

	private static void addWord(char sign) {
		if (checkWord(sign)) {
			playerTries.add(sign);
		}
	}

	private static boolean checkWord(char sign) {

		if (playerTries.contains(sign)) {
			IO.println("Dummkopf! " + sign + " hast du schon mal getippt!");
			return false;
		} else if (!checkSign(sign)) {
			IO.println("Pech gehabt! " + sign + " kommt im Wort nicht vor!");
			return true;
		} else {
			return true;
		}

	}

	private static boolean checkSign(char sign) {

		for (char s : secretWord) {
			if (sign == s) {
				return true;
			}
		}
		return false;
	}

}
