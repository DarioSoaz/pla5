package ejercicioSpring;

import java.util.ArrayList;

public class Bloques implements IProcesar {
	
@Override
	
public ArrayList<String> dividir (String cadena) {
		
		int tamany=4;
		ArrayList<String> cadenas = new ArrayList<String>();
		
		while(cadena.length() >tamany) {
			cadenas.add(cadena.substring(0,tamany));
			cadena=cadena.substring(tamany);
		if(cadena.length()>0) {
			cadenas.add(cadena);
			}
		}
		return cadenas;
	}	

			
@Override
	
public String unir(ArrayList<String> cadenas) {
	
	String unir = "";
	for (int i = 0; i < cadenas.size(); i++) {
		unir = unir + cadenas.get(i).concat(" ");
	}
	return unir;
	}
}


