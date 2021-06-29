package variables;

public class Variables {

    public static void main(String[] args) {
        printText("Matt");
        printText("Csilla");
        printText("True");
        printText("Anna");
        printText("Karoly");
        printIntNumbers(123);
        printBoolean(true);
        printBoolean(false);
        printFloatNumbers(456.645f);
        printDoubleNumbers(12.456785524646464347246464919764347);
        printCharacter('&');

        Cat cat = new Cat();
        cat.printCatNames("Kormos");
    }

    public static void printText(String name) {
        System.out.println(name);
    }

    public static void printIntNumbers(int number) {
        System.out.println(number);
    }

    public static void printBoolean(boolean decision) {
        System.out.println(decision);
    }

    public static void printFloatNumbers(float number) {
        System.out.println(number);
    }

    public static void printDoubleNumbers(double number) {
        System.out.println(number);
    }

    public static void printCharacter(char character) {
        System.out.println(character);
    }

}
