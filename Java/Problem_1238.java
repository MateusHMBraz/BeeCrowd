import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int N = sc.nextInt();
            for (int i = 0; i < N; i++) {
                String s1 = sc.next();
                String s2 = sc.next();
                StringBuilder res = new StringBuilder();
                int maxLen = Math.max(s1.length(), s2.length());
                for (int j = 0; j < maxLen; j++) {
                    if (j < s1.length()) res.append(s1.charAt(j));
                    if (j < s2.length()) res.append(s2.charAt(j));
                }
                System.out.println(res.toString());
            }
        }
        sc.close();
    }
}
