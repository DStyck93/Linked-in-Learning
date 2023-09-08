public class Main {
    
    public static void main(String[] args) {

        Employee jane = new Employee("Jane Doe", 25, 65000, "Chicago, IL");
        Employee john = new Employee("John Doe", 27, 50000, "Las Vegas, NV");

        john.raiseSalary(5000);

        System.out.println(jane.toString());
        System.out.println(john.toString());
    }
}
