package com.lifeos.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		http
		.csrf(csrf -> csrf.disable())
				.authorizeHttpRequests(auth->auth
						.requestMatchers("/api/users/**").permitAll()
						.requestMatchers("/api/workspaces/**").permitAll()
						.requestMatchers("/api/parties/**").permitAll()
						.anyRequest().authenticated()
						)
				.httpBasic(Customizer.withDefaults());
		return http.build();
	}
}
