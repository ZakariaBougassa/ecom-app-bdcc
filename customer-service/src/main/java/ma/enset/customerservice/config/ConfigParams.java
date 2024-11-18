package ma.enset.customerservice.config;

import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author ZAKARIA
 **/
@ConfigurationProperties(prefix = "customer.params")
public record ConfigParams(int x, int y) {

}
