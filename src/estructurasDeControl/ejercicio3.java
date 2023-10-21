package estructurasDeControl;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el importe a pagar: ");
        double importe = scanner.nextDouble();

        System.out.print("Ingrese el método de pago (c para contado, t para tarjeta): ");
        char metodoPago = scanner.next().charAt(0);

        double descuento = 0;

        if (metodoPago == 'c' || metodoPago == 'C') {
            if (importe > 100.00) {
                descuento = importe * 0.05;
            } else {
                descuento = importe * 0.03;
            }
        } else if (metodoPago == 't' || metodoPago == 'T') {
            if (importe > 100.00) {
                descuento = importe * 0.025;
            } else {
                descuento = importe * 0.02;
            }
        } else {
            System.out.println("Método de pago no válido. Use 'c' para contado o 't' para tarjeta.");
            return;
        }

        double montoFinal = importe - descuento;

        System.out.println("Porcentaje de descuento: " + (descuento / importe * 100) + "%");
        System.out.println("Monto de descuento: $" + descuento);
        System.out.println("Importe final con descuento: $" + montoFinal);
    }
}