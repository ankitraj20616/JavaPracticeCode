package ProblemsJava;
import java.util.Scanner;
public class Constructor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle = ");
        int r = sc.nextInt();
        System.out.print("Enter height of circle = ");
        int h = sc.nextInt();
        cylinder cr = new cylinder(r,h);
        System.out.println("===============================");
        System.out.println("Cylinder details : ");
        System.out.println("Radius : "+cr.getRadius());
        System.out.println("Height : "+cr.getHeight());
        System.out.println("Surface Area : "+cr.surfaceArea());
        System.out.println("Area : "+cr.Area());
    }
}
class cylinder{
    private int radius , height;
    public cylinder(int r, int h){
        radius = r;
        height = h;
    }
    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }
    public double surfaceArea(){
        return ((2*3.14*radius*height)+(2*3.14*radius*radius));
    }
    public double Area(){
        return (3.14*radius*radius*height);
    }
}
