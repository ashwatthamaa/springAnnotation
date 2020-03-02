package config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import serUser.UserServiceImpl;

public class ConfigurationJava {

	public static void main(String []args){
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanDef.class);
		UserServiceImpl usi = (UserServiceImpl)context.getBean(UserServiceImpl.class);
		String s = usi.addUser(1, "Pankaj", 26);
		System.out.println(s);
	}
}
