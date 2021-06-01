package in28minutes.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorted {

	public static void main(String[] args) {
		
		List<Integer> integerArray = Arrays.asList(5,1,2,3,1,4,3,2,1,3);
		
		List<String> stringArray = Arrays.asList("Batman", "Superman", "Wonder woman",
				"Green Lantern", "Flash","Martian", "Cyborg");		
		
		printSortedOfStream(integerArray);
		System.out.println("-----------");
		printSortedDescendingofStream(integerArray);
		System.out.println("-----------");
		printSortedLengthWiseOfStream(stringArray);
	}

	private static void printSortedLengthWiseOfStream(List<String> stringArray) {
		
		stringArray.stream()
					.sorted(Comparator.comparing(str -> str.length()))
					.forEach(System.out::println);		
	}

	private static void printSortedDescendingofStream(List<Integer> integerArray) {
		
		integerArray.stream()
					.sorted(Comparator.reverseOrder())
					.forEach(System.out::println);
		
	}

	private static void printSortedOfStream(List<Integer> integerArray) {
		
		integerArray.stream()
					.sorted()
					//.sorted(Comparator.naturalOrder())
					.forEach(System.out::println);		
	}
}
