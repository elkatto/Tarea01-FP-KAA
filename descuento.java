
import java.io.*;

public class descuento {
	//2.12

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		//definir variables
		double dsct;
		double igv;
		double precio;
		double total;
		System.out.println("ingresa el precio del articulo");
		precio = Double.parseDouble(bufEntrada.readLine());
		//proceso
		dsct = precio*0.20;
		igv = (precio-dsct)*0.18;
		total = (precio-dsct)+igv;
		precio = precio - dsct;
		//datos de salida
		System.out.println("El precio con descuento es: " +precio);

		System.out.println("El precio final con igv es: " + total);
	}


}

