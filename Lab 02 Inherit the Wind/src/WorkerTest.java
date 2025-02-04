import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WorkerTest {

    @Test
    public void testCalculateWeeklyPay() {
        Worker worker = new Worker("John", "Doe", "12345", "Mr.", 1990, 15.0);
        assertEquals(600.0, worker.calculateWeeklyPay(40)); // Regular pay for 40 hours
        assertEquals(825.0, worker.calculateWeeklyPay(50)); // Regular pay for 40 hours and overtime for 10 hours
    }
}
