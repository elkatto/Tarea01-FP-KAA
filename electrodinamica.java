import java.util.Scanner;

public class electrodinamica {
    public static void main(String[] args) {
        // definir variables
        double P, R = 4, I;
        try (// datos de entrada
        Scanner lt = new Scanner(System.in)) {
            System.out.println("ingrese el valor de la intensidad: ");
            I = lt.nextDouble();
        }
        // proceso
        P = R * Math.pow(I, 2);
        // datos de salida
        System.out.println("la pontencia es: " + P);

    }

}
