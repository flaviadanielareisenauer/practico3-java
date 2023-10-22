package estructurasDeControl;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la población actual (PobAct): ");
        double poblacionActual = sc.nextDouble();

        System.out.print("Ingrese la tasa de crecimiento anual (Tasa): ");
        double tasaCrecimientoAnual = sc.nextDouble();

        System.out.print("Ingrese la población esperada (PobEsp): ");
        double poblacionEsperada = sc.nextDouble();

        int anio = 0;
        
        while (poblacionActual < poblacionEsperada) {
            poblacionActual += tasaCrecimientoAnual;
            anio++;
        }

        System.out.println("En " + anio + " años se alcanzará la población esperada.");
    }
}