package ro.unibuc.exercises;

public class Singleton {

        private static Singleton instance = null;
        public String name;

        private Singleton(String name)
        {
            this.name = name;
        }

        public static Singleton getInstance()
        {
            if (instance == null)
                instance = new Singleton("Singleton class");

            return instance;
        }
    }


    class Main
    {
        public static void main(String args[])
        {
            Singleton a = Singleton.getInstance();
            Singleton b = Singleton.getInstance();

            a.name = (a.name).toUpperCase();

            System.out.println("Object a " + a.name);
            System.out.println("Object b " + a.name);

            System.out.println("\n");

        }
    }


