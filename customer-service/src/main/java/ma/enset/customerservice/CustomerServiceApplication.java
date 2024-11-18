package ma.enset.customerservice;

import ma.enset.customerservice.config.ConfigParams;
import ma.enset.customerservice.entities.Customer;
import ma.enset.customerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(ConfigParams.class)
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().nom("mohamed").email("mohamed@gmail.com").build());
            customerRepository.save(Customer.builder().nom("yassine").email("yassine@gmail.com").build());
            customerRepository.save(Customer.builder().nom("imane").email("imane@gmail.com").build());

        };
    }
}
