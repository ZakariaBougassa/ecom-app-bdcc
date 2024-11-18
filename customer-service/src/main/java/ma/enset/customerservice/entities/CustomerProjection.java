package ma.enset.customerservice.entities;

import org.springframework.data.rest.core.config.Projection;

/**
 * @author ZAKARIA
 **/
@Projection(name = "p1", types = Customer.class)
public interface CustomerProjection {
    public String getNom();
    public String getEmail();
}
