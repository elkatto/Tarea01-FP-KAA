import java.util.Scanner;

public class hipotenusa {

    public static void main(String[] args) {

        // definiir variable
        Double a, b, c;
        try (Scanner asd = new Scanner(System.in)) {
            System.out.println("ingrese el lado a: ");
            a = asd.nextDouble();
            System.out.println("ingrese el lado b: ");
            b = asd.nextDouble();
        }
        // proceso
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        // datos de salida
        System.out.print("la hipotenusa es: " + c);

    }
}