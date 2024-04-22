import java.util.ArrayList;
import java.util.Arrays;

public class Machine {
    int balance = 0;
    ArrayList<String> symbols = new ArrayList<>(Arrays.asList("🍒", "🍊", "🍋", "🍉", "🍇", "🍀"));
    public Machine() {
    }
    public void deposit(int amount) {
        balance += amount;
    }
    public void play(int amount) {
        balance -= amount;
        String[] result = new String[3];
        for (int i = 0; i < 3; i++) {
            result[i] = symbols.get((int) (Math.random() * symbols.size()));
        }
        System.out.println(String.join(" ", result));
        if (result[0].equals(result[1]) && result[1].equals(result[2])) {
            balance += amount * 10;
            System.out.println("You win! Your balance is now " + balance);
        } else {
            System.out.println("You lose! Your balance is now " + balance);
        }
    }
    public int getBalance() {
        return balance;
    }
}
