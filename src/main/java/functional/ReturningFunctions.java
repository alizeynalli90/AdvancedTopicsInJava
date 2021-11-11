package functional;

import java.util.function.Function;

public class ReturningFunctions {
	
	static Function<Integer, Integer> functionMaker(Integer y){
		return (Integer x) -> x*y; 
	}

	static Function<Integer, Integer> timesTwo = functionMaker(2);
	static Function<Integer, Integer> timesThree = functionMaker(3);
	
	public static void main(String[] args) {
		System.out.println(timesTwo.apply(4));
		System.out.println(timesThree.apply(4));
	}
	
}
