package practise123;

public class StringProgram5 {

	public static void main(String[] args) {
		String str1 = "Hello world";
		String str2 = "world";
		boolean str = checkSubstring(str1, str2);
		if (str) {
			System.out.println(str2 + " is subString of " + str1);
		} else {
			System.out.println(str2 + " is not subString of " + str1);
		}

	}

	private static boolean checkSubstring(String str1, String str2) {

		return str1.indexOf(str2) != -1;
	}

}
