package ProblemsJava;
import java.util.Scanner;
public class Inheritence1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SuperClass sp = new SuperClass();
        System.out.print("Enter value of x = ");
        sp.setX(sc.nextInt());
        System.out.println("Value of x = "+sp.getX());
        /*Error:-
        System.out.print("Enter value of y = ");
        sp.setY(sc.nextInt());
        System.out.println("Value of x = "+sp.getY());*/
        System.out.println("=============================");
        SubClass sb = new SubClass();
        System.out.print("Enter value of x = ");
        sb.setX(sc.nextInt());
        System.out.println("Value of x = "+sb.getX());
        System.out.print("Enter value of y = ");
        sb.setY(sc.nextInt());
        System.out.println("Value of x = "+sb.getY());
    }
}
class SuperClass{
    private int x ;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class SubClass extends SuperClass{
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
