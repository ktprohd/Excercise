package Controller;

import Model.ABC;
import Model.Person;

import java.util.ArrayList;
import java.util.HashMap;

public class QL {
    ArrayList<Person> lists;

    ABC abc=new ABC();
    public QL() {
        this.lists = new ArrayList<>();
    }

    public void addPer(Person person) {
        lists.add(person);
    }

    public void deletePer(String passport) {
        this.lists.removeIf(lists -> lists.getPassport().equals(passport));
    }

    public int calMoney(String passport) {
        Person person = this.lists.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);
        ABC abcInstance = new ABC(); // Tạo đối tượng ABC
        // Truy cập HashMap từ ABC
        HashMap<String, Integer> hashMap = abcInstance.getHashMap();
            int i = person.getDate() * hashMap.get(person.getType());
            return i;
   }
   public void showPer(){
       this.lists.forEach(Person::showPer);
   }
}
