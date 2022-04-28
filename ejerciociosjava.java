import java.util.Scanner;

public class ejerciociosjava {
    public static void main(String[] args) {

        // 2.19
        // definir variables
        double L, Pi = 3.1416, R;
        try (// datos de entrada
                var lt = new Scanner(System.in)) {
            System.out.println("Ingrese el valor del radio: ");

            R = lt.nextDouble();
        }
        // proceso
        L = Pi * Math.pow(R, 2);
        // datos de salida
        System.out.println("La longitud es; " + L);

    }
}
