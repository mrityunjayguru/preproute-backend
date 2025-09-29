package com.preproute.preproute.jwtutil;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;


import java.security.Key;
import java.util.Date;

@Component
public class JwtUtil {
	
	    @Value("${jwt.secret}")
	    private String SECRET_KEY;

	    @Value("${jwt.expiration}")
	    private String EXPIRATION_TIME;
    
       

    private Key getSigningKey() {
    	
    	
    	System.out.println("  EXPIRATION_TIME "+EXPIRATION_TIME);
     	System.out.println("  SECRET_KEY "+SECRET_KEY);
        return Keys.hmacShaKeyFor(SECRET_KEY.getBytes());
    }

    
    
    public String generateToken(String username) {
       	System.out.println("  EXPIRATION_TIME "+EXPIRATION_TIME);
     	System.out.println("  SECRET_KEY "+SECRET_KEY);
    
     	return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(getSigningKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    
    
    public String extractUsername(String token) {
    	System.out.println("  here here here   ");
        return Jwts.parserBuilder()
                .setSigningKey(getSigningKey())
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }

    
    public boolean validateToken(String token) {
        try {
            Jwts.parserBuilder().setSigningKey(getSigningKey()).build().parseClaimsJws(token);
            return true;
        } catch (JwtException | IllegalArgumentException e) {
            return false;
        }
    }
}
