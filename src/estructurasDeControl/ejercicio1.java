package estructurasDeControl;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la cantidad total de preguntas y la cantidad de preguntas correctas al usuario
        System.out.print("Ingrese la cantidad total de preguntas: ");
        int totalPreguntas = scanner.nextInt();

        System.out.print("Ingrese la cantidad de preguntas contestadas correctamente: ");
        int preguntasCorrectas = scanner.nextInt();

        // Calcular el porcentaje de respuestas correctas
        double porcentaje = (preguntasCorrectas * 100.0) / totalPreguntas;

        // Determinar el nivel del postulante
        String nivel;
        if (porcentaje >= 90) {
            nivel = "Nivel Máximo";
        } else if (porcentaje >= 75) {
            nivel = "Nivel Medio";
        } else if (porcentaje >= 50) {
            nivel = "Nivel Regular";
        } else {
            nivel = "Fuera de Nivel";
        }

        // Mostrar el resultado
        System.out.println("El postulante tiene un " + nivel + " con un porcentaje de respuestas correctas del " + porcentaje + "%.");

        scanner.close();
    }
}