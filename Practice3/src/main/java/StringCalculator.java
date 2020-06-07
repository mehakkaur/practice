import java.util.stream.Stream;

public class StringCalculator {
    //First TEST THEN CODE-> TDD
    public int add(String numbers) {
        int result = 0;
        if (numbers == "")
            result= 0;
        else {
            String[] stringArray = numbers.split(",|\\n");
            int [] intArr = Stream.of(stringArray).mapToInt(strInt->Integer.parseInt(strInt)).toArray();
            for(int num:intArr){
                result=result+num;
            }
        }
        return result;
    }

}

