import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.babu.spring.learning.aop.service.ShapeService;

public class AopMain {

	public static void main(String[] arguments) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
		System.out.println(shapeService.getCircle().getName()+" "+shapeService.getTriangle().getName());
	}

}
