public class Worker extends Person {
    private double hourlyPayRate;

    public Worker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate) {
        super(firstName, lastName, ID, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double regularHours = Math.min(hoursWorked, 40);
        double overtimeHours = Math.max(0, hoursWorked - 40);
        double regularPay = regularHours * hourlyPayRate;
        double overtimePay = overtimeHours * hourlyPayRate * 1.5;
        return regularPay + overtimePay;
    }

    public void displayWeeklyPay(double hoursWorked) {
        double regularHours = Math.min(hoursWorked, 40);
        double overtimeHours = Math.max(0, hoursWorked - 40);
        double regularPay = regularHours * hourlyPayRate;
        double overtimePay = overtimeHours * hourlyPayRate * 1.5;
        System.out.println("Regular Pay (" + regularHours + " hours): $" + regularPay);
        System.out.println("Overtime Pay (" + overtimeHours + " hours): $" + overtimePay);
        System.out.println("Total Pay: $" + calculateWeeklyPay(hoursWorked));
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + hourlyPayRate;
    }

    @Override
    public String toXML() {
        return super.toXML() + "<hourlyPayRate>" + hourlyPayRate + "</hourlyPayRate>";
    }

    @Override
    public String toJSON() {
        return super.toJSON() + ",\"hourlyPayRate\":" + hourlyPayRate;
    }
}