import java.util.Scanner;

public class vidaDeUnaPersona {

    public static void main(String[] args) {
        int años;
        int meses, semanas, dias, horas;

        var ed = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        años = ed.nextInt();
        meses = años * 12;
        semanas = meses * 4;
        dias = semanas * 7;
        horas = dias * 24;

        System.out.print("la persona ha vivido: ");

        System.out.print("meses:/" + meses);

        System.out.print("    semanas:/" + semanas);

        System.out.print("    dias:/" + dias);

        System.out.print("    horas:/" + horas);

    }

}
