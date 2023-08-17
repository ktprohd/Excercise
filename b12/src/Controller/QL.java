package Controller;

import Model.Traffic;

import java.util.HashSet;
import java.util.Set;

public class QL {
    HashSet<Traffic> lists;
public QL(){
    lists=new HashSet<>();
}
public void add(Traffic traffic){
    lists.add(traffic);
}
public void del(String id){
    lists.removeIf(traffic -> traffic.getId().equals(id));
}
public void search(String label,String color){
Traffic traffic1 =this.lists.stream().filter(traffic -> traffic.getColor().equals(color)&&traffic.getLabel().equals(label)).findFirst().orElse(null);
System.out.println(traffic1);
}
}
