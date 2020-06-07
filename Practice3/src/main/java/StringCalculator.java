import java.util.stream.Stream;

public class StringCalculator {
    //First TEST THEN CODE-> TDD
    public static int add(String numbers) {
        int result = 0;
        String delimiter = ",";
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
                        numbers = numbers.substring(numbers.indexOf("\n") + 1, numbers.length());

                    }
                } else
                    delimiter = delimiter.concat("|\n");
            }

            //find sum of numbers
            String[] stringArray = numbers.split(delimiter);
            int[] intArr = Stream.of(stringArray).mapToInt(strInt -> Integer.parseInt(strInt)).toArray();
            for (int num : intArr) {
                result = result + num;
            }
        }
        return result;
    }

}

