import java.util.Scanner;

public class CalculateCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] title = new String[n];
        double[] cost = new double[n];
        int minCostIdx = 0;
        int maxCostIdx = 0;
        double totalCost = 0.0;
        double limit = 20.0;
        double discount = 0.9;

        for (int i = 0; i < n; i++) {
            title[i] = scanner.nextLine();
            cost[i] = scanner.nextDouble();
            scanner.nextLine();
            if (cost[i] < cost[minCostIdx]) {
                minCostIdx = i;
            }
            if (cost[i] > cost[maxCostIdx]) {
                maxCostIdx = i;
            }
            totalCost += (cost[i] > limit) ? discount * cost[i] : cost[i];
        }

        System.out.println("min: " + title[minCostIdx] + " (" + cost[minCostIdx] + ")");
        System.out.println("max:" + title[maxCostIdx] + " (" + cost[maxCostIdx] + ")");
        System.out.println("total cost after discount = " + totalCost);

        scanner.close();
    }
}
