package in28minutes.lambda;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class BasicFunctionalInterfaces {

	public static void main(String[] args) {

		// Predicate has 1 input and returns Boolean output as default type
		Predicate<Integer> isEven = x -> x%2 ==0;	
			System.out.println(isEven.test(40));
			
		// Function has 1 input and 1 output of same/different types
		Function<Integer,String> toString = x -> Integer.toString(x) ;
			System.out.println(toString.apply(50));
			
		// Consumer has 1 input but no output		
		Consumer<Integer> printOnly = x -> System.out.println("--- "+x+" ---");
			printOnly.accept(60);
			
		// Supplier has no output but it returns value		
		Supplier<Integer> noInputNeeded = () -> 70;
			System.out.println(noInputNeeded.get());
			
		// Both Operators(Binary and Unary) will accept and return only same data type
			
		// Binary Operator has 2 inputs of same type and output of the return same
		BinaryOperator<Integer> addition = (x,y) -> x+y;
			System.out.println(addition.apply(20, 60));
			
		// Unary Operator has 1 input and the output of same return type
		UnaryOperator<Integer> square = x -> x*x;
			System.out.println(square.apply(90));
	}

}
