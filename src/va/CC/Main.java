package va.CC;

public class Main {

    public static void main(String[] args) {
        // write your code here
        FotoApparat f1 = new FotoApparat("Fuji", "X100V", 26, 23, "Japan");
        FotoApparat f2 = new FotoApparat("Panasonic", "TZM-DC81", 19, 129, "Japan");
        FotoApparat f3 = new FotoApparat("Sony", "DSC-HX80", 18,123,"Japan");
        f1.getFotoApparat(f1);
        f2.getFotoApparat(f2);
        f3.getFotoApparat(f3);

        Objektiv StandardObjektiv = new Objektiv(10,100);
        Objektiv SuperObjektiv = new Objektiv(10, 300);
    }
}
