import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MachineTest {
    Machine machine;

    @BeforeEach
    void setUp() {
        this.machine = new Machine();
    }

    @Test
    void deposit() {
        this.machine.deposit(50);
        Assertions.assertEquals(50, this.machine.getBalance());
    }

    @Test
    void play() {
        this.machine.deposit(100);
        this.machine.play(50);
        Assertions.assertTrue(this.machine.getBalance() >= 50, "Balance should be greater than or equal to 50");
        this.machine.play(50);
        Assertions.assertTrue(this.machine.getBalance() >= 0, "Balance should be greater than or equal to 0");
        this.machine.play(50);
        Assertions.assertTrue(this.machine.getBalance() >= 0, "Balance should be greater than or equal to 0");
    }
}