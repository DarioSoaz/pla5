package ejercicioSpring;

public class Cesar implements ICodificar {

	@Override
	public String codificar(String cadena) {
		String salida = "";
		char carac;

		for (int i = 0; i < cadena.length(); i++) {
			carac = cadena.charAt(i);
			if (carac >='a'&&carac<='z') {
				carac = (char) (carac+2);
				if (carac > 'z') {
					carac = (char) (carac +'a'-'z'-1);
				}
				salida=salida+carac;
			} else if (carac >='A'&&carac<='Z') {
				carac =(char) (carac+2);
				if (carac > 'Z') {
					carac = (char) (carac+'A'-'Z'-1);
				}
				salida=salida+carac;
			} else {
				salida=salida+carac;
			}
		}
		return salida;
	}

	@Override
	public String decodificar(String cadena) {
		String salida = "";
		char carac;

		for (int i = 0; i < cadena.length(); i++) {
			carac = cadena.charAt(i);
			if (carac >='a'&&carac<='z') {
				carac = (char) (carac-2);
				if (carac>'z') {
					carac=(char) (carac +'a'-'z'-1);
				}
				salida = salida+carac;
			} else if (carac >='A'&&carac<='Z') {
				carac = (char) (carac-2);
				if (carac >'Z') {
					carac = (char) (carac +'A'-'Z'-1);
				}
				salida=salida+carac;
			} else {
				salida=salida+carac;
			}

		}
		return salida;
	}
}
