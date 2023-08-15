package Model;

public class Candidate {
    private String sbd;
    private String name;
    private String address;
    private  int priority;


    public Candidate(String sbd,String name, String address, int priority){
        this.sbd=sbd;
        this.name=name;
        this.address=address;
        this.priority=priority;
    }

    public String getSbd() {
        return sbd;
    }

    public void setSbd(String sbd) {
        this.sbd = sbd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
