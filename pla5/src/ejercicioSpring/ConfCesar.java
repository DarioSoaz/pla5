package ejercicioSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class ConfCesar {
	@Bean
	public IProcesar palabras() {
		return new Palabras();
	}
	
	@Bean
	public ICodificar cesar() {
		return new Cesar();
	}
    
    @Bean
	public Codificador codificador() {	
		return new Codificador(new Palabras(), new Cesar());
	}

	
}
