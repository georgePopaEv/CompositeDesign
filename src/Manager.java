import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements  Employee{
    private List<Employee> employeeList = new ArrayList<Employee>();  // a list of LEAFs ...
//    Employee is a LEAF for this directory

    public String name;
    private double salary;

    public Manager(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public Employee getChild(int i){
        return employeeList.get(i);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void showEmployeeDetails() {

            System.out.println("----------------");
            System.out.println("Name =" + getName());
            System.out.println("Salary =" + getSalary());
            System.out.println("----------------");
            Iterator<Employee> employeeIterator = employeeList.iterator();
            while (employeeIterator.hasNext()){
                Employee employee = employeeIterator.next();
                employee.showEmployeeDetails(); // this one is the LEAF node ....
            }


    }

    public void addEmployee(Employee emp){
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp){
        employeeList.remove(emp);
    }
}
