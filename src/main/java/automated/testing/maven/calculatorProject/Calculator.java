package automated.testing.maven.calculatorProject;

public class Calculator {

    public int add (int num1, int num2 ){
        return num1 + num2;
    }

    public int add (int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public int subtract (int num1, int num2, int num3) {
        return num1 - num2 - num3;
    }
    public int subtract (int num1, int num2 ){
        return num1 - num2;
    }
    public double multiply (double num1, double num2){
        return num1*num2;
    }
}
