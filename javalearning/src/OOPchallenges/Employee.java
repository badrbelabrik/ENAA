package OOPchallenges;

public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public double annualSalary(){
        double annualsalary;
        annualsalary = this.salary * 12;
        return annualsalary;
    }
    public void display(){
        System.out.println("Employee "+ this.name + ", annualsalary is: " + annualSalary() + " MAD");
    }
     public static void main(String[] args){
        Employee employee1 = new Employee("badr",6500);
        employee1.annualSalary();
        employee1.display();
     }
}
