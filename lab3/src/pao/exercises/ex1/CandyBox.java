package pao.exercises.ex1;

public abstract class CandyBox {
    protected String flavor;
    protected String origin;

    public CandyBox(){}
    public CandyBox(String flavor, String origin)
    {
        this.flavor = flavor;
        this.origin = origin;
    }
    abstract double getVolume();
    public String toString()
    {
        return "The " + this.origin + " " + this.flavor;
    }

}

