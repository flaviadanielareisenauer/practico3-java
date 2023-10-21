package estructurasDeControl;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de usuario
        Scanner sc = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un número de tres cifras
        System.out.print("Ingrese un número de tres cifras: ");
        int numero = sc.nextInt();
        
        // Verificar si el número es de tres cifras
        if (numero >= 100 && numero <= 999) {
            // Obtener las cifras individuales del número
            int digito1 = numero / 100;
            int digito3 = numero % 10;
            
            // Comprobar si el número es capicúa
            if (digito1 == digito3) {
                System.out.println("El número " + numero + " es capicúa.");
            } else {
                System.out.println("El número " + numero + " no es capicúa.");
            }
        } else {
            System.out.println("El número ingresado no es de tres cifras.");
        }

        sc.close();
    }
}