package Model;

public class Motor extends Traffic{
    private String power;
    public  Motor(String id, String label, int year, int price, String color, String power){
        super(id,label,year,price,color);
        this.power=power;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
    @Override
    public String toString() {
        return "Motor{" +
                "id=" + getId() +
                ", label= " + getLabel() +
                ", price= " + getPrice() + '\'' +
                ", color= " + getColor() + '\'' +
                ", power= " + getPower() + '\'' +
                '}';
    }
}
