package ejemploAnotaciones.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class usuarioFactory {
	@Autowired
	usuarioImpMongo usr;
	
	public void getInserta() {
		usr.inserta();
	}

}
