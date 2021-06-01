package in28minutes.stream;

import java.util.Arrays;
import java.util.List;

public class MapAndFilter {

	public static void main(String[] args) {

		List<Integer> integerArray = Arrays.asList(4, 56, 33, 12, 7, 8, 2, 4);

		List<String> stringArray = Arrays.asList("Batman", "Superman", "Wonder woman",
				"Green Lantern", "Flash","Martian", "Cyborg");
			
		streamWithIntegers(integerArray);
		System.out.println("-------------------");
		streamWithStrings(stringArray);

	}

	private static void streamWithStrings(List<String> stringArray) {
		
		stringArray.stream()
					.map(n -> n.toUpperCase())
					.filter(n -> n.length() <= 6)
					.forEach(System.out::println);
		
	}

	private static void streamWithIntegers(List<Integer> integerArray) {
		
		integerArray.stream()
					.filter(n -> n%2 !=0)
					.map(n -> n*n)
					.forEach(System.out::println);				
	}

}
