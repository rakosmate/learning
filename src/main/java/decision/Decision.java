package decision;

public class Decision {

    public static void main(String[] args) {
        isCatOrNot("dog");
        isCatOrNot("cat");
        isCatOrNot("parrot");
        isCatOrNot("pig");
        isCatOrNot("lion");
        isBirdOrNot("bird");
        isBirdOrNot("cat");
        isRabbitOrNot("rabbit", true);
        isRabbitOrNot("Rabbit", false);
        isRabbitOrNot("lion", true);

    }

    public static void isCatOrNot(String animal) {
        System.out.print(animal + " > ");
        if (animal == "cat") {
            System.out.println("This is a cat.");
        } else if (animal == "dog") {
            System.out.println("This is a dog.");
        } else if (animal == "parrot") {
            System.out.println("This is a parrot.");
        } else if (animal == "lion") {
            System.out.println("This is a lion.");
        } else {
            System.out.println("404");
        }
    }

    public static void isBirdOrNot(String animal) {
        System.out.print(animal + " > ");
        boolean isBird = false;

        if (animal == "bird") {
            isBird = true;
        }

        if (isBird == true) {
            System.out.println("This is a bird.");
        } else {
            System.out.println("This is not a bird.");
        }
    }

    public static void isRabbitOrNot(String animal, boolean isYoung) {
        System.out.print(animal + " > ");
        if ((animal == "rabbit" || animal == "Rabbit") && isYoung == true) {
            System.out.println("This is a young rabbit.");
        } else if ((animal == "rabbit" || animal == "Rabbit") && isYoung == false) {
            System.out.println("This is an old rabbit.");
        } else {
            System.out.println("This is not a rabbit.");
        }
    }

}
