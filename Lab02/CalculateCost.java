import java.util.Scanner;

public class CalculateCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        double[] cost = new double[n];
        double minCost = Double.MAX_VALUE;
        double maxCost = 0.0;
        double totalCost = 0.0;
        double limit = 20.0;
        double discount = 0.9;

        for (int i = 0; i < n; i++) {
            cost[i] = scanner.nextDouble();
            minCost = Math.min(minCost, cost[i]);
            maxCost = Math.max(maxCost, cost[i]);
            totalCost += (cost[i] > limit) ? discount * cost[i] : cost[i];
        }

        System.out.println("min cost = " + minCost);
        System.out.println("max cost = " + maxCost);
        System.out.println("total cost = " + totalCost);

        scanner.close();
    }
}
