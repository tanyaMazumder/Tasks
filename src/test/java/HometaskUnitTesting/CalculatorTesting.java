package HometaskUnitTesting;

import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTesting {
    int a, b, c;
    double d, e;
    Calculator cal;

    @Before
    public void setUp(){
        cal = new Calculator();
        a=30;
        b=10;
        c=0;
        d=90.0;
        e=0.0;
    }

    @Test
    public void addTwoNumbers() {
        assertEquals(cal.sum(a,b), 30);
    }

    @Test
    public void subTwoNumbers() {
        assertEquals(cal.sub(a,b), 10);
    }

    @Test
    public void multiplyTwoNumbers() {
        assertEquals(cal.mult(a,b), 200);
    }

    @Test
    public void divideTwoNumbers() {
        assertEquals(cal.div(c,b), 0);
    }

    @Test
    public void cosNumber() {
        assertEquals((Object) cal.cos(d), (Object) 0.8939966636005579);
    }

    @After
    public void packUp(){
        System.out.println("After is called");
    }
}
