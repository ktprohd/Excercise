package View;

import Controller.QLDoc;
import Model.Book;
import Model.Document;
import Model.Journal;
import Model.Newspaper;

import java.util.Scanner;

import static View.MENU.DEL_DOC;

public class Display {
    Scanner scanner = new Scanner(System.in);
    QLDoc qldoc = new QLDoc();


    Document doc = null;
    int menu;
    int j;

    public void Display() {
        while (true) {
            System.out.println("Menu:");
            System.out.println("\t1: Add doc");
            System.out.println("\t2: Delete doc");
            System.out.println("\t3: Show doc");
            System.out.println("\t4: Search doc");
            System.out.println("\t5. Exit");
            int menu = scanner.nextInt();
            scanner.nextLine();
            MENU menuOp = MENU.getEnumMenu(menu);

            switch (menuOp) {
                case ADD_DOC:
                    System.out.print("Id:");
                    String id = scanner.nextLine();
                    System.out.print("Nxb: ");
                    String nxb = scanner.nextLine();
                    System.out.print("Number: ");
                    int number = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("1. Book");
                    System.out.println("2. Journal ");
                    System.out.print("3. Newspaper");
                    j = scanner.nextInt();
                    scanner.nextLine();
                    DOC1 doc1 = DOC1.getEnumDocument(j);
                    switch (doc1) {
                        case BOOK:
                            System.out.print("Author: ");
                            String author = scanner.nextLine();
                            System.out.print("Number Page: ");
                            int numberPage = scanner.nextInt();
                            scanner.nextLine();
                            doc = new Book(id, nxb, number, author, numberPage);
                            qldoc.addDoc(doc);
                            break;
                        case JOURNAL:
                            System.out.print("Number Release");
                            int numberRelease = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Month ");
                            int month = scanner.nextInt();
                            scanner.nextLine();
                            doc = new Journal(id, nxb, number, numberRelease, month);
                            qldoc.addDoc(doc);
                            break;
                        case NEWSPAPER:
                            System.out.println("Day");
                            int day = scanner.nextInt();
                            scanner.nextLine();
                            doc = new Newspaper(id, nxb, number, day);
                            qldoc.addDoc(doc);
                            break;
                    }
                    break;
                case DEL_DOC:
                    System.out.println(" ID to delete");
                    id = scanner.nextLine();
                    qldoc.deleteDocument(id);
                    // System.out.println(Document.deleteDocument(id) ? "Success" : "Fail");
                    break;
                case SHOW_DOC:
                    qldoc.showDoc();
                    break;
                case SEARCH_DOC:
                    System.out.println("1. Book");
                    System.out.println("2. Journal ");
                    System.out.println("3. Newspaper");
                    j = scanner.nextInt();
                    doc1 = DOC1.getEnumDocument(j);
                    switch (doc1) {
                        case BOOK:
                            qldoc.searchByBook();
                            break;
                        case JOURNAL:
                            qldoc.searchByJournal();
                            break;
                        case NEWSPAPER:
                            qldoc.searchByNewspaper();
                            break;
                    }
                    break;
                case EXIT:
                    System.out.println("Exit");
                    return;

                default:
                    System.out.println("Wrong!.");
                    break;
            }
        }
    }
}
