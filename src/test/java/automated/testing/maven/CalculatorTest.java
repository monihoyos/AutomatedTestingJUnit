package automated.testing.maven;

import app.getxray.xray.testng.annotations.Requirement;
import app.getxray.xray.testng.annotations.XrayTest;
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
    @XrayTest(key = "TNP-5", summary = "addition of two numbers", description = "tests the sum of two positive integers", labels = "Calculator, sum")
    @Requirement(key = "TNP-12")
    public void addTwoNumbers(){
        Allure.step("Doing checks when add 2 numbers");
        Assert.assertEquals(20,calc.add(10,10));
    }

    @XrayTest(key = "TNP-6", summary = "addition of three numbers", description = "tests the sum of three positive integers", labels = "Calculator, sum")
    @Requirement(key = "TNP-12")
    @Test
    public void addThreeNumbers(){
        Allure.step("Doing checks when add 3 numbers");
        Assert.assertEquals(20,calc.add(5,5,10));
    }

    @XrayTest(key = "TNP-7", summary = "Subtraction of two numbers", description = "tests the subtract of two positive integers", labels = "Calculator, subtract")
    @Requirement(key = "TNP-12")
    @Test
    public void subtractTwoNumbers(){
        Allure.step("Doing checks when subtract 2 numbers");
        Assert.assertEquals(5,calc.subtract(10,5));
    }

    @XrayTest(key = "TNP-8", summary = "Subtraction of three numbers", description = "tests the subtract of two positive integers", labels = "Calculator, subtract")
    @Requirement(key = "TNP-12")
    @Test
    public void subtractThreeNumbers() {
        Allure.step("Doing checks when subtract 3 numbers");
        Assert.assertEquals(5,calc.subtract(20,10,5));
    }

}
