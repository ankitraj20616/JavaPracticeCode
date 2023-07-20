package ProblemsJava;
import java.util.Scanner;
public class RectangleInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length breadth and height = ");
        Cuboid cu = new Cuboid(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("Area of Rectangle = "+cu.area1());
        System.out.println("Area of Cuboid = "+cu.area2());
    }
}
class Rectangle{
    private int length, breadth;
    Rectangle(int l,int b){
        this.breadth = b;
        this.length = l;
    }
    int getLength(){
        return length;
    }
    int getBreadth(){
        return breadth;
    }
    double area1(){
        return (length*breadth);
    }
}
class Cuboid extends Rectangle{
    private int wedth;
    Cuboid(int l,int b,int w){
        super(l,b);
        this.wedth = w;
    }
    double area2(){
        return ((2*getLength()*getBreadth())+(2*getBreadth()*wedth)+(2*wedth*getLength()));
    }
}
