import java.util.Scanner;

public class autobus {
    // ejercicio 2.7
    public static void main(String[] args) {
        // definir variables
        double km, costo, Precio;

        Scanner mkt = new Scanner(System.in);
        System.out.println("Escriba los kilometros a recorrer: ");
        km = mkt.nextDouble();
        System.out.println("Escribe el precio por kilometros: ");
        costo = mkt.nextDouble();
        // proceso

        Precio = (km * costo);

        // datos de salida
        System.out.println("El precio del boleto es: " + Precio);

    }

}
