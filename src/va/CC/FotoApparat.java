package va.CC;

public class FotoApparat {
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

    public int getBrennweite() {
        return brennweite;
    }

    public void setBrennweite(int brennweite) {
        this.brennweite = brennweite;
    }

    public String getHerkunftsland() {
        return herkunftsland;
    }

    public void setHerkunftsland(String herkunftsland) {
        this.herkunftsland = herkunftsland;
    }

    String marke;
    String model;
    int megapixel;
    int brennweite;
    String herkunftsland;

    public FotoApparat(String marke, String model, int megapixel, int brennweite, String herkunftsland) {
        this.marke = marke;
        this.model = model;
        this.megapixel = megapixel;
        this.brennweite = brennweite;
        this.herkunftsland = herkunftsland;
    }

    public void getFotoApparat(FotoApparat x) {
        System.out.println("Marke: " + this.marke + "\nModel: " + this.model + "\nHerkunftsland: " + this.herkunftsland + "\nMegapixel: " + this.megapixel + "\nBrenweite: " + this.brennweite + "\n");
    }
}
