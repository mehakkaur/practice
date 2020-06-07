import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StringCalculator {
    //First TEST THEN CODE-> TDD
    public static int add(String numbers) {
        int result = 0;
        String delimiter = ",|\n";
        if (numbers == "")
            result = 0;
        else {

            // if string start with "//",delimiter is given in string itself else default delimiter is comma.
            if (numbers.contains("\n")) {
                if (numbers.startsWith("//")) {
                    String delimiterstring = numbers.substring(0, numbers.indexOf("\n"));

                    //if string contains only "/n" but not "//", add "/n in delimiter as well".
                    if (delimiterstring.contains("//")) {
                        String delimiterList = numbers.substring(2, numbers.indexOf("\n"));
                        if (delimiterList.length() == 1)
                            delimiter = delimiterList;

                        //update string and get substring after \n for adding numbers.
                        numbers = numbers.substring(numbers.indexOf("\n") + 1);

                    }
                }

            }

            //find sum of numbers with function to find the delimiter
            String[] stringArray = numbers.split(delimiter);
            int[] intArr = Stream.of(stringArray).mapToInt(strInt -> Integer.parseInt(strInt)).toArray();
            List<Integer> negativeNumList = new ArrayList<>();
            for (int num : intArr) {
                if (num < 0)
                    negativeNumList.add(num);
                else if(num<=1000)
                    result = result + num;
            }
            if (negativeNumList.size() > 0) {
                throw new RuntimeException("Negatives not allowed: " + negativeNumList.toString());
            }
        }

        return result;
    }



}