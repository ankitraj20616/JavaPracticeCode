package ProblemsJava;

public class threadByRunnableInterfacce {
    public static void main(String[] args) {
           RunnableThread1 bullet1 = new RunnableThread1();
           Thread gun1 = new Thread(bullet1);
           RunnableThread2 bullet2 = new RunnableThread2();
           Thread gun2 = new Thread(bullet2);
           gun1.start();
           gun2.start();
    }
}
class RunnableThread1 implements Runnable{
    public void run(){
        int i =0;
        while (i<4000){
        System.out.println("I am Thread 111111....");
        i++;
        }
    }
}
class RunnableThread2 implements Runnable{
    public void run(){
        int i =0;
        while (i<4000){
            System.out.println("I am Thread 22222....");
            i++;
        }
    }
}
