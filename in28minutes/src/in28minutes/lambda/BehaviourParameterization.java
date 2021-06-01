package in28minutes.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class BehaviourParameterization {

	public static void main(String[] args) {
		
		List<Integer> integerArray = Arrays.asList(4, 6, 3, 12, 7, 8, 21, 4);
		
		/*			BEHAVIOUR PARAMETERIZATION
		 * We are passing "lambda" expressions as arguments
		 */
		
		System.out.println("----SQUARES----");
		mapBehaviourStream(integerArray, n -> n*n);
		
		System.out.println("----CUBES----");
		mapBehaviourStream(integerArray, n -> n*n*n);
		
		System.out.println("----EVEN----");		
		filterBehaviourStream(integerArray, n -> n%2==0);
		
		System.out.println("----ODD----");		
		filterBehaviourStream(integerArray, n -> n%2!=0);

	}

	private static void filterBehaviourStream(List<Integer> integerArray,
												Predicate<Integer> predicate) {
			
		integerArray.stream()
					.filter(predicate)
					.forEach(System.out::println);		
	}

	private static void mapBehaviourStream(List<Integer> integerArray,
										Function<Integer,Integer> function) {
		
		integerArray.stream()
					.map(function)
					.forEach(System.out::println);		
	}

}
