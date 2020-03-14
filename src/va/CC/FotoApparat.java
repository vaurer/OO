package va.CC;

public class FotoApparat {

    String marke;
    String model;
    int megapixel;
    int minBrennweite;
    int maxBrennweite;
    String herkunftsland;

    double memoryCard;

    public FotoApparat(String marke, String model, int megapixel, int minBrennweite, int maxBrennweite, String herkunftsland, double memoryCard) {
        this.marke = marke;
        this.model = model;
        this.megapixel = megapixel;
        this.minBrennweite = minBrennweite;
        this.maxBrennweite = maxBrennweite;
        this.herkunftsland = herkunftsland;
        this.memoryCard = memoryCard;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMegapixel() {
        return megapixel;
    }

    public void setMegapixel(int megapixel) {
        this.megapixel = megapixel;
    }

    public int getMinBrennweite() {
        return minBrennweite;
    }

    public void setMinBrennweite(int minBrennweite) {
        this.minBrennweite = minBrennweite;
    }

    public String getHerkunftsland() {
        return herkunftsland;
    }

    public void setHerkunftsland(String herkunftsland) {
        this.herkunftsland = herkunftsland;
    }

    public int getMaxBrennweite() {
        return maxBrennweite;
    }

    public void setMaxBrennweite(int maxBrennweite) {
        this.maxBrennweite = maxBrennweite;
    }

    public double getMemoryCard() {
        return memoryCard;
    }

    public void setMemoryCard(double memoryCard) {
        this.memoryCard = memoryCard;
    }

    public void setObjektiv(Objektiv objektiv) {
        this.maxBrennweite = objektiv.getMaxBrennweite();
        this.minBrennweite = objektiv.getMinBrennweite();
    }

    public void setMemoryCard(MemoryCard memoryCard) {
        this.memoryCard = memoryCard.size;
        this.memoryCard = memoryCard.restSize;
    }

    public void makeFoto(MemoryCard memoryCard){
        this.memoryCard = memoryCard.restSize;
        memoryCard.restSize= memoryCard.restSize-this.megapixel;
        System.out.println("Klick!\nyou have "+memoryCard.restSize + " MB free");
    }

    public void printFotoApparat(FotoApparat x) {
        System.out.println("Marke: " + this.marke + "\nModel: " + this.model + "\nHerkunftsland: " + this.herkunftsland + "\nMegapixel: " + this.megapixel + "\nBrennweite MIN : " + this.minBrennweite + "\nBrennweite MAX : " + this.maxBrennweite + "\nMemoryCard größe: " + this.memoryCard + "\n");
    }

}
