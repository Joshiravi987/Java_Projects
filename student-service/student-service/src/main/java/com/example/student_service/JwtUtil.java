package com.example.student_service;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import javax.crypto.SecretKey;
import java.util.Date;

public class JwtUtil {
	  private static final String SECRET =
	            "mysecretkeymysecretkeymysecretkeymysecretkey"; // 32+ chars

	    private static final SecretKey key =
	            Keys.hmacShaKeyFor(SECRET.getBytes());

	    // ✅ 1️⃣ Generate token (USED BY AuthController)
	    public static String generateToken(String username) {
	        return Jwts.builder()
	                .subject(username)
	                .issuedAt(new Date())
	                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60)) // 1 hour
	                .signWith(key)
	                .compact();
	    }

	    // ✅ 2️⃣ Validate token (USED BY Gateway)
	    public static void validateToken(String token) {
	        Jwts.parser()
	                .verifyWith(key)
	                .build()
	                .parseSignedClaims(token);
	    }

	    // ✅ 3️⃣ Extract username (OPTIONAL)
	    public static String extractUsername(String token) {
	        Claims claims = Jwts.parser()
	                .verifyWith(key)
	                .build()
	                .parseSignedClaims(token)
	                .getPayload();

	        return claims.getSubject();
	    }
}
