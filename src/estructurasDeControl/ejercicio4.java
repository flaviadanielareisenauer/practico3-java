package estructurasDeControl;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el día de su cumpleaños: ");
        int dia = sc.nextInt();

        System.out.println("Ingrese el mes de su cumpleaños (como número): ");
        int mes = sc.nextInt();

        String signo = determinarSignoZodiaco(dia, mes);

        if (signo != null) {
            System.out.println("Su signo zodiacal es: " + signo);
        } else {
            System.out.println("La fecha ingresada es incorrecta.");
        }
    }

    public static String determinarSignoZodiaco(int dia, int mes) {
        if ((mes == 3 && dia >= 21 && dia <= 31) || (mes == 4 && dia >= 1 && dia <= 20)) {
            return "Aries";
        } else if ((mes == 4 && dia >= 21 && dia <= 30) || (mes == 5 && dia >= 1 && dia <= 21)) {
            return "Tauro";
        } else if ((mes == 5 && dia >= 22 && dia <= 31) || (mes == 6 && dia >= 1 && dia <= 21)) {
            return "Géminis";
        } else if ((mes == 6 && dia >= 22 && dia <= 30) || (mes == 7 && dia >= 1 && dia <= 23)) {
            return "Cáncer";
        } else if ((mes == 7 && dia >= 24 && dia <= 31) || (mes == 8 && dia >= 1 && dia <= 23)) {
            return "Leo";
        } else if ((mes == 8 && dia >= 24 && dia <= 31) || (mes == 9 && dia >= 1 && dia <= 23)) {
            return "Virgo";
        } else if ((mes == 9 && dia >= 24 && dia <= 30) || (mes == 10 && dia >= 1 && dia <= 23)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 24 && dia <= 31) || (mes == 11 && dia >= 1 && dia <= 22)) {
            return "Escorpio";
        } else if ((mes == 11 && dia >= 23 && dia <= 30) || (mes == 12 && dia >= 1 && dia <= 21)) {
            return "Sagitario";
        } else if ((mes == 12 && dia >= 22 && dia <= 31) || (mes == 1 && dia >= 1 && dia <= 20)) {
            return "Capricornio";
        } else if ((mes == 1 && dia >= 21 && dia <= 31) || (mes == 2 && dia >= 1 && dia <= 19)) {
            return "Acuario";
        } else if ((mes == 2 && dia >= 20 && dia <= 29) || (mes == 3 && dia >= 1 && dia <= 20)) {
            return "Piscis";
        } else {
            return null; // La fecha ingresada es incorrecta
        }
    }
}