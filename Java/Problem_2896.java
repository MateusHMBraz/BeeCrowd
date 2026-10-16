import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int T = sc.nextInt();
            while (T-- > 0) {
                int N = sc.nextInt();
                int K = sc.nextInt();
                int res = (N / K) + (N % K);
                System.out.println(res);
            }
        }
        sc.close();
    }
}
