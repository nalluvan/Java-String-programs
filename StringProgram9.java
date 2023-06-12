package practise123;
//input=a6c5b3a3d7b2d6
//output=a9b5c5d13
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class StringProgram9 {

	public static void main(String[] args) {
		String input = "a6c5b3a3d7b2d6";
		String output = compressString(input);
		System.out.println(output);
	}

	private static String compressString(String input) {
		StringBuilder sb = new StringBuilder();
		HashMap<Character, Integer> lhm = new HashMap<>();
		for (int i = 0; i < input.length(); i += 2) {
			char ch = input.charAt(i);
			int count = Character.getNumericValue(input.charAt(i+ 1));
			lhm.put(ch, lhm.getOrDefault(ch, 0) + count);

		}
		for (Entry<Character, Integer> e : lhm.entrySet()) {
			sb.append(e.getKey()).append(e.getValue());
		}

		return sb.toString();
	}
}
