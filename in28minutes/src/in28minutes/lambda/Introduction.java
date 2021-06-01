package in28minutes.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Introduction {

	public static void main(String[] args) {
		
		List<Integer> integerArray = Arrays.asList(4, 6, 3, 12, 7, 8, 21, 4);
		
		int sum = sumOfStream(integerArray);
		
		System.out.println("The sum is : "+ sum);

	}

	private static int sumOfStream(List<Integer> integerArray) {		
		
		BinaryOperator<Integer> sumVariable2 = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer x, Integer y) {
				
				return x+y;
			}			
		};		
		
		return integerArray.stream()
						  //.reduce(0, (x,y) -> x+y);
							.reduce(0, sumVariable2);
	}	

}
