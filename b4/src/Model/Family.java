package Model;

import Model.Person;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Family {
    private String address;
    Set<Person> persons;

    public Family( String address) {
        this.persons =new HashSet<>();
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void addPer(Person person){
        this.persons.add(person);
    }

    public  void showMem(){
//        System.out.println("Address: "+ address);
//        System.out.println("Info of member:");
//        this.persons.forEach(person -> System.out.println(persons.toString()));
        System.out.println("Address: " + address);
        System.out.println("Information about members of the Family");
        this.persons.forEach(Person::showInfo);
        System.out.println("---------------------------------------------");
    }
}