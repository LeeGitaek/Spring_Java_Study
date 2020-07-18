package expert001_01;

// add import => spring framework package
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("/src/main/java/expert001_01/expert001_01.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("expert001_01.xml", Driver.class);
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("expert001_01/expert001_01.xml");

		Car car = context.getBean("car", Car.class); 
		
		Tire tire = context.getBean("tire", Tire.class);

		
		car.setTire(tire);
		
		System.out.println(car.getTireBrand());
	}
}
