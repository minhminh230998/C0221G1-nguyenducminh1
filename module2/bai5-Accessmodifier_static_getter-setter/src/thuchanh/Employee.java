package thuchanh;

public class Employee {
    private int id;
    private String name;
    private int salary;
    public  static int upToSalary;

    public Employee() {
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        upToSalary =salary+(salary*10/100);
    }
    public  static  void upToSalary(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getUpToSalary() {
        return upToSalary;
    }

    public static void setUpToSalary(int upToSalary) {
        Employee.upToSalary = upToSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", upTuSalary=" + upToSalary +
                '}';
    }

    public static void main(String[] args) {
        Employee.upToSalary();
        Employee employee1=new Employee(1,"minh",100000);
        System.out.println(employee1.toString());
    }
}
