package dev.naman.userservicetestfinal.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurity {

    @Bean
    public SecurityFilterChain filteringCriteria(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(authorize -> authorize.anyRequest().permitAll());
//        http.authorizeHttpRequests(authorize -> authorize.requestMatchers("/auth/logout").denyAll());
        http.authorizeHttpRequests(authorize -> authorize.requestMatchers("/auth/logout").authenticated());
        return  http.build();
    }

    // Object that handles what all api point should be authenticated
    // v/s what all should not be authenticated

}
