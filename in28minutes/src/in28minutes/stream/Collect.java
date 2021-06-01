package in28minutes.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collect {

	public static void main(String[] args) {
		
		List<Integer> integerArray = Arrays.asList(5,1,2,3,2,1,3);
		
		List<String> stringArray = Arrays.asList("Batman", "Superman", "Wonder woman",
				"Green Lantern", "Flash","Martian", "Cyborg");
		
		List<Integer> squares = squareOfStream(integerArray);		
		System.out.println(squares);
		
		List<String> lengthString = lengthOfStream(stringArray);
		System.out.println(lengthString);
	}

	private static List<String> lengthOfStream(List<String> stringArray) {
		
		return stringArray.stream()
							.map(n -> n+" : " + n.length())
							.collect(Collectors.toList());
	}

	private static List<Integer> squareOfStream(List<Integer> integerArray) {
		
		return integerArray.stream()
							.map(n -> n*n)
							.collect(Collectors.toList());
	}

}
