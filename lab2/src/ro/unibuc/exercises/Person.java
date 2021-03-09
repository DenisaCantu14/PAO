package ro.unibuc.exercises;

public class Person {
//    int noOfLegs = 4;

    private String name;
    private String surname;
    private int age;
    private long identity;
    private String type;

    public Person() {
    }

    public Person(String name, String surname, int age, long identity, String type) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.identity = identity;
        this.type = type;

    }

    // generated getters and setters; in Intellij command is Alt+Insert


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getIdentity() {
        return identity;
    }

    public void setIdentity(Long identity) {
        this.identity = identity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void Print()
    {
        System.out.println( "Name: " + this.name + "\n" +
                            "Surname: " + this.surname + "\n" +
                            "Age: " + this.age + "\n" +
                            "Identity: " + this.identity + "\n" +
                            "Type: " + this.type + "\n" );
    }

    public static void main(String args[])
    {

        Person p1 = new Person("Alex", "Popescu", 23, 999999999, "male");

        Person p2 = new Person("Ana", "Ionescu", 38, 123456789, "female");

        p1.Print();
        p2.Print();
    }
}
