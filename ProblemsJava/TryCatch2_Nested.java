package ProblemsJava;

import java.util.Scanner;

public class TryCatch2_Nested {
    public static void main(String[] args) {
        int []arr = new int[3];
        Scanner sc = new Scanner(System.in);
        arr[0] = 5;
        arr[1] = 4;
        arr[2] = 0;
        System.out.print("Enter index no = ");
        int index = sc.nextInt();
        System.out.print("Enter number to divide = ");
        int num = sc.nextInt();
        try{
            System.out.println("arr[index] = "+arr[index]);
            try{
                    System.out.println("num/arr[] = "+num/arr[index]);
            }
            catch (Exception e){
                System.out.println("Exception level 2!");
                System.out.print("Failed to divide , Reason :");
                System.out.println(e);
            }
        }
        catch (Exception e){
            System.out.println("Exception in level 1 , Reason : ");
            System.out.println(e);
        }
    }
}
