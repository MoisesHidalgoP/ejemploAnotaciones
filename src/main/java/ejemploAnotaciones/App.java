package ejemploAnotaciones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("contexto.xml");
		ServicioA obj = (ServicioA) context.getBean("servicioA");
		System.out.println(obj.getMensaje());

	}

}
