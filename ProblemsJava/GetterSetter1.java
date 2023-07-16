package ProblemsJava;
import java.util.Scanner;
public class GetterSetter1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyEmployee e1 = new MyEmployee();
        System.out.print("Enter employee 1 id = ");
        e1.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter employee 1 name = ");
        e1.setName(sc.nextLine());
        System.out.println("======================");
        System.out.println("Employee 1 :");
        System.out.println("id : "+e1.getId());
        System.out.println("name : "+e1.getName());
    }
}
class MyEmployee{
    private int id;
    private  String name;
    public void setId(int i){
        id = i;
    }
    public void setName(String n){
        name = n;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
