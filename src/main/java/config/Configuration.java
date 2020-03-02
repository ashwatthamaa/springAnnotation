package config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import serUser.UserServiceImpl;

public class Configuration {

	public static void main(String []args){
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.configuration.xml");
		UserServiceImpl usi = (UserServiceImpl)context.getBean(UserServiceImpl.class);
		String s = usi.addUser(1, "Pankaj", 26);
		System.out.println(s);
	}
}
