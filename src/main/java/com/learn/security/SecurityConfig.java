package com.learn.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
                .csrf(csrf->csrf.disable())
                .authorizeHttpRequests(auth->auth
                        .requestMatchers("/api/students/register").permitAll()
                        .requestMatchers(HttpMethod.GET, "/api/students").permitAll() //for practice purpose only authentication is required for get student by id
                        .requestMatchers(HttpMethod.GET, "/api/students/{id}").authenticated()
                        .anyRequest().authenticated()
                )
                .httpBasic(httpBasic-> {});
    return http.build();
    }
}
