import java.util.Scanner;

public class qwerty {
    public static void main(String[] args) {
        // 2.1
        // definir variables
        double area, base, altura;
        try (// datos de entrada
                var lt = new Scanner(System.in)) {
            System.out.println("Ingrese la altura del triangulo: ");

            altura = lt.nextDouble();
            System.out.println("Ingrese la base del triangulo: ");
            base = lt.nextDouble();
        }
        // proceso
        area = (altura * base) / 2;
        // datos de salida
        System.out.println("el area es; \n" + area);

    }

}
