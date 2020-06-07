import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StringCalculatorTestCasesTest {

    @Test()
    @Order(1)
    public void testReturnResultForEmptyString() {
        //apply assert on result
        Assert.assertEquals(0, StringCalculator.add(""));

    }

    @Test
    @Order(2)
    public void addUptoTwoNumbersWithCommaAsDelimiter() {

        Assert.assertEquals(1, StringCalculator.add("1"));
        Assert.assertEquals(1 + 2, StringCalculator.add("1,2"));
    }

    @Test
    @Order(3)
    public void addNumbersWithCommaAndNewLineAsDelimiter() {

        Assert.assertEquals(6, StringCalculator.add("1\n2,3"));
        Assert.assertEquals(10, StringCalculator.add("1\n2,3\n4"));
    }

    @Test
    @Order(4)
    public void addNumbersWithDelimiterGivenInString() {

        Assert.assertEquals(6, StringCalculator.add("//;\n1;2;3"));
    }

    @Test(expected = RuntimeException.class)
    @Order(5)
    public void verifyExceptionIfNegativeNumberIsPassed() {
        int addResult = StringCalculator.add("-1");
    }

    @Test
    @Order(6)
    public void verifyExceptionIfMultipleNegativeNumbersArePassed() {
        String exceptionMessage = null;
        try {
            int addResult = StringCalculator.add("-1,2,-3");
        } catch (Exception e) {
            exceptionMessage = e.getMessage();
        }
        Assert.assertEquals("Negatives not allowed: [-1, -3]", exceptionMessage);
    }
    @Test
    @Order(7)
    public void skipNumberGreaterThanThousand() {
        Assert.assertEquals(3, StringCalculator.add("1,1001,2"));
    }
}