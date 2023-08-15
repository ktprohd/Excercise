package Controller;

import Model.Teacher;

import java.util.ArrayList;

public class QLTea {
    ArrayList<Teacher> lists;
    public void QLTea(){
        this.lists= new ArrayList<>();
    }
    public void addTea(Teacher teacher){
        lists.add(teacher);
    }
    public boolean delTea(String id){
        Teacher teacher=lists.stream().filter(o->o.getId().equals(id)).findFirst().orElse(null);
        if (teacher == null) {
            return false;
        }
        this.lists.remove(teacher);
        return true;
    }
//   Another way to delete
//    public void deletePer(String id) {
//        this.lists.removeIf(lists -> lists.getId().equals(id));
//    }
    public void salary(String id){
        Teacher teacher = this.lists.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
        if (teacher == null) {
            System.out.println("0");
        }
        System.out.println( teacher.getSalary() + teacher.getBonus() + teacher.getPenaty());
    }
}
