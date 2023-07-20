package ProblemsJava;
public class MehtodOverriding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.meth1();
        a.meth2();
        b.meth2();
        b.meth3();
    }
}
class A{
    void meth1(){
        System.out.println("I am meth1 method of class A");
    }
    void meth2(){
        System.out.println("I am meth2 method of class A");
    }
}
class B extends A{
    @Override
    void meth2(){
        System.out.println("I am meth2 method pf class B");
    }
    void meth3(){
        System.out.println("I am meth3 method pf class B");
    }
}
