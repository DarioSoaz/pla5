package ejercicioSpring;

import java.util.Scanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		// Cargo el contexto
		AnnotationConfigApplicationContext contextInver = new AnnotationConfigApplicationContext(ConfInver.class);
		AnnotationConfigApplicationContext contextCesar = new AnnotationConfigApplicationContext(ConfCesar.class);

		Codificador codigoInv = contextInver.getBean("codificador", Codificador.class);
				
		String cadenaInver = "";
		String cadenaCesar = "";
		Scanner datos = new Scanner(System.in);
		
		System.out.println("escribe lo que quieres codificar con inversión");
		cadenaInver = datos.nextLine();
		
		//codificación inversion
		System.out.println("SALIDA DE LA CODIFICACION POR INVERSION:");
		System.out.println(codigoInv.codificar(cadenaInver));
		cadenaInver = codigoInv.codificar(cadenaInver);
		
		//decodificación inversión
		System.out.println("Muestra decodificación por inversión");
		System.out.println(codigoInv.decodificar(cadenaInver));
		
		Codificador codigoCesar = contextCesar.getBean("codificador", Codificador.class);
		
		System.out.println("escribe lo que quieres codificar con la codificación CESAR:");
		cadenaCesar = datos.nextLine();
		
		//codificación cesar
		System.out.println("Muestra codificación César");
		System.out.println(codigoCesar.codificar(cadenaCesar));
		cadenaCesar = codigoInv.codificar(cadenaCesar);
		
		
		// decodificación cesar
		System.out.println("Muestra decodificación César");
		System.out.println(codigoInv.decodificar(cadenaCesar));
		
		datos.close();
		contextInver.close();
		contextCesar.close();
		
	}
}
