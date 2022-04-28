import java.util.Scanner;

public class ejercicion2 {

    public static void main(String[] args) {
        // 2.2
        // definir variables
        double soles, dolares;
        // datos de entrada

        Scanner hc = new Scanner(System.in);
        System.out.println("ingrese total de soles");

        soles = hc.nextDouble();
        // proceso
        dolares = soles / 3.85;
        // datos de salida
        System.out.println("el total de dolares es: " + dolares);

    }
}
