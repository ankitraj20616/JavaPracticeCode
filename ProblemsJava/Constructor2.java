package ProblemsJava;
import java.util.Scanner;
public class Constructor2 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter length of rectangle = ");
           int l = sc.nextInt();
        System.out.print("Enter breadth of rectangle = ");
        int b = sc.nextInt();
        System.out.print("Enter side of square = ");
        int a = sc.nextInt();
        rectangle r1 = new rectangle(l,b);
        rectangle r2 = new rectangle(a);
        System.out.println("=============================");
        System.out.println("Rectangle details : ");
        System.out.println("Length : "+r1.getLength());
        System.out.println("Breadth : "+r1.getBreadth());
        System.out.println("Area : "+r1.Area());
        System.out.println("Perimeter : "+r1.perimeter());
        System.out.println("===============================");
        System.out.println("Square deatils : ");
        System.out.println("Sides : "+r2.getLength());
        System.out.println("Area : "+r2.Area());
        System.out.println("Perimeter : "+r2.perimeter());
    }
}
class rectangle{
    private int length , breadth;
    public rectangle(int l){
        length = l;
        breadth = l;
    }
    public rectangle(int l,int b){
        length = l;
        breadth = b;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    public int Area(){
        return (length*breadth);
    }
    public int perimeter(){
        return (2*(length+breadth));
    }
}
