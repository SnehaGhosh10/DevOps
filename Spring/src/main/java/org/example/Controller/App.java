package org.example.Controller;

import org.example.Entity.Employee;
import org.example.Entity.PojoClass;
import org.example.Entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {

    @SuppressWarnings("resources")
    public static void main(String[] args) {
        System.out.println();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee employee = applicationContext.getBean("empbean2", Employee.class);
        System.out.println(employee);

        System.out.println();

        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);

        System.out.println();

        PojoClass pojoClass = applicationContext.getBean("empbean4", PojoClass.class);
        System.out.println(pojoClass);

        System.out.println();

    }

}