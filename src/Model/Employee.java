package Model;

public abstract class Employee {
    private int employeeCode;
    private String name;
    private int age;
    private int phoneNumber;
    private String email;

    public Employee() {
    }

    public Employee(int employeeCode, String name, int age, int phoneNumber, String email) {
        this.employeeCode = employeeCode;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract double getSalary();

    @Override
    public String toString() {
        return "Employee{" + "employeeCode=" + employeeCode + ", name='" + name + '\'' + ", age=" + age + ", phoneNumber=" + phoneNumber + ", email='" + email + '\'' + '}';
    }

}
