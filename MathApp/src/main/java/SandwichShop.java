import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double regPrice = 5.45;
        double lgPrice = 8.65;

        System.out.println("select your size, 1 for reg and 2 for lg");
        int sizeChoice = scanner.nextInt();

        double basePrice = (sizeChoice == 1) ? regPrice : lgPrice;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = keyboard.nextInt();
        System.out.println("Age: " + age);
        keyboard.nextLine();

        double discount = 0.0;
        if (age <= 17) {
            discount = .10;
        } else if (age >= 65) {
                discount = .20;
        }
        double finalPrice = basePrice * (1 - discount);
        System.out.printf("The cost of your order is: $%.2f%n" , finalPrice);

        scanner.close();
    }
}
