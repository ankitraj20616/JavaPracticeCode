package ProblemsJava;
import java.util.Scanner;
public class StarPatternUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of lines to be printed = ");
        int n = sc.nextInt();
        fab(n);
    }
    static void fab(int n){
        if (n > 0) {
            fab(n-1);
            for( int i =1;i<=n;i++)
                System.out.print("*");
            System.out.println();
        }
    }
}
