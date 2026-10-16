import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double media = (A * 2 + B * 3 + C * 5) / 10.0;
        System.out.printf("MEDIA = %.1f\n", media);
        sc.close();
    }
}
