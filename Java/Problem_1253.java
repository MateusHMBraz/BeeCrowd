import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int N = sc.nextInt();
            for (int i = 0; i < N; i++) {
                String text = sc.next();
                int shift = sc.nextInt();
                StringBuilder res = new StringBuilder();
                for (int j = 0; j < text.length(); j++) {
                    char c = (char) ((text.charAt(j) - 'A' - shift + 26) % 26 + 'A');
                    res.append(c);
                }
                System.out.println(res.toString());
            }
        }
        sc.close();
    }
}
