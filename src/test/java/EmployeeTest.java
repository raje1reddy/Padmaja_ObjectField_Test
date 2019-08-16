import static org.junit.Assert.*;


public class EmployeeTest {
    public static void main (String args[]) {
        Employee emp = new Employee();
        System.out.println(emp.age);
        Employee emp1 = new Employee();
         emp1.setAge(38.59);
         double age1 = emp1.getAge();
         System.out.println(age1);
    }

}