package Model;

public class Student {
    private int grade;
    private String address;
    private String name;
    private int age;
    public Student(int grade,String address,String name,int age){
        this.grade=grade;
        this.address=address;
        this.name=name;
        this.age=age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void showStu(){
        System.out.println("Grade  " +grade);
        System.out.println("Address  "+address);
        System.out.println("Name  "+name);
        System.out.println("Age  "+age);
        System.out.println("--------------------------------------------");
    }
}
