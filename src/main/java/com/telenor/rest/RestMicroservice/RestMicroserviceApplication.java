package com.telenor.rest.RestMicroservice;

import com.telenor.rest.domain.Employye;
import com.telenor.rest.services.EmpService;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class RestMicroserviceApplication implements CommandLineRunner{

        @Autowired
        EmpService empService;
	public static void main(String[] args) 
        {
            ApplicationContext cont=SpringApplication.run(RestMicroserviceApplication.class, args);
        for (String name: cont.getBeanDefinitionNames()) 
        {
           System.out.println(name);
        }
        }
        
        @Override
        public void run(String[] args)throws Exception
        {
           // Employye emp=new Employye();
            //emp.setId(1);
            //emp.setName("Kazim");
            //emp.setJob("SIO");
             empService.insertEmp(0,"kazim","SIO");
            //empService.findAll().forEach(employye->System.out.println(employye));
            //empService.print(); 
        }
}
