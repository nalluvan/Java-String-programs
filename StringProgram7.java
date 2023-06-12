package practise123;
//write pseudo code to print the 
//words followed by vowels(a,e,i,o,u) in the word,
//only if the word have 't' occurring in them?

public class StringProgram7 {

	public static void main(String[] args) {
		String sentence = "All the best";
		printSentenceofVowelsAndT(sentence);

	}

	private static void printSentenceofVowelsAndT(String sentence) {
		String[] words = sentence.split(" ");
		int count = 0;
		for (String word : words) {
			if (word.contains("t")) {
				int vowelscount = 0;
				for (char ch : word.toCharArray()) {
					if (isVowels(ch)) {
						vowelscount++;
					}
				}
				if (vowelscount > 0) {
					count++;
					System.out.println(word + "(" + vowelscount + ")");
				}
			}
			
		}
		if (count == 0) {
			System.out.println("(0)");
		}

	}

	private static boolean isVowels(char ch) {
		ch = Character.toLowerCase(ch);

		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}

}
