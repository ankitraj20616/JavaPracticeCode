package ProblemsJava;
import java.util.Scanner;
public class AbstractClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle = ");
        cir cr = new cir(sc.nextInt());
        System.out.println("Area of circle = "+cr.area());
        System.out.println("Perimeter of circle = "+cr.perimeter());
        System.out.println("========================================");
        System.out.println("Enter length and weadth of rectangle = ");
        rec rc = new rec(sc.nextInt(),sc.nextInt());
        System.out.println("Area of rectangle = "+rc.area());
        System.out.println("Perimeter of rectangle = "+rc.perimeter());
    }
}
abstract class Shape{
    private int radius , length , weadth;
    Shape(int r, int l, int w){
        radius = r;
        length = l;
        weadth = w;
    }

    public int getRadius() {
        return radius;
    }

    public int getLength() {
        return length;
    }

    public int getWeadth() {
        return weadth;
    }

    abstract double area();
    abstract double perimeter();
}
class cir extends Shape{
        cir(int r){
            super(r,0,0);
        }
         @Override
         double area(){
             return (3.14*getRadius()*getRadius());
         }
         @Override
         double perimeter(){
             return (2*3.14*getRadius());
         }
}
class rec extends Shape{
    rec(int l, int w){
        super(0,l,w);
    }
    @Override
    double area(){
        return (getLength()*getWeadth());
    }
    @Override
    double perimeter(){
         return (2*(getWeadth()+getLength()));
    }
}