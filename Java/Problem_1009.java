import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        double salary = sc.nextDouble();
        double sales = sc.nextDouble();
        
        double total = salary + (sales * 0.15);
        System.out.printf("TOTAL = R$ %.2f\n", total);
        sc.close();
    }
}
