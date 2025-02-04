import java.util.ArrayList;
import java.util.List;

public class InheritanceDemo {
    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<>();

        // Create Worker instances
        workers.add(new Worker("John", "Doe", "12345", "Mr.", 1990, 15.0));
        workers.add(new Worker("Alice", "Smith", "54321", "Ms.", 1985, 18.0));
        workers.add(new Worker("Bob", "Jones", "98765", "Mr.", 1978, 20.0));

        // Create SalaryWorker instances
        workers.add(new SalaryWorker("David", "Lee", "11111", "Mr.", 1995, 0.0, 50000.0));
        workers.add(new SalaryWorker("Sarah", "Williams", "22222", "Ms.", 1980, 0.0, 60000.0));
        workers.add(new SalaryWorker("Michael", "Brown", "33333", "Mr.", 1988, 0.0, 70000.0));

        // Simulate 3 weekly pay periods
        double[] hoursWorked = {40, 50, 40};

        System.out.println("Weekly Pay Summary:");
        System.out.println("------------------");
        for (int week = 0; week < hoursWorked.length; week++) {
            System.out.println("Week " + (week + 1));
            for (Worker worker : workers) {
                System.out.print(worker.getFirstName() + " " + worker.getLastName() + ": ");
                worker.displayWeeklyPay(hoursWorked[week]);
            }
            System.out.println();
        }
    }
}