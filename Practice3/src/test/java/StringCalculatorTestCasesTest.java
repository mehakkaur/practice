import junit.framework.TestCase;
import org.junit.Test;

public class StringCalculatorTestCasesTest extends TestCase {
    StringCalculator sc=new StringCalculator();
    @Test
    public void testReturnResultForEmptyString(){
    int addResult= sc.add("");
    //apply assert on result
        assertEquals(0,addResult);
}
}