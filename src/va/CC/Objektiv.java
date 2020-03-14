package va.CC;

public class Objektiv {

    int minBrennweite;
    int maxBrennweite;

    public Objektiv(int minBrennweite, int maxBrennweite) {
        this.minBrennweite = minBrennweite;
        this.maxBrennweite = maxBrennweite;
    }

    public void setObjektivFromForoaparat(FotoApparat fotoApparat) {
        this.minBrennweite = fotoApparat.getMinBrennweite();
        this.maxBrennweite = fotoApparat.getMaxBrennweite();
    }

    public int getMinBrennweite() {
        return minBrennweite;
    }

    public void setMinBrennweite(int minBrennweite) {
        this.minBrennweite = minBrennweite;
    }

    public int getMaxBrennweite() {
        return maxBrennweite;
    }

    public void setMaxBrennweite(int maxBrennweite) {
        this.maxBrennweite = maxBrennweite;
    }


}
