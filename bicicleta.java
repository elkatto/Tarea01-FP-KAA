import java.util.Scanner;

public class bicicleta {

    public static void main(String[] args) {
        // definir variables
        double T, V, D;
        Scanner km = new Scanner(System.in);
        System.out.println("escriba la distancia en kilometros: ");
        D = km.nextDouble();
        System.out.println("escriba la velocidad en kilometros por hora: ");
        V = km.nextDouble();

        T = D / V;
        System.out.print("el tiempo que tarde en llegar es: " + T);

    }

}
