import java.util.Scanner;

public class DisplayTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            System.out.println();
            k += 2;
        }

        scanner.close();
    }
}
