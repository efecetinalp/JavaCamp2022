public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();

        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();

        customer.firstName = "customer1";
        employee.firstName = "employee1";
        customerManager.add();
        employeeManager.list();
    }
}
