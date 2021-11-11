package functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class HigherOrderFunctions {
	
	static Function<String, String> name = (a) -> a;
	
	static Function<Function<String, String>, Function<String, String>> sentence = 
			(func) -> (b) -> {
				return func.apply("My Name is "+b);
			} ;
	
	static Function<String, String> fullSentence = 	sentence.apply(name); 
	
	public static void main(String[] args) {
		System.out.println(fullSentence.apply("Ali Zeynalli"));
	}

}
