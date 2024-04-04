import java.util.ArrayList;
import java.util.List;

public class MaximumSumPath {
    public static void main(String[] args) {
        int[] X = {3, 6, 7, 8, 10, 12, 15, 18, 100};
        int[] Y = {1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50};

        int maxX = X.length;
        int maxY = Y.length;

        int i = 0, j = 0;
        int sumX = 0, sumY = 0, result = 0;
        List<Integer> path = new ArrayList<>();

        while (i < maxX && j < maxY) {
            if (X[i] < Y[j]) {
                sumX += X[i];
                path.add(X[i]);
                i++;
            } else if (X[i] > Y[j]) {
                sumY += Y[j];
                path.add(Y[j]);
                j++;
            } else { 
                result += Math.max(sumX, sumY);
                result += X[i]; 
                path.add(X[i]);
                sumX = 0;
                sumY = 0;
                i++;
                j++;
            }
        }

        while (i < maxX) {
            sumX += X[i];
            path.add(X[i]);
            i++;
        }

        while (j < maxY) {
            sumY += Y[j];
            path.add(Y[j]);
            j++;
        }

        // Add the maximum of the remaining sums
        result += Math.max(sumX, sumY);

        // Print maximum sum path
        System.out.print("The maximum sum path is: ");
        for (int k = 0; k < path.size() - 1; k++) {
            System.out.print(path.get(k) + " -> ");
        }
        System.out.println(path.get(path.size() - 1));

        System.out.println("The maximum sum is " + result);
    }
}
