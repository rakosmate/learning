package calculator2;

public class Calculator2 {

    public static void main(String[] args) {
        addition(2, 8);
        extraction(7, 5);
        multiplication(8, 4);
        division(8, 4);
    }

    public static void addition(int number, int number2) {
        int result = number + number2;
        System.out.println("addition: " + result);
    }

    public static void extraction(int number, int number2) {
        int result = number - number2;
        System.out.println("extraction: " + result);
    }

    public static void multiplication(int number, int number2) {
        int result = number * number2;
        System.out.println("multiplication: " + result);
    }

    public static void division(int number, int number2) {
        int result = number / number2;
        System.out.println("division: " + result);
    }

}
