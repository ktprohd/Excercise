package Model;

public class OldStudent extends  Student{
    private String place;
    public OldStudent(String id, String name, String birth, int entranceYear, double entranceScore, String place,String department){
        super(id, name, birth, entranceYear, entranceScore,department);
        this.place=place;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
    @Override
    public String toString() {
        return "OldStudent{" +
                "Id=" + getId() +
                ", Name='" + getName() + '\'' +
                ", Birth='" + getBirth() + '\'' +
                ", Entrance Year='" + getEntranceYear() + '\'' +
                ", Place='" + getPlace() + '\'' +
                '}';
    }
}
