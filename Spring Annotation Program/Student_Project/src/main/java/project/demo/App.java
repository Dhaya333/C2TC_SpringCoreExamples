package project.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       
       StudentService service = context.getBean(StudentService.class);
       
       service.displayStudent();
       
       
    }
}
