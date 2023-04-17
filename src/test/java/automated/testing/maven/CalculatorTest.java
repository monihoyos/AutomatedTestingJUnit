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

  /*  @XrayTest(key = "TNP-5", summary = "addition of two numbers", description = "tests the sum of two positive integers", labels = "Calculator, sum")
    Summary and description passed in the attributes are not yet supported in Cloud version of Xray.
    https://docs.getxray.app/display/XRAYCLOUD/Testing+web+applications+using+Selenium+and+TestNG+in+Java*/

    @Test
    @XrayTest(key="TNP-5")
    @Requirement(key="TNP-12")
    public void addTwoNumbers(){
        Allure.step("Doing checks when add 2 numbers");
        Assert.assertEquals(20,calc.add(10,10));
    }

    @XrayTest(key="TNP-6")
    @Requirement(key="TNP-12")
    @Test
    public void addThreeNumbers(){
        Allure.step("Doing checks when add 3 numbers");
        Assert.assertEquals(20,calc.add(5,5,10));
    }

    @XrayTest(key="TNP-7")
    @Requirement(key="TNP-12")
    @Test
    public void subtractTwoNumbers(){
        Allure.step("Doing checks when subtract 2 numbers");
        Assert.assertEquals(5,calc.subtract(10,5));
    }

    @XrayTest(key="TNP-8")
    @Requirement(key="TNP-12")
    @Test
    public void subtractThreeNumbers() {
        Allure.step("Doing checks when subtract 3 numbers");
        Assert.assertEquals(5,calc.subtract(20,10,5));
    }

    @Test
    @XrayTest(key="TNP-15")
    @Requirement(key="TNP-12")
    public void multiplyTwoNumbers(){
        Allure.step("Doing checks when add 2 numbers");
        Assert.assertEquals(100,calc.multiply(10,10));
    }

}
