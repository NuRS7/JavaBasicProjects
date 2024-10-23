public class Employee {
    public String name;
    private double salary;
    public Employee(String empName){
        name = empName;
    }
    public void setSalary(double setSal){
        salary = setSal;
    }
    public void printEmpName(){
        System.out.println("Employee name is " + name);
        System.out.println("Salary " + salary+"$");
    }

    public static void main(String[] args) {
        Employee empCheck = new Employee("Nursultan");
        empCheck.salary = 50000;
        empCheck.printEmpName();
    }
}
