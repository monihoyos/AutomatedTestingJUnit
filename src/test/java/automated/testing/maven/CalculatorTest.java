package automated.testing.maven;

import automated.testing.maven.calculatorProject.Calculator;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class CalculatorTest {

    Calculator calc;

    @Before
    public void setUp(){
        calc=new Calculator();
    }

    @Test
    public void addTwoNumbers(){
        Assert.assertEquals(20,calc.add(10,10));
    }

    @Test
    public void addThreeNumbers(){
        Assert.assertEquals(20,calc.add(5,5,10));
    }

    @Test
    public void subtractTwoNumbers(){
        Assert.assertEquals(5,calc.subtract(10,5));
    }

    @Test
    public void subtractThreeNumbers(){
        Assert.assertEquals(5,calc.subtract(20,10,5));
    }
}
