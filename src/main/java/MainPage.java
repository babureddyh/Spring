import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.babu.spring.learning.beans.Triangle;

public class MainPage {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("MainPage applicaiton context hash code" + context.hashCode());
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
		context.registerShutdownHook();
	}
}
