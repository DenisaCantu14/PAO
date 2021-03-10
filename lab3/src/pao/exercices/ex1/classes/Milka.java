package pao.exercices.ex1.classes;

import java.util.Objects;

public class Milka extends CandyBox{
    private double radius;
    private double height;

    public Milka(){}
    public Milka(String flavor, String origin, double radius, double height)
    {
        super(flavor,origin);
        this.radius = radius;
        this.height = height;
    }
    @Override
    double getVolume()
    {
        return Math.PI * radius * radius * height;
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
        Milka m = (Milka) obj;
        if (this.radius != m.radius || this.height != m.height)
            return false;
        return Objects.equals(this.flavor, m.flavor) && Objects.equals(this.origin, m.origin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, origin, radius, height);
    }

    public static void main(String[] args) {
        Milka cutie1 = new Milka("capsuni", "origin", 4, 5);
        Milka cutie2 = new Milka("capsuni", "origin", 4, 5);
        Milka cutie3 = new Milka("capsuni", "origin", 4, 6);
        System.out.println(cutie1.toString());
        System.out.println(cutie1.equals(cutie2));
        System.out.println(cutie2.equals(cutie3));
    }
}
