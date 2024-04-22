
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Machine machine = new Machine();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter 'deposit' to deposit money, 'play' to play, or 'quit' to quit:");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("quit")) {
                scanner.close();
                return;
            }

            System.out.println("Enter the amount:");
            int amount = scanner.nextInt();
            scanner.nextLine();
            if (choice.equalsIgnoreCase("deposit")) {
                machine.deposit(amount);
            } else if (choice.equalsIgnoreCase("play")) {
                machine.play(amount);
            } else {
                System.out.println("Invalid choice. Please enter 'deposit', 'play', or 'quit'.");
            }
        }
    }
}
