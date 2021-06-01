package in28minutes.stream;

import java.util.Arrays;
import java.util.List;

public class Distinct {

	public static void main(String[] args) {
		
		List<Integer> integerArray = Arrays.asList(5,1,2,3,1,4,3,2,1,3);
		
		printDistinctOfStream(integerArray);
	}

	private static void printDistinctOfStream(List<Integer> integerArray) {
		
		integerArray.stream()
					.distinct()
					.forEach(System.out::println);		
	}

}
