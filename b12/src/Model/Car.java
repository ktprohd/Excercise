package Model;

public class Car extends Traffic{
    private String type;
    public  Car(String id, String label, int year, int price, String color, String type){
        super(id,label,year,price,color);
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String toString() {
        return "Car{" +
                "id=" + getId() +
                ", label= " + getLabel() +
                ", price= " + getPrice() + '\'' +
                ", color= " + getColor() + '\'' +
                ", type= " + getType() + '\'' +
                '}';
    }
}
