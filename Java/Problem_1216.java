import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double totalDist = 0;
        int count = 0;

        while (sc.hasNext()) {
            String name = sc.nextLine();
            if (sc.hasNextDouble()) {
                double dist = sc.nextDouble();
                sc.nextLine();
                totalDist += dist;
                count++;
            }
        }

        if (count > 0) {
            System.out.printf("%.1f\n", totalDist / count);
        }
        sc.close();
    }
}
