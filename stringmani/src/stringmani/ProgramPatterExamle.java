package stringmani;

import java.util.LinkedList;
import java.util.List;

public class ProgramPatterExamle {

	public static void main(String[] args) {
		MaximumSumSubarrayContinousofSize(3, new int[] { 2, 1, 5, 1, 3, 2 });
	//	MaximumSumwithAnyKElements(3, new int[] { 2, 1, 5, 1, 3, 2 });
	//	smallesSubArrayWithGivenSum(7,new int[]{2, 1, 5, 2, 3, 2});
	}

	private static void smallesSubArrayWithGivenSum(int sum, int[] arr) {
		int windowSum = 0, minLength = Integer.MAX_VALUE;
	    int windowStart = 0;
		for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
		      windowSum += arr[windowEnd]; // add the next element
		      // shrink the window as small as possible until the 'windowSum' is smaller than 'S'
		      while (windowSum >= sum) {
		        minLength = Math.min(minLength, windowEnd - windowStart + 1);
		        windowSum -= arr[windowStart]; // subtract the element going out
		        windowStart++; // slide the window ahead
		      }
		    }
		
	}

	private static void MaximumSumSubarrayContinousofSize(int window, int[] arr) {
		List<Integer> list = new LinkedList<>();
		list.add(arr[0]); // o(1)
		list.add(arr[1]);
		list.add(arr[2]);

//		// method1. add elements in list(n*window)
//		int maxsum = 0;
//		for (int i = 0; i < arr.length - 2; i++) {
//			int windowsum = 0;
//
//			for (int j = i; j < i + window; j++) {
//				windowsum += arr[j];
//			}
//			maxsum = Math.max(windowsum, maxsum);
//		}
//		System.out.println(maxsum);

		// window2. (n) we dont need tocalcualte sum of overlapping of next widnow, just
		// shift window by one and remove exiting element from sum
//		int maxsum1 = 0;
//		int windowsum=0;
//		for (int i = 0; i < arr.length; i++) {
//
//			// after 3 elemnts in our case
//			
//			if (i > window - 1) {
//				windowsum = windowsum - arr[i - window] + arr[i];
//				maxsum1 = Math.max(windowsum, maxsum1);
//
//			} else
//			{
//				maxsum1 += arr[i];
//				windowsum=maxsum1;
//			}
//
//		}
//		System.out.println(maxsum1);
		
		//method3. 
//		 for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
//		      System.out.print("for iteration: "+ windowEnd);
//		      windowSum += arr[windowEnd]; // add the next element
//		      // slide the window, we don't need to slide if we've not hit the required window size of 'k'
//		     
//		      if (windowEnd >= k - 1) {
//		         System.out.println("maxsum "+maxSum+" windowSum "+ windowSum);
//		        maxSum = Math.max(maxSum, windowSum);
//		        
//		        windowSum -= arr[windowStart]; // subtract the element going out
//		         System.out.println(" windowSum "+ windowSum);
//		        windowStart++; // slide the window ahead
//		      }
//		    }
		
		//output
//		for iteration: 0for iteration: 1for iteration: 2maxsum 0 windowSum 8
//		 windowSum 6
//		for iteration: 3maxsum 8 windowSum 7
//		 windowSum 6
//		for iteration: 4maxsum 8 windowSum 9
//		 windowSum 4
//		for iteration: 5maxsum 9 windowSum 6
//		 windowSum 5
//		Maximum sum of a subarray of size K: 9
	}

	private static void MaximumSumwithAnyKElements(int window, int[] arr) {
		// complexity 3*3 =9
		// method1.-> bubble sort, sort 3 last elements
		int maxSum = 0;
		for (int i = 0; i < window; i++) {
			int j = 0;
			for (; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			maxSum += arr[j];

		}
		System.out.println(maxSum);
	}

}
