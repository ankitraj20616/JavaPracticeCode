package ProblemsJava;

public class ThreadPracticeQ1 {
    public static void main(String[] args) {
            question1 t1 = new question1();
            question2 t2 = new question2();
            t1.start();
            t2.start();
    }
}
class question1 extends Thread{
    public void run(){
        int i =1;
        while(i<=400){
            System.out.println("Good Morning");
            i++;
        }
    }
}
class question2 extends Thread{

    public void run(){
        try{
            Thread.sleep(200);
        }
        catch(Exception e){
            System.out.println(e);
        }
        int i =1;
        while(i<=400){
            System.out.println("Welcome....");
            i++;
        }
    }
}