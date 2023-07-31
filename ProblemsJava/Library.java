package ProblemsJava;

public class Library {
    public static void main(String[] args) {
          library l = new library();
          l.showBook();
          l.addBook("Physics");
          l.showBook();
    }
}
class library{
    String []book;
    int n;
    library(){
        this.book = new String[100];
        n = 0;
    }
    void addBook(String book){
        this.book[n] = book;
        n++;
    }
    void showBook(){
        System.out.println("Available books..");
        for (String str : book){
            System.out.println(str);
        }

    }
}