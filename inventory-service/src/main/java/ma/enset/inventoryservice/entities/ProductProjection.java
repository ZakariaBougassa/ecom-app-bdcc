package ma.enset.inventoryservice.entities;

import org.springframework.data.rest.core.config.Projection;

/**
 * @author ZAKARIA
 **/
@Projection(name = "all", types = Product.class)
public interface ProductProjection {
    public String getName();
    public int getQuantity();
    public double getPrice();
}
