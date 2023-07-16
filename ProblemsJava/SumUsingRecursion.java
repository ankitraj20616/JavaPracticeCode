package ProblemsJava;
import java.util.Scanner;
public class SumUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n = ");
        int n = sc.nextInt();
        int s = Sum(n);
        System.out.println("Sum of first n number is = "+s);
    }
    static int Sum(int n)
    {
        int result = 0;
        if(n>1)
            return (result =n+Sum(n-1));
        else
            return 1;

    }
}
