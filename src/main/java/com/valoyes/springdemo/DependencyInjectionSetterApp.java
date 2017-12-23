package com.valoyes.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.valoyes.springdemo.domain.Organization;

public class DependencyInjectionSetterApp {

	public static void main(String[] args) {
		
		// 1. creamos el aplication-context (container)
		// el beans-cp.xml tiene que estar en el class path
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");

		// 2. creamos el bean
		Organization org = (Organization) ctx.getBean("myorg");

		// 3. invoke the company slogan via de bean
		System.out.println(org.comporateSlogan());
		
		// 3.1 imprimir nuestro objecto Organization
		System.out.println(org);	
		
		// 3.2 
		System.out.println(org.corporateService());

		// 4. cerramos el application conxtext (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}
}
