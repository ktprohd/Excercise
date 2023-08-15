package Controller;

import Model.Person;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class QL {
    Scanner scanner = new Scanner(System.in);
Set<Person> lists;
public QL(){
    this.lists=new HashSet<>();
}
public void addPer(Person person){
    lists.add(person);
}
public void delete(String id){
    lists.removeIf(lists->lists.getId().equals(id));
}
public void changePer(String id){
   Person person= this.lists.stream().filter(p->p.getId().equals(id)).findFirst().orElse(null);
   System.out.println("Change Congto:");
   String congto1= scanner.nextLine();
   person.setCongto(congto1);
}
public void showPer(){
    lists.forEach(Person::showPer);
}
public void calPer(String id){
    Person person = this.lists.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
    if (person == null) {
        System.out.println("0");
    }
    System.out.println( (person.getNewdata() - person.getOlddata()*5));
}
}
