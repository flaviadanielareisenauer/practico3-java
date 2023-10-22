package estructurasDeControl;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer valor (v1): ");
        int v1 = sc.nextInt();

        System.out.print("Ingrese el segundo valor (v2): ");
        int v2 = sc.nextInt();

        if (v1 > v2) {
            int temp = v1;
            v1 = v2;
            v2 = temp;
        }

        System.out.print("Números impares en orden descendente: ");
        for (int i = v2; i >= v1; i--) {
            if (i % 2 != 0) {
                System.out.print(i);
                if (i != v1 && i != v2) {
                    System.out.print(", ");
                }
            }
        }

        System.out.println(); // Salto de línea al final
    }
}