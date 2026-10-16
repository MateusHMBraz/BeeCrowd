import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();

        if (salary <= 2000.0) {
            System.out.println("Isento");
        } else if (salary <= 3000.0) {
            double tax = (salary - 2000.0) * 0.08;
            System.out.printf("R$ %.2f\n", tax);
        } else if (salary <= 4500.0) {
            double tax = (1000.0 * 0.08) + ((salary - 3000.0) * 0.18);
            System.out.printf("R$ %.2f\n", tax);
        } else {
            double tax = (1000.0 * 0.08) + (1500.0 * 0.18) + ((salary - 4500.0) * 0.28);
            System.out.printf("R$ %.2f\n", tax);
        }
        sc.close();
    }
}
