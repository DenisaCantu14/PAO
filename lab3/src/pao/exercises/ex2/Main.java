package pao.exercises.ex2;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Read sir: ");
        String sir = scanner.nextLine();

        StringBuilder rev = new StringBuilder(sir);
        rev.reverse();

        if ((rev.toString()).equals(sir))
            {
                System.out.println("Este palindrom");
            }
        else
            {
                System.out.println("Nu este palindrom");
            }

    }
}
