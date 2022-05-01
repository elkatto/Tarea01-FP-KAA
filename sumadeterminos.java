import java.util.Scanner;

public class sumadeterminos {
    // ejercicio 2.23
    private static Scanner sn;

    public static void main(String[] args) {
        // definir variables
        double suma = 0, termino;

        sn = new Scanner(System.in);

        System.out.println("Ingrese el n termino:");
        termino = sn.nextInt();

        suma = 2 * (termino + 1);
        System.out.print("la suma es: " + suma);

    }

}
