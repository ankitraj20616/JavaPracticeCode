package ProblemsJava;
import java.util.Scanner;
public class OPPs2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         square obj = new square();
        System.out.println("Enter sides of square = ");
        obj.a = sc.nextInt();
        System.out.println("Area of square is = "+obj.area());
        System.out.println("Parameter of square is = "+obj.parameter());
    }
}
class square{

    public int a;
    public int area(){
        return a*a;
    }
    public int parameter(){
        return (4*a);
    }
}
