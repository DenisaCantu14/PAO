package ro.unibuc.exercises;

public class Room {
    private int number;
    private String type;
    private int floor;

    public Room(int number, String type, int floor)
    {
        this.number = number;
        this.type = type;
        this.floor = floor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void Print()
    {
        System.out.println( "Nr: " + this.number + "\n" +
                "Type: " + this.type + "\n" +
                "Floor: " + this.floor + "\n" );
    }

    public static void main(String args[]) {

        Room room1 = new Room(113, "classic", 7);
        Room room2 = new Room(73, "classic", 8);
        room1.Print();
        room2.Print();
    }
}
