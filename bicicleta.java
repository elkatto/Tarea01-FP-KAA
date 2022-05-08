import java.util.Scanner;

<<<<<<< HEAD
public class bicicleta {
=======
public class bicicleta
{
>>>>>>> fc89a5d85c44e58acfad7b40bc0619a574688f22

    public static void main(String[] args) {
        // definir variables
        double T, V, D;
        Scanner lt = new Scanner(System.in);
        System.out.println("escriba la distancia en kilometros: ");
        D = lt.nextDouble();
        System.out.println("escriba la velocidad en kilometros por hora: ");
        V = lt.nextDouble();

        T = D / V;
        System.out.print("el tiempo que tarde en llegar es: " + T);

    }

}
