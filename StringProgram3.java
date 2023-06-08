package practise123;

public class StringProgram3 {

	public static void main(String[] args) {
		// remove special characters from a string
		String str = "Boopathy@22";
		char[] ch = str.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (int i = 0, k = 0; i < ch.length; i++) {
			if ((ch[i] >= 48 && ch[i] <= 57) || (ch[i] >= 65 && ch[i] <= 90)
					|| (ch[i] >= 97 && ch[i] <= 122)) {
				sb.append(ch[i]);

			}

		}
		str = sb.toString();
		System.out.println(str);

	}

}
