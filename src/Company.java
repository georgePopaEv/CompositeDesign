public class Company {
    public static void main(String[] args) {
        Employee dev1 = new Developer(100, "George", "Programmer");
        Employee dev2 = new Developer(101, "Alina", "Programmer helper");

        Manager engDirectory = new Manager("Mike" , 25000);
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Employee dev3 = new Developer(102, "Marcela", "Developer helper");

        Manager generalManager = new Manager("Mart", 50000);
        generalManager.addEmployee(dev3);
        generalManager.addEmployee(engDirectory);
        generalManager.showEmployeeDetails();


    }
}
