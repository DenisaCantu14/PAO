package pao.exercises.ex2;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Read sir: ");
        String sir = scanner.nextLine();

        StringBuilder reverse = new StringBuilder();

        sir = sir.replaceAll("\\s+", "").toLowerCase();
        char[] array = sir.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            reverse.append(array[i]);
        }
        if ((reverse.toString()).equals(sir))
            System.out.println("Este palindrom");
        else
            System.out.println("Nu este palindrom");

    }
}
