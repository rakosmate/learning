package calculator;

public class Calculator {

    public static void main(String[] args) {

        addition(2.1f, 8.9f);
        extraction(8.5f, 1.5f);
        division(8.4f, 0.3f);
        multiplication(2.2f, 4.5f);

        addition(2, 8);
        extraction(8, 1);
        division(8, 2);
        multiplication(2, 4);
    }

    public static void addition(float number, float number2) {
        System.out.println("addition: " + (number + number2));
    }

    public static void extraction(float number, float number2) {
        System.out.println("extraction: " + (number - number2));
    }

    public static void division(float number, float number2) {
        System.out.println("division: " + (number / number2));
    }

    public static void multiplication(float number, float number2) {
        System.out.println("multiplication: " + (number * number2));
    }

    public static void printText(String name) {
        System.out.print(name);
    }
}
