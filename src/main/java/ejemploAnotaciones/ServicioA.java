package ejemploAnotaciones;

import org.springframework.stereotype.Service;

@Service
public class ServicioA {
	public String getMensaje() {
		return "Enviando mensaje de Servicio A";
	}

}
