package va.CC;

public class MemoryCard {
    double size;
    double restSize;
    String name;

    public MemoryCard(String name, double size, double restSize) {
        this.name = name;
        this.size = size;
        this.restSize = size;
    }

    public void setMemoryCardFromFotoaparat(FotoApparat fotoaparat) {
        this.size = fotoaparat.getMemoryCard().getSize();
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getRestSize() {
        return restSize;
    }

    public void setRestSize(double restSize) {
        this.restSize = restSize;
    }
}
