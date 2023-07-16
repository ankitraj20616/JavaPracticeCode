package ProblemsJava;
import java.util.Scanner;
public class Constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle = ");
        int r = sc.nextInt();
        circle1 c1 = new circle1(r);
        System.out.println("=======================");
        System.out.println("Details of circle :");
        System.out.println("Radius : "+c1.getRadius());
        System.out.println("Area : "+c1.area());
        System.out.println("Perimeter : "+c1.perimeter());
    }
}
class circle1{
    private int radius;
    public circle1(int r){ radius = r; }

    public int getRadius() {
        return radius;
    }
    public double area(){
        return (3.14*radius*radius);
    }
    public double perimeter(){
        return (2*3.14*radius);
    }
}
