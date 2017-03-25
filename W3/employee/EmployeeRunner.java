package au.edu.rmit.employee;

/**
 * Created by alexj on 16/3/17.
 */
public final class EmployeeRunner {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmpAge(27);
        System.out.println("Employee Age: " + e1.getEmpAge());
    }
}
