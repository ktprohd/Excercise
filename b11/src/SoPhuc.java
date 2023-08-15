public class SoPhuc {
    private double real;
    private  double virtual;
    public SoPhuc(double real, double virtual){
        this.real=real;
        this.virtual=virtual;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getVirtual() {
        return virtual;
    }

    public void setVirtual(double virtual) {
        this.virtual = virtual;
    }
    public void show(){
        System.out.println(real+ "+"+virtual+"i");
    }
    public SoPhuc Plus(SoPhuc soPhuc) {
        double real3 = this.real + soPhuc.real;
        double virtual3 = this.virtual + soPhuc.virtual;
        return new SoPhuc(real3, virtual3);
    }

    public SoPhuc Mul(SoPhuc soPhuc) {
        double real2 = this.real * soPhuc.real - this.virtual * soPhuc.virtual;
        double virtual2 = this.real * soPhuc.virtual + this.virtual * soPhuc.real;
        return new SoPhuc(real2, virtual2);
    }
}
