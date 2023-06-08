package practise123;

import java.util.*;
import java.util.Map.Entry;

public class StringProgram2 {

	public static void main(String[] args) {
		String str = "red,green,yellow,white";
		String[] words = str.split(",");
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		for (String str1 : words) {
			if (lhm.containsKey(str1)) {

				lhm.put(str1, lhm.get(str1) + 1);

			} else {
				lhm.put(str1, 1);
			}

		}
		for (Entry<String, Integer> e : lhm.entrySet()) {
			System.out.println(e.getKey() + "==>" + e.getValue());
		}

	}
}
