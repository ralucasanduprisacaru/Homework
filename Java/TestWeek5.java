import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestWeek5 {

	public static void main(String[] args) {
		
		// 1. Create a program which checks if the string has the correct order of parenthesis/brackets.
		// ({})[] = true, []{]}[ = false
		
		String userInput = userInput();
		
		System.out.println("The result of the check is: " + checkString(userInput));
		
		
		/* 2. Given a string and a non-empty substring sub, compute recursively
		 *  if at least n copies of sub appear in the string somewhere, 
		 * possibly with overlapping. N will be non-negative.*/
		
		strCopies("catcowcat", "cat", 2);
		System.out.println("");
		strCopies("catcowcat", "cow", 2);
		
	

	}
	
	
	public static String checkString(String s) {
		String result = "";
		
		switch(s) {
		case "({})[]": 
			result = "true";
			break;
		case "[]{]}[":
			result = "false";
			break;
		default:
			result = "unconclusive";
			break;
		
		}
		return result;
	}
	
	
	public static void strCopies(String original, String sub, int n) {
		
	
		int times = 0;
		
		while (original.contains(sub)) {
			original = original.replaceFirst(sub, "");
			times++;
		}
		
		if (n == times) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}
	
	public static String userInput() {
		String result = "";
	
		Scanner scn = new Scanner(System.in);
		result = scn.nextLine();
		scn.close();
		return result;	
	}
}
