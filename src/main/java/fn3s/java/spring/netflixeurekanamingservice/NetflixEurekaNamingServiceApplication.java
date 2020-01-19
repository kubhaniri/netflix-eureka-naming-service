package fn3s.java.spring.netflixeurekanamingservice;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaServer
public class NetflixEurekaNamingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurekaNamingServiceApplication.class, args);
	}
	@Bean
	public Sampler defaultSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}
}
