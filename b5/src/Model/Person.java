package Model;

public class Person {
 private int age;
 private String name;
 private String passport;
 private  String type;
 private  int date;
  public Person(String name,int age, String passport, String type, int date){
      this.name=name;
      this.age=age;
      this.passport=passport;
      this.type=type;
      this.date=date;
  }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
    public void showPer(){
        System.out.println("Name  " +name);
        System.out.println("Age  "+age);
        System.out.println("Passport  "+passport);
        System.out.println("Type  "+type);
        System.out.println("--------------------------------------------");
    }
}
