package ProblemsJava;
import java.util.Scanner;
public class OOPs1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Employee e1 = new Employee();
         Employee e2 = new Employee();
        System.out.print("Enter 1st employee name = ");
        e1.name = sc.nextLine();
        System.out.print("Enter 1st employee salary = ");
        e1.salary = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter 2nd employee name = ");
        e2.name = sc.nextLine();
        System.out.print("Enter 2nd employee salary = ");
        e2.salary = sc.nextInt();

        System.out.println("============================");
        System.out.println("1st employee details :-");
        System.out.println("name : "+e1.getName()+" Salary : "+e1.getSalary());
        System.out.println("============================");
        System.out.println("2nd employee details :-");
        System.out.println("name : "+e2.getName()+" Salary : "+e2.getSalary());
        System.out.println("============================");
        System.out.println("Updated 1st employee details :-");
        System.out.println("name : "+e1.setName()+" Salary : "+e1.getSalary());
    }
}
class Employee{
    public int salary;
    public String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public String setName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter updated employee name = ");
        String str = sc.nextLine();
        name = str;
        return  name;
    }
}
