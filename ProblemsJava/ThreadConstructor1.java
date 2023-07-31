package ProblemsJava;

public class ThreadConstructor1 {
    public static void main(String[] args) {
          MyThr t1 = new MyThr("Ankit");
          MyThr t2 = new MyThr("Aman");
          t1.start();
          t2.start();
          System.out.println("My id is = "+t1.getId());
          System.out.println("My name is = "+t1.getName());
          System.out.println("My id is = "+t2.getId());
          System.out.println("My name is = "+t2.getName());
    }
}
class MyThr extends Thread{
    MyThr(String name){
        super(name);
    }
    public void  run(){
        System.out.println("I am a Thread....");
    }
}
