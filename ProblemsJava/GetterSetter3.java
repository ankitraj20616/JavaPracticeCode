package ProblemsJava;
import  java.util.Scanner;
public class GetterSetter3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Cylinder cr = new Cylinder();
        System.out.print("Enter radius of cylinder = ");
        cr.setRadius(sc.nextInt());
        System.out.print("Enter height of cylinder = ");
        cr.setHeight(sc.nextInt());
        System.out.println("===============================");
        System.out.println("Cylinder details : ");
        System.out.println("Radius : "+cr.getRadius());
        System.out.println("Height : "+cr.getHeight());
        System.out.println("Surface Area : "+cr.surfaceArea());
        System.out.println("Area : "+cr.Area());
    }
}
class Cylinder{
    private int radius , height;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
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