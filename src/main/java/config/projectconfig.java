package config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"implementation","vehicleService"})
@ComponentScan(basePackageClasses = {bean.vehicles.class,bean.person.class})
public class projectconfig {

}
