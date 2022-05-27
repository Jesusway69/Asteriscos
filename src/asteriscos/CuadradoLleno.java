package asteriscos;

import java.util.Scanner;

public class CuadradoLleno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" escribir cantidad: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
