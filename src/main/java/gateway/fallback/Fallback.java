package gateway.fallback;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class Fallback {
	
	@RequestMapping(value="/fallback")
	public Mono<String> fallback() {
		return Mono.just("fallback");
	}

}
