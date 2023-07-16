package ProblemsJava;
import  java.util.Scanner;
public class SumOfNterms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n = ");
        int n = sc.nextInt();
        sum(n);
    }
    static void sum(int n){
        int s = 0;
        for (int i = 1;i<=n ; i++){
            s += i;
        }
        System.out.println("Sum of n natural number is = "+s);
    }
}
