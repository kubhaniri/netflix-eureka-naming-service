package fn3s.java.spring.netflixeurekanamingservice.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("netflix-eureka-naming-service")
public class Configuration {
    private Logger log = LoggerFactory.getLogger(this.getClass());
    private String name;

    public String getName() {
        log.info("getName name: {}",name);
        return name;
    }

    public void setName(String name) {
        log.info("getName name: {}",name);
        this.name = name;
    }
}
