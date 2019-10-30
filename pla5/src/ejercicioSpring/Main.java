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
		
		System.out.println("escribe lo que quieres codificar con inversi�n");
		cadenaInver = datos.nextLine();
		
		//codificaci�n inversion
		System.out.println("SALIDA DE LA CODIFICACION POR INVERSION:");
		System.out.println(codigoInv.codificar(cadenaInver));
		cadenaInver = codigoInv.codificar(cadenaInver);
		
		//decodificaci�n inversi�n
		System.out.println("Muestra decodificaci�n por inversi�n");
		System.out.println(codigoInv.decodificar(cadenaInver));
		
		Codificador codigoCesar = contextCesar.getBean("codificador", Codificador.class);
		
		System.out.println("escribe lo que quieres codificar con la codificaci�n CESAR:");
		cadenaCesar = datos.nextLine();
		
		//codificaci�n cesar
		System.out.println("Muestra codificaci�n C�sar");
		System.out.println(codigoCesar.codificar(cadenaCesar));
		cadenaCesar = codigoInv.codificar(cadenaCesar);
		
		
		// decodificaci�n cesar
		System.out.println("Muestra decodificaci�n C�sar");
		System.out.println(codigoInv.decodificar(cadenaCesar));
		
		datos.close();
		contextInver.close();
		contextCesar.close();
		
	}
}