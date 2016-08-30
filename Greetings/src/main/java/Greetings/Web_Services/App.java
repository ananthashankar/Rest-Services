package Greetings.Web_Services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("App Started");
    	SpringApplication.run(App.class, args);
    }
}
