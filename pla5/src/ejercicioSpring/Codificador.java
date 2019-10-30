package ejercicioSpring;

import java.util.ArrayList;

public class Codificador {
	
	private IProcesar procesar;
	private ICodificar codificacion;
	
	public Codificador(IProcesar procesar, ICodificar codificacion) {
		super();
		this.procesar = procesar;
		this.codificacion = codificacion;
	}

	public IProcesar getProcesar() {
		return procesar;
	}

	public void setProcesar(IProcesar procesar) {
		this.procesar = procesar;
	}

	public ICodificar getCodificacion() {
		return codificacion;
	}

	public void setCodificacion(ICodificar codificacion) {
		this.codificacion = codificacion;
	}
	
	public String codificar(String cadena) {
		ArrayList<String> res = new ArrayList<String>();
		ArrayList<String> in = new ArrayList<String>();
		in = procesar.dividir(cadena);
		String cadFinal = "";
		
		for (int i = 0; i < in.size(); i++) {
			res.add(codificacion.codificar(in.get(i)));
		}
		cadFinal = procesar.unir(res);	
		return cadFinal;
	}
	
	public String decodificar(String cadena) {
		ArrayList<String> res = new ArrayList<String>();
		ArrayList<String> in = new ArrayList<String>();
		in = procesar.dividir(cadena);
		String cadFinal = "";
		
		for (int i = 0; i < in.size(); i++) {
			res.add(codificacion.decodificar(in.get(i)));
		}
		cadFinal = procesar.unir(res);	
		return cadFinal;
	}
	
}
