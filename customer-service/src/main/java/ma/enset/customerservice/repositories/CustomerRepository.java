package ma.enset.customerservice.repositories;

import ma.enset.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author ZAKARIA
 **/
@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
