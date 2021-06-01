package in28minutes.lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class AdvancedFunctionalInterfaces {

	public static void main(String[] args) {
		
		// BiPredicate accepts 2 inputs with different data types
		// However the output is by default "boolean" only		
		BiPredicate<Integer,String> checkCondition = (i,s) -> {
	
			return i<10 && s.length()>5;
		};
			System.out.println(checkCondition.test(40, "forty"));
			
		// We have to specify the 3 input types and the output type also
		// The output can be of different data type also			
		BiFunction<Integer,Integer,String> toString = (a,b) -> {
			
			return a+" "+b;
		};
			System.out.println(toString.apply(20, 30));
			
		// Accepts 2 input of different/same types and no output		
		BiConsumer <Integer,String> printTwoValues = (a,b) -> {
			
			System.out.println(a+" "+b);
		};		
			printTwoValues.accept(40, "forty");
			
		/*
		 * There are other Functional Interfaces with "primitive data types"
		 * They don't have any generic data types mentioned with them
		 * It prevents unnecessary auto-boxing and auto-unboxing
		 * 	IntBinaryOperator
		 * 	IntConsumer
		 * 	DoubleSupplier
		 * 	IntToDoubleFunction
		 * 	IntUnaryOperator
		 * etc.
		 */

	}

}
