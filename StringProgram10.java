package practise123;

import java.util.LinkedHashSet;

//common elements from two strings.
public class StringProgram10 {

	public static void main(String[] args) {
		String[] str1 = { "one", "two", "three" };
		String[] str2 = { "four", "five", "three" };
		LinkedHashSet<String> set1 = new LinkedHashSet<>();
		LinkedHashSet<String> set2 = new LinkedHashSet<>();
	for(String str:str1) {
		set1.add(str);
	}
	for(String str:str2) {
		set2.add(str);
	}
	set1.retainAll(set2);
	System.out.println(set1);

	}

}
