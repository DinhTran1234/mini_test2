package Model;

public class PartTimeEmployee extends Employee{
    private double workingHours;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(double workingHours) {
        this.workingHours = workingHours;
    }

    public PartTimeEmployee(int employeeCode, String name, int age, int phoneNumber, String email, double workingHours) {
        super(employeeCode, name, age, phoneNumber, email);
        this.workingHours = workingHours;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    public double getSalary(){
        return workingHours * 100000;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "workingHours=" + workingHours +
                '}';
    }
}
