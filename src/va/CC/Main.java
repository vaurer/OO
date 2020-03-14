package va.CC;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        FotoApparat f1 = new FotoApparat("Fuji", "X100V", 26, 10, 23, "Japan", 30);
        FotoApparat f2 = new FotoApparat("Panasonic", "TZM-DC81", 19, 10, 129, "Japan", 20);
        FotoApparat f3 = new FotoApparat("Sony", "DSC-HX80", 18, 10, 123, "Japan", 50);

        f1.printFotoApparat(f1);
        f2.printFotoApparat(f2);
        f3.printFotoApparat(f3);

        Objektiv standardObjektiv = new Objektiv(10, 100);
        Objektiv superObjektiv = new Objektiv(10, 300);

        MemoryCard samsung1 = new MemoryCard("Samsung", 128, 128);
        MemoryCard kingston1 = new MemoryCard("Kingstone", 256, 256);

        f1.setMaxBrennweite(222);
        f1.setMinBrennweite(8);
        f1.printFotoApparat(f1);

        f2.setObjektiv(superObjektiv);
        f2.setMemoryCard(samsung1);
        f2.printFotoApparat(f2);
        f2.makeFoto(samsung1);
        f2.makeFoto(samsung1);
        f2.makeFoto(samsung1);

        System.out.println("\nAvailable memory:"+samsung1.restSize+"\n");

        while(samsung1.restSize>f2.megapixel){
            f2.makeFoto(samsung1);
        }
        System.out.println("\nnot enough space on the memory card for another one");
        f2.setMemoryCard(kingston1);
        while(kingston1.restSize>f2.megapixel){
            f2.makeFoto(kingston1);
        }
        System.out.println("\nyou should buy another memory card");
    }
}
