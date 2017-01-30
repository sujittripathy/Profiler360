package com.hyperion;

import com.hyperion.properties.Profile360Properties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import java.util.Arrays;

@SpringBootApplication
@ConfigurationProperties
public class Profiler360Application {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Profiler360Application.class, args);
		String beanNames[] = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for(String s:beanNames){
			//System.out.println(s);
		}

		Profile360Properties obj = (Profile360Properties)ctx.getBean("profile360Properties");
		//System.out.println(obj);

	}
}
