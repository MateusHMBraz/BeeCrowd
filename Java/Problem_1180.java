import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int N = sc.nextInt();
            int minVal = sc.nextInt();
            int minPos = 0;

            for (int i = 1; i < N; i++) {
                int val = sc.nextInt();
                if (val < minVal) {
                    minVal = val;
                    minPos = i;
                }
            }

            System.out.println("Menor valor: " + minVal);
            System.out.println("Posicao: " + minPos);
        }
        sc.close();
    }
}
