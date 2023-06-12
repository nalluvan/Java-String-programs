package practise123;
//Sort an array of String based on their length

import java.util.Arrays;
import java.util.Comparator;

public class StringProgram11 {

	public static void main(String[] args) {
		String[] array = { "apple", "MAngo", "orange", "grape", "kiwi" };
		Arrays.sort(array, Comparator.comparingInt(String::length));
		System.out.println(Arrays.toString(array));
	}

}
