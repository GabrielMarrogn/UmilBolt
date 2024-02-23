import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int a = sc.nextInt();
            double[] arr = new double[a];

            for (int i = 0; i < a; i++) {
                arr[i] = sc.nextDouble();
            }

            Arrays.sort(arr);

            System.out.println(arr[0]);
        }
        sc.close();
    }
}
