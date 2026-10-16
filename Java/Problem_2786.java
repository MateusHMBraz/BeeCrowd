import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int C = sc.nextInt();

        int tipo1 = (L * C) + ((L - 1) * (C - 1));
        int tipo2 = ((L - 1) * 2) + ((C - 1) * 2);

        System.out.println(tipo1);
        System.out.println(tipo2);
        sc.close();
    }
}
