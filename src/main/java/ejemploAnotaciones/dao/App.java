package ejemploAnotaciones.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("contexto.xml");
		usuarioFactory obj = (usuarioFactory) context.getBean("usuarioFactory");
		obj.getInserta();

	}

}
