package Method;
import java.util.Scanner;
public class FabonacciUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n = ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int result = fab(i);
            System.out.print(result+" ");
        }
    }
    static int fab(int n){
        if(n == 2 || n == 1)
            return n-1;
        else
            return fab(n-1)+fab(n-2);
    }
}
