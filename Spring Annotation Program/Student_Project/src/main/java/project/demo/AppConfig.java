package project.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //Replaces the XML
@ComponentScan(basePackages = "project.demo") //Finds the @Component automatically (searches for bean or object)
public class AppConfig {

}
