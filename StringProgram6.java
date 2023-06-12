package practise123;

import java.util.LinkedHashMap;

//highest occurrence character;
public class StringProgram6 {

	public static void main(String[] args) {
		String str = "codeBoardTechnology";
		char[] ch = str.toCharArray();
		int highestFrequency = 0;
		char mostReapeatedChar = 0;

		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
		for (char ch1 : ch) {
			if (lhm.containsKey(ch1)) {
				int frequency = (lhm.get(ch1) + 1);
				if (frequency > highestFrequency) {
					highestFrequency = frequency;
					mostReapeatedChar = ch1;
				}
				lhm.put(ch1, frequency);

			} else {
				lhm.put(ch1, 1);
			}
		}
		System.out.println("the most repeated charecter is " + mostReapeatedChar + " occurs at " + highestFrequency);

	}

}
