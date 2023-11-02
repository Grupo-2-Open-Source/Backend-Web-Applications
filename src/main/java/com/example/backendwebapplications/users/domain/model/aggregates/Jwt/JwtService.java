package com.example.backendwebapplications.users.domain.model.aggregates.Jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Service
public class JwtService {
    private  static  final  String SECRET_KEY="ededededfefecefefe34343n4n4i3n4i3n4h3b43k4n3j4b3nk3k434u3b43n4kn34ib3u4b3u4n3m4k43n4ub34u34n5k4k5n4j5n3n5m34m3on5n33";
    public String getToken(UserDetails user) {
        return getToken(new HashMap<>(),user);
    }
    private  String getToken(Map<String,Object>extraClains,UserDetails user){
        return Jwts
                .builder()
                .setClaims(extraClains)
                .setSubject(user.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis()+1000000*60*24))
                .signWith(getKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    private Key getKey() {
        byte[] keyBytes= Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }


    public String getUsernameFromToken(String token) {
        return getClaim(token,Claims::getSubject);
    }

    public boolean isTokenValid(String token, UserDetails userDetails) {
        final  String username=getUsernameFromToken(token);
        return (username.equals(userDetails.getUsername())&& !isTokenExpired(token));
    }
    private Claims getAllClains(String token)
    {
        return  Jwts
                .parserBuilder()
                .setSigningKey(getKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }
    public <T> T getClaim(String token , Function<Claims,T> claimsResolver)
    {
        final  Claims claims=getAllClains(token);
        return  claimsResolver.apply(claims);
    }
    private  Date getExpiration(String token)
    {
        return  getClaim(token,Claims::getExpiration);
    }
    private  boolean isTokenExpired(String token)
    {
        return  getExpiration(token).before(new Date());
    }
}
