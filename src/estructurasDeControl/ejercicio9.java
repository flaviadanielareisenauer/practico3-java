package estructurasDeControl;

public class ejercicio9 {
    public static void main(String[] args) {
        for (int numero = 1000; numero <= 9999; numero++) {
            int cifra1 = numero / 1000;
            int cifra2 = (numero / 100) % 10;
            int cifra3 = (numero / 10) % 10;
            int cifra4 = numero % 10;
            
            int sumaCifrasPares = cifra1 + cifra3;
            int sumaCifrasImpares = cifra2 + cifra4;

            if (sumaCifrasPares == sumaCifrasImpares) {
                System.out.println(numero);
            }
        }
    }
}