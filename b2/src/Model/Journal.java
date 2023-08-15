package Model;

public class Journal extends Document {
    private int numberRelease;
    private int month;
    public Journal(String id, String nxb, int number, int numberRelease, int month){
        super(id,nxb,number);
        this.numberRelease=numberRelease;
        this.month=month;
    }

    public int getNumberRelease() {
        return numberRelease;
    }

    public void setNumberRelease(int numberRelease) {
        this.numberRelease = numberRelease;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    @Override
    public String toString() {
        return "Journal{" +
                "issueNumber=" + numberRelease +
                ", monthIssue=" + month +
                ", id='" + getId() + '\'' +
                ", nxb='" + getNxb() + '\'' +
                ", number='" + getNumber() + '\'' +
                '}';
    }
}
