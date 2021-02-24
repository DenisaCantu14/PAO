package ro.unibuc.exercise;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Read n= ");
        int n = scanner.nextInt();

        int s = 0;
        for (int i = 3; i <= n; i++)
        {
            if(i % 3 == 0 || i % 5 == 0)
            {
                s += i;
            }
        }
        System.out.println("Suma este " + s);
    }
}