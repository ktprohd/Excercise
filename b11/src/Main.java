// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SoPhuc soPhuc1 = new SoPhuc(3.0, 4.0);
        SoPhuc soPhuc2 = new SoPhuc(1.0, 2.0);
        System.out.println("So phuc 1:");
        soPhuc1.show();

        System.out.println("So phuc 2:");
        soPhuc2.show();

        SoPhuc tong = soPhuc1.Plus(soPhuc2);
        System.out.println("Tong hai so phuc:");
        tong.show();

        SoPhuc tich = soPhuc1.Mul(soPhuc2);
        System.out.println("Tich hai so phuc:");
        tich.show();
    }
}