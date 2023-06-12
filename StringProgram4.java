package practise123;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

//How to remove duplicate characters from String?
public class StringProgram4 {

	public static void main(String[] args) {
		String str = "Malayalam";
		char[] ch = str.toCharArray();
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
		for (char ch1 : ch) {
			if (lhm.containsKey(ch1)) {
				lhm.put(ch1, lhm.get(ch1) + 1);
			} else {
				lhm.put(ch1, 1);
			}
		}
		for (Entry<Character, Integer> e : lhm.entrySet()) {
			if (e.getValue() <= 1) {
				System.out.print(e.getKey());

			}
		}

	}

}
