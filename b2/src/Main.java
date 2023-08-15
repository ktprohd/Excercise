import Controller.QLDoc;
import Model.Book;
import View.Display;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//            doc.showDoc();
//            doc.searchByBook();
        Display user = new Display();
        QLDoc doc= new QLDoc();
        Book book1= new Book("A","Kimdong",5,"Trung",40);
        doc.addDoc(book1);
        user.Display();


    }
}