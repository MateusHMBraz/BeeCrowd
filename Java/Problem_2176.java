import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String S = sc.next();
            int ones = 0;
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == '1') ones++;
            }
            if (ones % 2 == 0) {
                System.out.println(S + "0");
            } else {
                System.out.println(S + "1");
            }
        }
        sc.close();
    }
}
