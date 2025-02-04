import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SalaryWorkerTest {

    @Test
    public void testCalculateWeeklyPay() {
        SalaryWorker salaryWorker = new SalaryWorker("Jane", "Doe", "54321", "Ms.", 1985, 0.0, 52000.0);
        assertEquals(1000.0, salaryWorker.calculateWeeklyPay(40));
    }
}