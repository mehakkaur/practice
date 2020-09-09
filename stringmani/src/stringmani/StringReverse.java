package stringmani;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringReverse {

	static String reverse = "";

	public static String reverse(String str) {
		// recursive condition, break recursive, apply condition.
		if (str == null || str.length() <= 1)
			return str;
		return reverse(str.substring(1)) + str.substring(0);
	}

	private static void pyramidOfNumbers(int num) {
		// for()?

	}

	private static void removeWhiteSpaces(String string) {
		// 1.Using inbuilt spaces.
		string = string.replace(" ", "");
		// return string;

		// 2.without inbuilt spaces
		String stringWithoutSpaces = "";
		char charArray[] = string.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if ((charArray[i] != ' ') && (charArray[i] != '\t')) {
				stringWithoutSpaces = stringWithoutSpaces + charArray[i];
			}
		}

	}

	private static void removeDublicatesFromString(String string) {

		// method1. add in hashset **find dublictaes
		Set set = new HashSet();
		// IMP AND SOMETHING NEW
		char temp1[] = string.toCharArray();
		for (char element : temp1) {
			if (!set.add(element)) {
				System.out.println("Duplicate Element : " + element);
			}
		}

		// method2. indexOf in new string check **remove dublictates
		String str = "";
		for (int i = 0; i < string.length(); i++) {
			// not present
			if (str.indexOf(string.charAt(i)) < 0) {
				str = str + string.charAt(i);
			}

		}
		// method3. do sorting of string.
		char temp[] = string.toCharArray();
		Arrays.sort(temp);

		// method4. use java8 to find dublicates. **remove dublicates
		Set<Character> uniqueElements = new HashSet<>();
		uniqueElements = string.chars().mapToObj(i -> (char) i).filter(i -> !set.add(i)).collect(Collectors.toSet());
		System.out.println(uniqueElements);
	}

	private static void Anagram(String string, String string2) {
		// method1.
		// .remove white spaces-> to lower both-> sort-> compare

		// method2. use two hashmap<character,count>

		// question? large book, small string. how to check if all chars are present in
		// dic?
		// Sring segmented-> recursion
	}

	public static void main(String[] args) {
//		stack:
//		abc ->bc+a
//		bc->c+b+a
//		c-> c+b+a
		// 1.
//		reverse("abc");
//		// 2.
//		pyramidOfNumbers(4);
//		String str1 = "me  h k ";
//		// 3.
//		// Concept: value of str1 not changed because java is pass by value. If want
//		// change, then make change in refernec and return it.
//		System.out.println(removeWhiteSpaces(str1));
//		// 4.
//		removeDublicatesFromString("memhk");
//		// 5. find dublicates in array
//		// 6.
//		Anagram("mehak", "keham");
		// 7.
//		sumOfAllDigits(1234);
		// 8. sum of all elements in an array
//		sumOfAllDigitsInArray();
		// 9.
		secondLargestDigit(new int[] { 5, 3, 1, 6 });
		// 10.
		largestNumberLessThanGivenNumberAndWithoutGivenDigit(123, 2);
		// 11. nlogn but each digit is visited as many times as want.
		findAllPairSumEqualToGivenDigit(new int[] { 4, 6, 5, -10, 8, 5, 20 }, 10);
		// 12.
		removeDublicatesFromListAndArray();
		//13. Collection.sort()/comparator
//		sortTextFile();
//		//14.
//		mostRepetativeWordsInTextFile();
//		//15.
		longestSubStringWithoutRepetingcharacters("javva");
//		//16.
//		swapTwoStringsWithoutsUsing3rdString();
//		//17. https://javaconceptoftheday.com/how-to-sort-an-arraylist-in-java/
//		sortArraylist();
//		//18.
//		ReverseArraylist();
//		//19.
//		ArrayRotation();
//		//20.
//		unionandintersectionofmultiplearrays();
		//21.
	StringPermutation("JSP");
		
		

	}




//7.
	private static void sumOfAllDigits(int num) {
		int i = 0;
		while (num > 0) {
			i = i + num % 10;
			num = num / 10;
		}
		System.out.println(i);
	}

	// 8.
	private static void sumOfAllDigitsInArray() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		int i = list.stream().reduce(0, Integer::sum);
		System.out.println(i);

	}

	// 9.
	private static void secondLargestDigit(int[] arr) {
		// binary nope.from left
		// insertion from left
		// selection from right.* o(n)
		int largest = arr[0];
		int secondlargest = arr[1];
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i++] > arr[i]) {
				secondlargest = largest;
				largest = arr[i++];

			}
		}

		System.out.println(secondlargest);
	}

	// 10.
	private static void largestNumberLessThanGivenNumberAndWithoutGivenDigit(int number, int digit) {
		// learning: to separate digits /,% is one way. Convert number to string is
		// other way.

		for (int i = number; i > 0; i--) {
			if (!Integer.toString(i).contains(Integer.toString(digit))) {
				System.out.println(i);
				break;
			}
		}

	}

	// 11.
	private static void findAllPairSumEqualToGivenDigit(int[] arr, int sum) {
		// method1. sort nd then do idhar udhar
		Arrays.sort(arr);
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] + arr[j] == sum) {
				System.out.println(arr[i] + " " + arr[j]);
				i++;
				j--;
			} else if ((arr[i] + arr[j]) < sum)
				i++;
			else
				j--;
		}
		// return count
		// methods2. use hashmap to check if sum-num=result present in
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int ii = 0; ii < arr.length; ii++) {
			if (!hm.containsKey(arr[ii]))
				hm.put(arr[ii], 0);
			hm.put(arr[ii], hm.get(arr[ii]) + 1);
		}
		int twice_count = 0;

		for (int ii = 0; ii < arr.length; ii++) {
			// another way to check if hashmap conatins
//	            if(hm.get(sum-arr[i])!=null)
//	            	twice_count+=
		}
	}

	// 12.
	private static void removeDublicatesFromListAndArray() {
		List<Integer> list = Arrays.asList(1, 2, 4, 1, 4, 0);

		// method1. using set
		Set<Integer> set = new LinkedHashSet<>();
		set.addAll(list);
		System.out.println(set);

		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(4);
		list1.add(1);
		list1.add(4);
		list1.add(0);
		// method2. without using set o(n)
		for (int i = 0; i < list1.size(); i++) {
			for (int j = i + 1; j < list1.size(); j++) {
				//FOR LIST
				if (list1.get(i) == list1.get(j)) {
					//ERROR: cant remove from list created with arrays.as list
					//list.remove(j);
					list1.remove(j);
					j--;
				}
				//FOR ARRAY
//				 if(arrayWithDuplicates[i] == arrayWithDuplicates[j])
//	                {
//	                    arrayWithDuplicates[j] = arrayWithDuplicates[noOfUniqueElements-1];
//	                    noOfUniqueElements--;
//	                    j--;
//	                }
			}
		}
		System.out.println(list1);

	}
	
	//17.
private static void longestSubStringWithoutRepetingcharacters(String inputString) {
	
        //Convert inputString to charArray
         
        char[] charArray = inputString.toCharArray();
         
        //Initialization
         
        String longestSubstring = null;
         
        int longestSubstringLength = 0;
         
        //Creating LinkedHashMap with characters as keys and their position as values.
         
        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();
         
        //Iterating through charArray
         
        for (int i = 0; i < charArray.length; i++) 
        {
            char ch = charArray[i];
         
            //If ch is not present in charPosMap, adding ch into charPosMap along with its position
             
            if(!charPosMap.containsKey(ch))
            {
                charPosMap.put(ch, i);
            }
             
            //If ch is already present in charPosMap, reposioning the cursor i to the position of ch and clearing the charPosMap
             
            else
            {   
                i = charPosMap.get(ch);
                 
                charPosMap.clear();
            }
             
            //Updating longestSubstring and longestSubstringLength
             
            if(charPosMap.size() > longestSubstringLength)
            {
                longestSubstringLength = charPosMap.size();
                 
                longestSubstring = charPosMap.keySet().toString();
            }
        }
         
        System.out.println("Input String : "+inputString);
         
        System.out.println("The longest substring : "+longestSubstring);
         
        System.out.println("The longest Substring Length : "+longestSubstringLength);
    }
		
	
	//21.
	static public void StringPermutation(String input)
    {
        StringPermutation("", input);
    }
     
    private static void StringPermutation(String permutation, String input)
    {   
        if(input.length() == 0)
        {
            System.out.println(permutation);
        }
        else
        {
            for (int i = 0; i < input.length(); i++)
            {   
                StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()));
            }
        }
    }
}
