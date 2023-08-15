package Model;

public class Newspaper extends Document{
    private int day;
    public Newspaper(String id,String nxb, int number, int day){
        super(id,nxb,number);
        this.day=day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    @Override
    public String toString() {
        return "Newspaper{" +
                "dayIssue=" + day +
                ", id='" + getId() + '\'' +
                ", nxb='" + getNxb() + '\'' +
                ", number='" + getNumber() + '\'' +
                '}';
    }
}
