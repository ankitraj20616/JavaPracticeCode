package ProblemsJava;
import java.util.Scanner;
public class GetterSetter2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         circle cr = new circle();
         System.out.print("Enter radius of circle = ");
         cr.setRadius(sc.nextInt());
        System.out.println("========================");
        System.out.println("Details of circle :");
        System.out.println("Radius : "+cr.getRadius());
        System.out.println("Area : "+cr.area());
        System.out.println("Perimeter : "+cr.parimeter());
    }
}
class circle{
    private int radius;
    public void setRadius(int r){
        radius = r;
    }
    public int getRadius(){
        return radius;
    }
    public double area(){
        return (3.14*radius*radius);
    }
    public double parimeter(){
        return (2*3.14*radius);
    }
}
