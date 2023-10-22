package estructurasDeControl;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jugadoresMayoresDe25 = 0;
        int defensoresMasDe3Goles = 0;
        int goleador = 0;
        int maxGoles = 0;
        int atacantesSinGoles = 0;
        int totalGoles16_22 = 0;
        int totalGoles23_29 = 0;
        int totalGoles30_36 = 0;

        while (true) {
            System.out.print("Ingrese edad, posición (D/M/A), y goles anotados (0, '0', 0 para terminar): ");
            int edad = sc.nextInt();
            char posicion = sc.next().charAt(0);
            int goles = sc.nextInt();

            if (edad == 0 && posicion == '0' && goles == 0) {
                break;
            }

            if (edad > 25) {
                jugadoresMayoresDe25++;
            }

            if (posicion == 'D' && goles > 3) {
                defensoresMasDe3Goles++;
            }

            if (goles > maxGoles) {
                maxGoles = goles;
                goleador = edad;
            }

            if (posicion == 'A' && goles == 0) {
                atacantesSinGoles++;
            }

            if (edad >= 16 && edad <= 22) {
                totalGoles16_22 += goles;
            } else if (edad >= 23 && edad <= 29) {
                totalGoles23_29 += goles;
            } else if (edad >= 30 && edad <= 36) {
                totalGoles30_36 += goles;
            }
        }

        System.out.println("Porc. de jugadores mayores de 25 años: " + (jugadoresMayoresDe25 * 100) + "%");
        System.out.println("Cant. de defensores con más de 3 goles: " + defensoresMasDe3Goles);
        System.out.println("Cant. de goles del goleador del grupo: " + maxGoles);
        System.out.println("Cant. de atacantes sin goles hechos: " + atacantesSinGoles);
        System.out.println("Cant. de goles según grupos etarios:");
        System.out.println("16-22 años: " + totalGoles16_22);
        System.out.println("23-29 años: " + totalGoles23_29);
        System.out.println("30-36 años: " + totalGoles30_36);
    }
}