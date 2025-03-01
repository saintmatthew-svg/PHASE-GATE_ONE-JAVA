import java.util.Scanner;
import java.util.Random;

public class AirlineReservation {
    public static int firstClassSeats = 5;
    public static int economySeats = 5;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Please type 1 for First Class and 2 for Economy:");
            int choice = input.nextInt();

            if (choice == 1) {
                handleFirstClass(input);
            } else if (choice == 2) {
                handleEconomy(input);
            } else {
                System.out.println("Invalid input.");
            }
        }
    }

    public static void handleFirstClass(Scanner input) {
        if (!assignFirstClassSeat()) {
            System.out.println("First class is full. Would you like Economy? (yes/no)");
            if (input.next().equalsIgnoreCase("yes")) {
                assignEconomySeat();
            } else {
                System.out.println("Next flight leaves in 3 hours.");
            }
        }
    }

    public static void handleEconomy(Scanner input) {
        if (!assignEconomySeat()) {
            System.out.println("Economy is full. Would you like First Class? (yes/no)");
            if (input.next().equalsIgnoreCase("yes")) {
                assignFirstClassSeat();
            } else {
                System.out.println("Next flight leaves in 3 hours.");
            }
        }
    }

    public static boolean assignFirstClassSeat() {
        if (firstClassSeats > 0) {
            firstClassSeats--;
            System.out.println("Boarding pass: First Class Seat " + (5 - firstClassSeats));
            return true;
        }
        return false;
    }

    public static boolean assignEconomySeat() {
        if (economySeats > 0) {
            economySeats--;
            System.out.println("Boarding pass: Economy Seat " + (10 - economySeats));
            return true;
        }
        return false;
    }
}
