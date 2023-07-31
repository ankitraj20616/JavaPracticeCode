package ProblemsJava;

public class threadByExtending {
    public static void main(String[] args) {
            MyThread1 t1 = new MyThread1();
            MyThread2 t2 = new MyThread2();
            t1.start();
            t2.start();
    }
}
class MyThread1 extends Thread{
        public void run () {
            while (true){
        System.out.println("Thread 1 is running.....");
        System.out.println("I am good....");
        System.out.println("===========================");
    }
    }
}
class MyThread2 extends Thread{
    public void run() {
        while (true) {
            System.out.println("Thread 2 is running.....");
            System.out.println("I am sad....");
            System.out.println("===========================");
        }
    }
}