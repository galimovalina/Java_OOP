package Seminar_6.O;

public class Main {
    public static void main(String[] args) {
        Addition add=new Addition(1.0, 1.0);
        Calculator calculator=new Calculator();
        calculator.calculatorCorrect2(add);
        System.out.println(add.getResult());
    }
}
