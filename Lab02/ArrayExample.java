import java.util.Scanner;
import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] a = new double[n];
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextDouble();
            sum += a[i];
        }   

        Arrays.sort(a);

        System.out.println("sum = " + sum);
        System.out.println("average = " + sum / n);
        System.out.print("sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        scanner.close();
    }
}
