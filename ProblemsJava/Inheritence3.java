package ProblemsJava;
public class Inheritence3 {
    public static void main(String[] args) {
        //Papa p = new Papa(4);
        //Papa p = new Papa(4,5);
        Beta b = new Beta(2,3,4);
    }
}
class Papa{
    private int x;
    private int y;
    Papa(int x1,int y1){
        x = x1;
        y = y1;
        System.out.println("I am an overloaded Papa constructor of value : "+x+" & "+y);
    }

    public Papa(int x) {
        System.out.println("I am a papa constructor!");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
class Beta extends Papa{
    private int z;

    Beta() {
        super(0);
        System.out.println("I am a beta constructor!");
    }

    Beta(int x1, int y1, int z) {
        super(x1, y1);
        this.z = z;
        System.out.println("I am an overloaded beta constructor with value : "+x1+" & "+y1+" & "+z);
    }
}
