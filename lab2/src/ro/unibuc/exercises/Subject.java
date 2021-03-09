package ro.unibuc.exercises;

public class Subject {
    private Room room;
    private int noOfStudents;
    private Person teacher;

    public Subject(Room room, int nr, Person teacher)
    {
        this.room = room;
        this.noOfStudents = nr;
        this.teacher = teacher;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    public void Print()
    {
        System.out.println("Room:");
        this.room.Print();
        System.out.println("Number of Students: " + getNoOfStudents() + '\n');
        System.out.println("Teacher:");
        this.teacher.Print();
    }

    public static void main(String args[]) {

        Room room1 = new Room(113, "classic", 7);
        Room room2 = new Room(73, "classic", 8);


        Person p1 = new Person("Alex", "Popescu", 23, 999999999, "male");
        Person p2 = new Person("Ana", "Ionescu", 38, 123456789, "female");

       Subject s1 = new Subject(room1, 34, p1);
       Subject s2 = new Subject(room2, 28, p2);

       s1.Print();
       s2.Print();
    }

}
