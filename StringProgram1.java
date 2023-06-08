package practise123;

public class StringProgram1 {

	public static void main(String[] args) {
		String str = "red,green,yellow";
		String[] words = str.split(",");
		String temp = words[0];
		words[0] = words[2];
		words[2] = temp;

		for (int i = 0; i < words.length; i++) {
			words[i] = new StringBuilder(words[i]).reverse().toString();

		}
		str = String.join(" ", words);

		System.out.print(str);

	}

}
