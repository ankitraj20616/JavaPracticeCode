package ProblemsJava;

import java.util.Scanner;

public class TryCatch3 {
    public static void main(String[] args) {
        int []arr = new int[5];
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            try{
                System.out.print("Enter any index no = ");
                int index = sc.nextInt();
                System.out.println("arr[index] = "+arr[index]);
                flag = false;
            }
            catch (Exception e){
                System.out.println("Failed! , reason : ");
                System.out.println(e);
            }
        }
    }
}
