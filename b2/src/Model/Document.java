package Model;

import javax.print.Doc;

public class Document {
    private String id;
    private String nxb;
    private int number;
    public Document(String id, String nxb, int number){
        this.id=id;
        this.nxb=nxb;
        this.number=number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    @Override
    public boolean equals (Object o){
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document =(Document) o;
        return id.equals(((Document) o).getId());
    }
    @Override
    public int hashCode(){
        return id.hashCode();

    }

}
