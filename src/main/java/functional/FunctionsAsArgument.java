package functional;

import java.util.function.BiFunction;

public class FunctionsAsArgument {
	
	protected static Integer add(Integer a,Integer b) {
		return a+b;
	};
	
	protected static Integer combine2and3(BiFunction<Integer, Integer, Integer> b) {
		return b.apply(2, 3);
	}

	public static void main(String[] args) {
		System.out.println(combine2and3(FunctionsAsArgument::add));
	}
}
