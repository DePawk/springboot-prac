package SB.prac;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx)
	{
		return args->{
			System.out.println("Lets Test beans provided by spring boot:");
			String[] beanNames =ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for(String beanName:beanNames)
			{
				System.out.println(beanName);
			}
		};
	}

}
