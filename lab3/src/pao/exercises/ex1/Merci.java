package pao.exercises.ex1;

import java.util.Objects;

public class Merci extends CandyBox
{
    private double length;

    public Merci(){}
    public Merci(String flavor, String origin, double length)
    {
        super(flavor, origin);
        this.length = length;
    }
    @Override
    double getVolume()
    {
        return length * length;
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
        Merci m = (Merci) obj;
        if (this.length != m.length)
            return false;
        return Objects.equals(this.flavor, m.flavor) && Objects.equals(this.origin, m.origin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, origin, length);
    }

    public static void main(String[] args) {
        Merci cutie1 = new Merci("capsuni", "origin", 4);
        Merci cutie2 = new Merci("capsuni", "origin", 4);
        Merci cutie3 = new Merci("lapte", "origin", 4);
        System.out.println(cutie1.toString());
        System.out.println(cutie1.equals(cutie2));
        System.out.println(cutie2.equals(cutie3));
    }
}
