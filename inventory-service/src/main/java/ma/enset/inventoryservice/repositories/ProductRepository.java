package ma.enset.inventoryservice.repositories;

import ma.enset.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author ZAKARIA
 **/
@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, String> {

}
