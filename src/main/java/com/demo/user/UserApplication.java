package com.demo.user;

import com.demo.user.domain.Admin;
import com.demo.user.domain.Customer;
import com.demo.user.domain.User;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UserApplication {

	static ApplicationContext applicationContext;
	public static ApplicationContext getApplicationContext(){
		return applicationContext;
	}

	public static void main(String[] args) {
		applicationContext = SpringApplication.run(UserApplication.class, args);

		Customer dog = new Customer();   // new Admin();
		dog.setName("김고객");

		System.out.println(dog.speak());

		System.out.println("pet is eating");
		dog.eat();

		System.out.println(dog);
		

		System.out.println("pet is sleeping");
		dog.sleep();

		System.out.println(dog);

		dog.save();

	}

}
