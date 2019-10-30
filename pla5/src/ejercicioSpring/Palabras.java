package ejercicioSpring;

import java.util.ArrayList;
import java.util.Arrays;

public class Palabras implements IProcesar {
	

	@Override
	public ArrayList<String> dividir (String cadena) {
		ArrayList<String> palabras = new ArrayList<String>();
		palabras.addAll(Arrays.asList(cadena.split(" ")));
		return palabras;
	}

		
	@Override
	public String unir(ArrayList<String> cadenas) {
	
		return String.join(" ", cadenas);
	}
}
