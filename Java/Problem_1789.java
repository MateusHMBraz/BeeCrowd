import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int L = sc.nextInt();
            int maxSpeed = 0;
            for (int i = 0; i < L; i++) {
                int speed = sc.nextInt();
                if (speed > maxSpeed) maxSpeed = speed;
            }
            if (maxSpeed < 10) System.out.println(1);
            else if (maxSpeed < 20) System.out.println(2);
            else System.out.println(3);
        }
        sc.close();
    }
}
