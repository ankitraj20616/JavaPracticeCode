package ProblemsJava;
import java.util.Scanner;
public class Recursion {
     static   int factorial(int n)
    {
        if(n > 1)
            return (n*factorial(n-1));
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find factorial = ");
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println("Factorial is = "+fact);
    }
}
