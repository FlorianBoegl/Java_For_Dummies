package Kapitel15;

public class LandKreis<T extends Comparable<T>>
        implements Comparable<LandKreis<T>> {
    protected String wo;
    protected long einwohner;
    LandKreis(String w, long e) {
        wo = w;
        einwohner = e;
    }
     public String getWo() {
        return this.wo;
    }
    long getEinwohner() {
        return this.einwohner;
    }
    @Override
    public int compareTo(LandKreis<T> o) {
        return this.getWo().compareTo(o.getWo());
    }

    @Override
    public boolean equals(Object other) {
        return this.getWo().equals(((LandKreis<?>) other).getWo()) &&
               this.getEinwohner() == ((LandKreis<?>) other).getEinwohner();
    }
    @Override
    public int hashCode() {
        return this.getWo().hashCode();
    }
}