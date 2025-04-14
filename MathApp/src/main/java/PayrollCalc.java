import java.util.Scanner;

public class PayrollCalc {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName = keyboard.nextLine();
        System.out.println("First Name: " + firstName);

        float hoursWorked = 25.67f;
        System.out.println(hoursWorked);

        float grossPay = 5200.77f;
        System.out.printf("Gross Pay: $%.2f", grossPay);

    }
}
