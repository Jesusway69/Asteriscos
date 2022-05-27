package asteriscos;

import java.util.Scanner;

public class CuadradoVacio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" escribir cantidad");
        int n = sc.nextInt();
        for (int k = 0; k < n; k++) {
            System.out.print(" *");
        }
        System.out.println();
        for (int i = 0; i < n - 2; i++) {
            System.out.print(" *");

            for (int k = 0; k < n - 2; k++) {
                System.out.print("  ");
            }
            System.out.println(" *");
        }
        
        for (int k = 0; k < n; k++) {
            System.out.print(" *");
        }
        System.out.println();
    }

}
