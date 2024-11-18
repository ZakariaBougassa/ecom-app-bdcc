package ma.enset.customerservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author ZAKARIA
 **/
@RestController
@RefreshScope
public class CustomerConfigRestController {
    @Value("${global.params.p1}")
    private String p1;
    @Value("${global.params.p2}")
    private String p2;

    private ConfigParams configParams;

    public CustomerConfigRestController(ConfigParams configParams) {
        this.configParams = configParams;
    }

   @GetMapping("/configtest1")
    public Map<String, String> getParams(){
        return Map.of("p1", p1, "p2", p2);
    }

    @GetMapping("/configtest2")
    public ConfigParams getParams2(){
        return configParams ;
    }

}
