package functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Functions {
	
	private static class Mymath {
		protected static Integer functionalTriple (Integer x) {
			return x*3;
		}
	}

	public static void main(String[] args) {
	
		Function<Integer, Integer> myTriple = Mymath::functionalTriple;
		System.out.println(myTriple.apply(5));
		
		Function<Integer, Integer> lambdaTriple = (Integer x) -> x*3;
		System.out.println(lambdaTriple.apply(5));
		
		BiFunction<Integer, Integer, Integer> biTriple = (x,y) -> x*y*3;
		System.out.println(biTriple.apply(3, 3));
		
		Trifunction<Integer, Integer, Integer, Integer> triTriple = (x,y,z) -> x*y*z*3;
		System.out.println(triTriple.apply(3, 4, 5));
		
		NoArgsFunction<Integer> noArgsTriple = () -> 3*3;
		System.out.println(noArgsTriple.apply());
	}

}
