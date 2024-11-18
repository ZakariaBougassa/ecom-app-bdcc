package ma.enset.inventoryservice;

import ma.enset.inventoryservice.entities.Product;
import ma.enset.inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductRepository productRepository){
        return args -> {
          productRepository.save(new Product(UUID.randomUUID().toString(), "printer", 15, 5600));
          productRepository.save(new Product(UUID.randomUUID().toString(), "scanner", 22, 2600));
          productRepository.save(new Product(UUID.randomUUID().toString(), "screen", 9, 6100));

        };
    }

}
