package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp 
{
	public static void main(String[] args) 
	{
		// Read the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve the bean
		Coach theCoach = context.getBean("theBadmintonCoach", Coach.class);
		
//		For default bean id in the BadmintonCoach.java, this needs to be written for retrieving the bean 
//		Coach theCoach = context.getBean("badmintonCoach", Coach.class);
		
		//Call the methods
		System.out.println(theCoach.getDailyWorkout());
		
		// Close the context
		context.close();
	}
}
