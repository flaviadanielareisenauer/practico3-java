package estructurasDeControl;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un número entero positivo: ");
            numero = sc.nextInt();
            
            if (numero <= 0) {
                System.out.println("El número ingresado no es válido. Debe ser un número entero positivo.");
            }
        } while (numero <= 0);

        System.out.println("¡Número válido ingresado! El número es: " + numero);
    }
}