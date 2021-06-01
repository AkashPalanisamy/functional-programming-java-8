package in28minutes.stream;

import java.util.Arrays;
import java.util.List;

public class Reduce {

	public static void main(String[] args) {		
		
		List<Integer> integerArray = Arrays.asList(4, 6, 3, 12, 7, 8, 21, 4);
		
		int sum = reduceSumOfStream(integerArray);
		System.out.println("Sum : "+sum);
		
		int minimum = reduceMinimumofStream(integerArray);
		System.out.println("Minimum : "+minimum);
		
		int maximum = reduceMaximumofStream(integerArray);
		System.out.println("Maximum : "+maximum);		
		
		int squareSum = reduceSquareSumofStream(integerArray);
		System.out.println("Sum of all squares : "+squareSum);
		
		int oddSum = reduceOddSumofStream(integerArray);
		System.out.println("Sum of all odd nos. : "+oddSum);
		
	}

	private static int reduceOddSumofStream(List<Integer> integerArray) {
		
		return integerArray.stream()
							.filter(n -> n%2 !=0)
							.reduce(0, (x,y) -> x+y);
	}

	private static int reduceSquareSumofStream(List<Integer> integerArray) {
		
		return integerArray.stream()
							.map(n -> n*n)
							.reduce(0,(x,y) -> x+y);
	}

	private static int reduceMaximumofStream(List<Integer> integerArray) {

		return integerArray.stream()
						   .reduce(Integer.MIN_VALUE,(x,y) -> x>y ? x:y);
	}

	private static int reduceMinimumofStream(List<Integer> integerArray) {
		
		return integerArray.stream()
						   .reduce(Integer.MAX_VALUE, (x,y) -> x<y ? x:y);
	}

	private static int reduceSumOfStream(List<Integer> integerArray) {
		
		return integerArray.stream()
						   .reduce(0,(x,y)-> x+y);
	}
	
}
