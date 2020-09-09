package stringmani;

/*
Write a method that takes a list of numbers and a target sum. 
Return true if the list contains two numbers that sum to target

Example:
    numbers: [7, 10, 3, 1]
    target: 4
    output: true

Example:
    numbers: [7, 10, 3, 1]
    target: 3
    output: false
    
*/
import java.util.*;

public class DoubleSum {
	public static void main(String[] args) {
		// Create a list of Integers
		List<Integer> numbers = Arrays.asList(7, 10, 3, 5,-1);
		int target = 4;
		System.out.println(is2Sum(numbers, 4));
	}

	public static boolean is2Sum(List<Integer> numbers, int target) {
		int expected = 0;
		boolean status = false;
		
		for(int i=0;i<numbers.size();i++) {
			int num = numbers.get(i);

			
				expected = target - num;//1
				
				for(int j=i+1;j<numbers.size();j++) {
				if(expected==numbers.get(j))
					status=true;
				else status =false;
				}
					
	//	}
		}

		return status;
	}
}
