public class Main {
    public String name;
    private double salary;

    public Main(String empName){
        name = empName;

    }
    public void setSalary(double setSal){
        salary = setSal;
    }

    public void printEmpName(){
        System.out.println("Employee name is " + name);
        System.out.println("Salary"+ salary);
    }

    public static void main(String[] args) {
        Main empCheck = new Main("John");
        empCheck.salary = 50000;
        empCheck.printEmpName();
    }
}