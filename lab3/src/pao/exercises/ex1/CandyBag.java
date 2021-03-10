package pao.exercises.ex1;

public class CandyBag {
    private CandyBox array[];

    public CandyBag(){};
    public CandyBag(CandyBox arr[])
    {
        array = new CandyBox[arr.length];
        for(int i = 0; i < arr.length; i++ )
        {
            this.array[i] = arr[i];
        }
    }
    @Override
    public String toString()
    {
        String afisare = "";
        for(int i = 0; i < array.length; i++ )
        {
           afisare = afisare + '\n' + this.array[i].toString();
        }

        return afisare;
    }
    public static void main(String[] args) {

    }
}
