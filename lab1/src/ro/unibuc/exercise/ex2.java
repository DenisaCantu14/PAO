package ro.unibuc.exercise;
import java.util.Scanner;

/**
 * Scrieți un program care sa compare doua numere a și b citite de la tastatura si sa afiseze numarul mai
 * mare.
 */

 public class ex2{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Read x: ");
        int x = scanner.nextInt();

        System.out.println("Read y: ");
        int y = scanner.nextInt();

        System.out.println(Math.max(x, y));


    }
}