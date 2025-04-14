package JavaConditionalStatement;

import java.util.Scanner;

public class VowelorConsonant {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	
		String letter = input.next().toLowerCase();
		switch (letter) {
		case "a":
			System.out.println("Input an alphabet: " + letter);
			System.out.println("Input letter is Consonant");
			break;
		case "b":
			System.out.println("Input an alphabet: " + letter);
			System.out.println("Input letter is Consonant");
			break;
		case "c":
			System.out.println("Input an alphabet: " + letter);
			System.out.println("Input letter is Consonant");
			break;
			
		default:
			break;
		}

	}

}
