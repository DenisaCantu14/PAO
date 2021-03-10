package pao.exercices.ex1.classes;

public class Area
{
    private CandyBag bag;
    private int number;
    private String street;

    public Area (){};
    public Area(CandyBag bag, int number, String  street)
    {
        this.bag = bag;
        this.number = number;
        this.street = street;
    }
    public void printAddress()
    {
        System.out.println("The complete address: " + this.street);
        System.out.println(this.bag);
    }
    public static void main(String[] args) {
        CandyBox []array = new CandyBox[3];
        array[0] = new Milka("capsuni", "origin", 4, 5);
        array[1] = new Merci("cacao", "origin", 4);
        array[2] = new Lindt("milk", "origin", 4, 5, 9);
        CandyBag bag = new CandyBag(array);
        Area area = new Area(bag, 3, "Str Florilor");
        area.printAddress();
    }
}
