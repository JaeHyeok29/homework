public class Calculator {
    public static void main(String[] args) {
        Calc calc = new Calc();
        Multiply mul = new Multiply();

        System.out.println(calc.plus(1, 1));
        System.out.println(mul.multiply(2, 6));
        
    }
}듬