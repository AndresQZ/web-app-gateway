package gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

import gateway.configproperties.GlobalCofigurationProperties;

@SpringBootApplication
public class Application {
	
	@Autowired
	private GlobalCofigurationProperties globalCofigurationProperties;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	  
	/*
	 * @Bean public RouteLocator myRoutes(RouteLocatorBuilder builder) { return
	 * builder.routes() .route(p -> p .path("/get") .filters(f ->
	 * f.addRequestHeader("Hello", "World"))
	 * .uri(globalCofigurationProperties.getHttpUri()) .id("myRoute")) .route(p -> p
	 * .host("*.hystrix.com") .filters(f -> f.hystrix(config ->
	 * config.setName("mycmd").setFallbackUri("forward:/fallback")))
	 * .uri(globalCofigurationProperties.getHttpUri())) .route(p -> p
	 * .path("/user/*") .filters(f -> f.addRequestHeader("tsec", "7722hdhh"))
	 * .uri(globalCofigurationProperties.getPathWebTaxco())) .build(); }
	 */
	
}
