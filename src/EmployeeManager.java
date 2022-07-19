import Model.Employee;
import Model.FullTimeEmployee;
import Model.PartTimeEmployee;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager {
    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        FullTimeEmployee b1 = new FullTimeEmployee(200, 0, 70000);
        FullTimeEmployee b2 = new FullTimeEmployee(10, 50, 80000);
        PartTimeEmployee b3 = new PartTimeEmployee(7.8f);
        PartTimeEmployee b4 = new PartTimeEmployee(60.8f);
        employees.add(b1);
        employees.add(b2);
        employees.add(b3);
        employees.add(b4);
        System.out.println(getParttimeUnderSalary());
        System.out.println(getSumSalaryPtEmployee());
        System.out.println(sortListFtEmployee());
    }

    //    1. Lay ra luong trung binh cua cong ty
    public static float getAverageSalary(){
        float sum= 0;
        for (Employee e: employees
        ) {
            sum += e.getSalary();
        }
        float average = sum/employees.size();
        return average;
    }
    //    2. Lấy ra lương trung bình của công ty
    public static ArrayList<Employee> getParttimeUnderSalary(){
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        float average = getAverageSalary();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) instanceof PartTimeEmployee &&
                    employees.get(i).getSalary()<average)
                employeeArrayList.add(employees.get(i));
        }
        return employeeArrayList;
    }

    public static String getSumSalaryPtEmployee(){// tổng số lương phải trả cho nv pasttime
        double sum = 0;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) instanceof PartTimeEmployee){
                sum += employees.get(i).getSalary();
            }
        }
        return "Tổng lương của nhân viên Bán thời gian : " +sum;
    }

    public static ArrayList<Employee> sortListFtEmployee(){//Sắp xếp nhân viên toàn tgian theo số lương tăng dần
        ArrayList<Employee> arrayList1 = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) instanceof FullTimeEmployee){
                arrayList1.add(employees.get(i));
            }
        }
        arrayList1.sort((((o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary()))));
        return arrayList1;
    }

}