package com.example.school_service;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import javax.crypto.SecretKey;


public class JwtUtil {
	 private static final String SECRET =
	            "mysecretkeymysecretkeymysecretkeymysecretkey"; // 32+ chars

	    private static final SecretKey key =
	            Keys.hmacShaKeyFor(SECRET.getBytes());

	    // ✅ Validate token
	    public static void validateToken(String token) {
	        Jwts.parser()
	                .verifyWith(key)
	                .build()
	                .parseSignedClaims(token);
	    }

	    // ✅ Optional: extract username
	    public static String extractUsername(String token) {
	        Claims claims = Jwts.parser()
	                .verifyWith(key)
	                .build()
	                .parseSignedClaims(token)
	                .getPayload();

	        return claims.getSubject();
	    }
}
