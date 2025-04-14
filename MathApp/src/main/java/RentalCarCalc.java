import java.util.Scanner;
 class RentalCarCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double basicCarRental = 29.99;
        double totalTagCost = 3.95;
        double gpsCost = 2.95;
        double rdSideAssist = 3.95;
        double underageCharge = .30;

        System.out.print("Pickup date: ");
        String pickupDate = scanner.nextLine();


        System.out.print("Number of rental days: ");
        int rentalDays = scanner.nextInt();

        System.out.print("Your age: ");
        int age = scanner.nextInt();

        System.out.print("Toll tag(yes/no) ? ");
        boolean wantsTollTag = scanner.next().equalsIgnoreCase("yes");

        System.out.print("GPS(yes/no) ? ");
        boolean wantsGPS = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Roadside assistance yes/no) ? ");
        boolean wantsRoadsideAssistance = scanner.next().equalsIgnoreCase("yes");

        double totalCost = rentalDays * basicCarRental;

        if (age < 25) {
            totalCost += totalCost * underageCharge;
        }
        if (wantsTollTag) totalCost += rentalDays * totalTagCost;
        if (wantsGPS) totalCost += rentalDays * gpsCost;
        if (wantsRoadsideAssistance) totalCost += rentalDays * rdSideAssist;

        System.out.printf("Total cost for renting for renting the car on %s for %d days: $%.2f%n" , pickupDate, rentalDays, totalCost);

        scanner.close();


    }
}
