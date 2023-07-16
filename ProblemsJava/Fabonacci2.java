package ProblemsJava;
import java.util.Scanner;
public class Fabonacci2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n = ");
        int n = sc.nextInt();
        fabonacci(n);
    }
    static void fabonacci(int n){
        int a =0,b =1,s=0;
        System.out.print(a+" "+b+" ");
        for( int i=1;i<=n;i++)
        {
            s = a + b;
            a = b;
            b = s;
            System.out.print(s+" ");
        }
    }
}
