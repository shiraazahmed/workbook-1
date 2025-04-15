import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        //Step 1
        System.out.println("Grab Your toothbrush");
        System.out.println("Apply toothpaste on your brush");
        System.out.println("Now brush your teeth");

        //Step 2
        Scanner keyboard = new Scanner(System.in);
                System.out.println("What is the name of your favorite TV show?");
                String message = ("What is the name of your favorite TV show?");
                String string = keyboard.nextLine();
                System.out.println("Intresting!") ;



        //Step 3
        int x = 5;
        int y = 5;

        int sum = x + y;


        char operator = '+';
        String message2 = String.format("%d %c %d = %d", x, operator, y, sum);
        System.out.println(message2);



    }
}
