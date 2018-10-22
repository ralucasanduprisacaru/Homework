import java.util.ArrayList;
import java.util.List;

public class TestWeek4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Sort the array with multiple same values in the array in an ascending
		// order.
		List<Integer> list = new ArrayList<>();

		Integer[] numbers = { 2, 8, 9, 3, 4, 3, 2, 6, 6, 2, 4, 9, 8 };

		for (Integer i : numbers) {
			list.add(i);
		}

		list.sort(null);

		System.out.println(list);

		// 2. Say you have a string of characters. Write an algorithm to collect and
		// return a list of all substrings
		// such that order is maintained but characters may be skipped. So “frog” can
		// produce fog, fg, rg, etc.
		
		



		cutString("frog");

	}

	public static void cutString(String word) {
		int length = word.length();

		List<String> modified = new ArrayList<>();

		for (int i = 0; i < length; i++) {
			for (int j = length; j > i; j--) {
				String s = word.substring(i, j);

				if (!modified.contains(s)) {
					modified.add(s);
				}

			}
			

		}

		System.out.println(modified);

	}

}
