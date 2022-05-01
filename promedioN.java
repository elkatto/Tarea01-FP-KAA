import java.util.Scanner;

public class promedioN {
    public static void main(String[] args) {
        double N1, N2, N3, Promedio;
        Scanner nt = new Scanner(System.in);
        System.out.println("ingrese sus primera calificacion");
        N1 = nt.nextDouble();
        System.out.println("ingrese sus segunda calificacion");
        N2 = nt.nextDouble();
        System.out.println("ingrese sus tercera calificacion");
        N3 = nt.nextDouble();

        // proceso

        N1 = N1 * 0.25;
        N2 = N2 * 0.25;
        N3 = N3 * 0.50;
        Promedio = N1 + N2 + N3;

        System.out.println("El promedio del estudiante es: " + Promedio);
    }
}