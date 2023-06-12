package practise123;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringProgram12 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("My", "name", "is", "Boopathy");
		Map<Integer, List<String>> lengthMap = words.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(lengthMap);
	}

}
