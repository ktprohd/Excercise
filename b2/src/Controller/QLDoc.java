package Controller;

import Model.Book;
import Model.Document;
import Model.Journal;
import Model.Newspaper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class QLDoc {
    private Set<Document> documents ;
    public QLDoc(){
        documents= new HashSet<>();
    }
    public void addDoc(Document document){
        documents.add(document);
    }
    public void deleteDocument(String id){
        // this.documents.stream().filter(document -> document.getId().equals(id)).forEach(documents -> documents.remove(doc));
        this.documents.removeIf(document -> document.getId().equals(id));
    }

    public void showDoc(){
        this.documents.forEach(documents -> System.out.println(documents.toString()));
//        for (Document doc : documents){
//            System.out.print(doc.getClass().getSimpleName()+"  ID : " +doc.getId()+"  NXB: "+doc.getNxb()+"  soluong: "+doc.getNumber());
//            if( doc instanceof Book ){
//                System.out.println(" Tac gia:"+ ((Book) doc).getAuthor() + " sotrang: "+ ((Book) doc).getNumberPage()  );
//            }
//        }
    }
    public void searchByBook() {
        this.documents.stream().filter(doc -> doc instanceof Book).forEach(doc -> System.out.println(doc.toString()));
    }
    public void searchByJournal() {
        this.documents.stream().filter(doc -> doc instanceof Journal).forEach(doc -> System.out.println(doc.toString()));
    }
    public void searchByNewspaper() {
        this.documents.stream().filter(doc -> doc instanceof Newspaper).forEach(doc -> System.out.println(doc.toString()));
    }
}
