package ro.unibuc.exercise;
import java.util.Scanner;

public class ex5{
    public static void main(String[] args)
    {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Read n= ");
        int n = scanner.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];
        int nr_a = 0, nr_b = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Read element " + (i + 1) + ": ");
            int element = scanner.nextInt();
            if (element % 2 == 0) {
                a[nr_a] = element;
                nr_a++;
            } else {
                b[nr_b] = element;
                nr_b++;
            }
        }

        System.out.println("Vectorul x: ");
        for (int i = 0; i < nr_a; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        System.out.println("Vectorul y: ");
        for (int i = 0; i < nr_b; i++) {
            System.out.print(b[i] + " ");
        }
    }
}