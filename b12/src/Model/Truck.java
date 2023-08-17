package Model;

public class Truck extends Traffic{
    private String weigh;
    public  Truck(String id, String label, int year, int price, String color, String weigh){
        super(id,label,year,price,color);
        this.weigh=weigh;
    }

    public String getWeigh() {
        return weigh;
    }

    public void setWeigh(String weigh) {
        this.weigh = weigh;
    }
    public String toString() {
        return "Car{" +
                "id=" + getId() +
                ", label= " + getLabel() +
                ", price= " + getPrice() + '\'' +
                ", color= " + getColor() + '\'' +
                ", weigh= " + getWeigh() + '\'' +
                '}';
    }
}
