import app.models.Calculator;

public class HomeWorkLesson16LocalRepo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.adding(6, 4));
        System.out.println(calculator.subtracting(6, 4));
        System.out.println(calculator.multiplication(6, 4));
        System.out.println(calculator.division(6, 2));
    }
}
