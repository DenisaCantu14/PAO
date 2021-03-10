package pao.exercices.ex1.classes;

import java.util.Objects;

public class Lindt extends CandyBox {
    private double length;
    private double width;
    private double height;
    public Lindt(){}
    public Lindt(String flavor, String origin, double length, double width, double height)
    {
        super(flavor, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }
    @Override
    double getVolume()
    {
        return length * width * height;
    }

    @Override
    public String toString()
    {
        return super.toString() + " has volume " + getVolume();
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Lindt l = (Lindt) obj;
        if (this.length != l.length || this.width != l.width || this.height != l.height)
            return false;
        return Objects.equals(this.flavor, l.flavor) && Objects.equals(this.origin, l.origin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, origin, length, width, height);
    }

    public static void main(String[] args) {
        Lindt cutie1 = new Lindt("capsuni", "origin", 4, 5, 9);
        Lindt cutie2 = new Lindt("capsuni", "origin", 4, 5, 9);
        Lindt cutie3 = new Lindt("capsuni", "origin", 2, 4, 3);
        System.out.println(cutie1.toString());
        System.out.println(cutie1.equals(cutie2));
        System.out.println(cutie2.equals(cutie3));
    }
}
