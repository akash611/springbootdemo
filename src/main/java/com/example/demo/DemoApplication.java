package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// @SpringBootApplication
public class DemoApplication {

  // @Value("${NAME:World}")
  // String name;

  // @RestController
  // class HelloworldController {
  //   @GetMapping("/")
  //   String hello() {
  //     return "Hello " + name + "!";
  //   }
  // }

  @SuppressWarnings("resource")
  public static void main(String[] args) {
    // SpringApplication.run(DemoApplication.class, args);
    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    Alien obj =  context.getBean("alien", Alien.class);
    // Alien obj2 = (Alien) context.getBean("alien");
    // obj.setAge(25);
    // System.out.println(obj2.getAge());
    obj.code();
    // obj2.code();
    // Desktop desk = context.getBean(Desktop.class);
    // desk.compile();

  }

}
