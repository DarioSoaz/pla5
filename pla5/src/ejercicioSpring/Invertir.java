package ejercicioSpring;

public class Invertir implements ICodificar {
	
	@Override
	public String codificar(String cadena) {
	    String invertir = ""; 
        for(int i = cadena.length() - 1; i >= 0; i--) {
            invertir = invertir + cadena.charAt(i);
            }
        return invertir;
	}

	@Override
	public String decodificar(String cadena) {
		String invertir = ""; 
        for(int i = cadena.length() - 1; i >= 0; i--) {
            invertir = invertir + cadena.charAt(i);
            }
        return invertir;
	}

}
