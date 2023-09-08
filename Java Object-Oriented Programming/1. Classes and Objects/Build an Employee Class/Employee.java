public class Employee {
    String name;
    int age;
    double salary;
    String location;

    public Employee(String name, int age, double salary, String location) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    void raiseSalary(double raise) {
        this.salary += raise;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", location=" + location + "]";
    }
}