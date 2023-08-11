package com.dreamtank;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.HashMap;

//@SpringBootTest
class TilasWebManagementApplicationTests {

   @Test
    public void testGenJwt(){
       HashMap<String, Object> claims = new HashMap<>();
       claims.put("id", 1);
       claims.put("name", "tom");

       String jwt = Jwts.builder()
               .signWith(SignatureAlgorithm.HS256, "itheima")//签名算法
               .setClaims(claims)//自定义内容（载荷）
               .setExpiration(new Date(System.currentTimeMillis() + 3600 * 1000))//设置令牌有效期为1H
               .compact();
       System.out.println(jwt);
   }

    /**
     * 解析JWT令牌
     */
   @Test
    public void testParseJwt(){

       Claims claims = Jwts.parser()
               .setSigningKey("itheima")
               .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoidG9tIiwiaWQiOjEsImV4cCI6MTY5MTU1MDc5M30.iAmXH7AVq58P3glzB2yn6k5s7wgfNdsl_wffAgxQmLs")
               .getBody();
       System.out.println(claims);
   }
}
