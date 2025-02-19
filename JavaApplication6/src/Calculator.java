public class Calculator {
    
    public double power(double a, double b) {
        return Math.pow(a, b);
    }
    public double multiply (double a, double b) {
        return a*b;
    }
    
    public double divide (double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("На ноль делить нельзя!");
        }
        return a/b;
    }
    public double add (double a, double b){
        return (a + b);
    }
    public double subtract (double a, double b){
        return (a + b);
    }
}