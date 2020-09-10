package stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class uniqueSquares {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		//get list of unique squares
		List<Integer> squaresList = 
				numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		
		squaresList.forEach(System.out::println);
		
		
		List<Integer> numbers1 = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		//IntSummaryStatistics stats = numbers1.stream().mapToInt((x) -> x).summaryStatistics();

		IntSummaryStatistics stats=numbers1.stream().mapToInt(i->i).summaryStatistics();
		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());
		

	}

}
