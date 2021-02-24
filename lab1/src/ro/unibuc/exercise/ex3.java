package ro.unibuc.exercise;
import java.util.Scanner;

public class ex3{
    public static void main(String[] args)
    {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Read n= ");
        int n = scanner.nextInt();

        int fact = 1;
        for (int i = 2; i <= n; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorialul este " + fact);
    }
}