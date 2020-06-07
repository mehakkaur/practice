import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StringCalculatorTestCasesTest {
    StringCalculator sc = new StringCalculator();

    @Test()
    @Order(1)
    public void testReturnResultForEmptyString() {
        int addResult = sc.add("");
        //apply assert on result
        Assert.assertEquals(0, addResult);
        //
    }

    @Test
    @Order(2)
    public void addUptoTwoNumbersWithCommaAsDelimiter() {
        int value1=1,value2=2;
        int addResult1 = sc.add("1");
        int addResult2 = sc.add("1,2");
        Assert.assertEquals(1, addResult1);
        Assert.assertEquals(1+2, addResult2);
    }
    @Test
    @Order(3)
    public void addUptoTwoNumbersWithCommaAndNewLineAsDelimiter() {

        int addResult1 = sc.add("1\n2,3");
        Assert.assertEquals(6, addResult1);
        int addResult2 = sc.add("1\n2,3\n4");
        Assert.assertEquals(10, addResult2);
    }
    @Test
    @Order(4)
    public void addUptoTwoNumbersWithAsDelimiter() {

        int addResult = sc.add("//;\n1;2;3");
        Assert.assertEquals(6, addResult);
    }
}