package asteriscos;

import java.util.Scanner;

public class Romboide {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" escribir cantidad: ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int k = n - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.println(" *");
            }

            System.out.println();
        }

    }

}
