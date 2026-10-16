import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = 0, b = 1;
        
        for (int i = 0; i < N; i++) {
            System.out.print(a + (i == N - 1 ? "" : " "));
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
        sc.close();
    }
}
