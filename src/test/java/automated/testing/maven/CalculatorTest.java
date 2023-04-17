package automated.testing.maven;

import automated.testing.maven.calculatorProject.Calculator;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator calc;

    @BeforeMethod
    public void setUp(){
        calc=new Calculator();
    }

    @Test
    public void addTwoNumbers(){
        Allure.step("Doing checks when add 2 numbers");
        Assert.assertEquals(20,calc.add(10,10));
    }

    @Test
    public void addThreeNumbers(){
        Allure.step("Doing checks when add 3 numbers");
        Assert.assertEquals(20,calc.add(5,5,10));
    }

    @Test
    public void subtractTwoNumbers(){
        Allure.step("Doing checks when subtract 2 numbers");
        Assert.assertEquals(5,calc.subtract(10,5));
    }

    @Test
    public void subtractThreeNumbers() {
        Allure.step("Doing checks when subtract 3 numbers");
        Assert.assertEquals(5,calc.subtract(20,10,5));
    }

}
