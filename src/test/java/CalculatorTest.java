import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp(){
        this.calculator = new Calculator();
    }

    @Test
    public void addTest(){
        assertEquals(this.calculator.add(1,2),3);
    }

    @Test
    public void multiplicationTest(){
        assertEquals(this.calculator.multiplication(1,2),2);
    }
}
