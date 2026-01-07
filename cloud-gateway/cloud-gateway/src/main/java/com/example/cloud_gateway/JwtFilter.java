package com.example.cloud_gateway;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
@Component
public class JwtFilter  implements   GlobalFilter, Ordered {

	 @Override
	    public Mono<Void> filter(ServerWebExchange exchange,
	                             org.springframework.cloud.gateway.filter.GatewayFilterChain chain) {

	        String path = exchange.getRequest().getURI().getPath();

	        // ✅ Public endpoints
	        if (path.contains("/auth/") || path.contains("/eureka")) {
	            return chain.filter(exchange);
	        }

	        String authHeader = exchange.getRequest()
	                .getHeaders()
	                .getFirst(HttpHeaders.AUTHORIZATION);

	        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
	            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
	            return exchange.getResponse().setComplete();
	        }

	        String token = authHeader.substring(7);

	        try {
	            // ✅ VALIDATE token
	            JwtUtil.validateToken(token);
	        } catch (Exception e) {
	            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
	            return exchange.getResponse().setComplete();
	        }

	        return chain.filter(exchange);
	    }

    @Override
    public int getOrder() {
        return -1; // highest priority
    }
}