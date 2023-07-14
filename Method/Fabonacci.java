package Method;
import java.util.Scanner;
public class Fabonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements in series = ");
        int n = sc.nextInt();
        int a =0, b =1,s =0;
        System.out.print(a+" "+b+" ");
        for (int i = 0 ;i<n;i++)
        {
            s = a + b;
            a = b;
            b = s;
            System.out.print(s+" ");
        }
    }
}
