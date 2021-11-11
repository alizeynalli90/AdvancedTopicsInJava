package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalStreams {
	
	static Integer[] array = {1,2,3,4,5,6};
	static List<Integer> list = new ArrayList<Integer>(Arrays.asList(array)) ;

	static Function<Integer, Integer> toSquare = (a) -> a*a;
	static Predicate<Integer> isEven = (a) -> a % 2 == 0;
	static BinaryOperator<Integer> toSum = (acc, a) -> {
		Integer result = acc +a;
		System.out.println("acc: "+acc+"a: "+a+"result: "+result);
		return result;
	};
	
	static Function<Integer, Integer> add = (a) -> a+a;
	static Function<Integer, Integer> multiple = (a) -> a*a;

	static List<Integer> squared = list.stream().map(toSquare).collect(Collectors.toList());
	static List<Integer> onlyEven = list.stream().filter(isEven).collect(Collectors.toList());
	static List<Integer> onlyParallelEven = list.parallelStream().filter(isEven).collect(Collectors.toList());
	// Collectors => joining, grouping, partitioning
	static Integer sum = list.stream().reduce(0, toSum);
	public static void main(String[] args) {
	
		System.out.println(squared);
		// System.out.println(onlyEven);
		System.out.println(onlyParallelEven);
		System.out.println(sum);
		System.out.println(add.andThen(multiple).apply(5));
	}
}
