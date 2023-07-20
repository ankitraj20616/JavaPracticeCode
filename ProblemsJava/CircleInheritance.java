package ProblemsJava;
import java.util.Scanner;
public class CircleInheritance {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius and height = ");
        CYLINDER cy = new CYLINDER(sc.nextInt(), sc.nextInt());
        System.out.println("Area of circle = "+cy.area1());
        System.out.println("Area of cylinder = "+cy.area2());

    }
}
class Circle{
    private int radius;
    Circle(int r){
        this.radius = r;
    }
    int getRadius(){
        return radius;
    }
    double area1(){
        return (3.14*radius*radius);
    }
}
class CYLINDER extends Circle{
    private int height;
    CYLINDER(int r,int h){
        super(r);
        this.height = h;
    }
    double area2(){
        return ((2*3.14*getRadius()*height)+(2*3.14*getRadius()*getRadius()));
    }
}
