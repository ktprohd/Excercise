package Model;

public class Person {
    private String name;
    private String id;
    private String congto;
    private int newdata;
    private int olddata;
    public  Person(String name,String id,String congto,int newdata,int olddata){
        this.name=name;
        this.id=id;
        this.congto=congto;
        this.newdata=newdata;
        this.olddata=olddata;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCongto() {
        return congto;
    }

    public void setCongto(String congto) {
        this.congto = congto;
    }

    public int getNewdata() {
        return newdata;
    }

    public void setNewdata(int newdata) {
        this.newdata = newdata;
    }

    public int getOlddata() {
        return olddata;
    }

    public void setOlddata(int olddata) {
        this.olddata = olddata;
    }
    public void showPer(){
        System.out.println("Name  " +name);
        System.out.println("ID  "+id);
        System.out.println("Congto  "+congto);
        System.out.println("--------------------------------------------");
    }
    @Override
    public boolean equals (Object o){
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person =(Person) o;
        return id.equals(((Person) o).getId());
    }
    @Override
    public int hashCode(){
        return id.hashCode();

    }

}
