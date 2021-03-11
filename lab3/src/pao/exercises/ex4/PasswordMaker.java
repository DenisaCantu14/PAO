package pao.exercises.ex4;

import java.util.Random;

public class PasswordMaker
{
    private final static int MAGIC_NUMBER = 4;
    private final static String MAGIC_STRING = getMagicString(20);
    private  static PasswordMaker instance = null;
    private String name;

    private PasswordMaker(String name)
    {
        this.name  = name;
    }

    public static String getMagicString(int length)
    {
        Random r = new Random();
        String str = "";
        for (int i = 0; i < length; i++)
        {
            str += (char) (48 + r.nextInt(47));
        }
        return str;
    }

    public static String getPassword(String s)
    {
        if (instance == null)
        {
            instance = new PasswordMaker(s);
        }

        String password = "";
        //un sir random de lungime magic_number
        password += getMagicString(MAGIC_NUMBER);

        Random r = new Random();
        //10 caractere din magic_string
        password += MAGIC_STRING.substring(0,10);
        //lungimea atributului name ca string
        password += Integer.toString(instance.name.length());

        //un nr random din [0,100]
        password += Integer.toString(r.nextInt(100));
        return password;

    }


}

class Main
{
    public static void main (String[] args)
    {
        String p = PasswordMaker.getPassword("name");
        String p2 = PasswordMaker.getPassword("s");

        System.out.println(p);
        System.out.println(p2);
    }
}