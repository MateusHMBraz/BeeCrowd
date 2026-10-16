import java.util.Scanner;

public class Main {
    private static void printArray(int[] arr, int count, String name) {
        for (int i = 0; i < count; i++) {
            System.out.println(name + "[" + i + "] = " + arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] par = new int[5];
        int[] impar = new int[5];
        int pCount = 0, iCount = 0;

        for (int k = 0; k < 15; k++) {
            int x = sc.nextInt();
            if (x % 2 == 0) {
                par[pCount++] = x;
                if (pCount == 5) {
                    printArray(par, 5, "par");
                    pCount = 0;
                }
            } else {
                impar[iCount++] = x;
                if (iCount == 5) {
                    printArray(impar, 5, "impar");
                    iCount = 0;
                }
            }
        }

        printArray(impar, iCount, "impar");
        printArray(par, pCount, "par");
        sc.close();
    }
}
