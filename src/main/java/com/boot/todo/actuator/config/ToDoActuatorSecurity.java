//package com.boot.todo.actuator.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//public class ToDoActuatorSecurity extends WebSecurityConfigurerAdapter {
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().antMatchers("/**").permitAll().and().httpBasic();
////		http.authorizeRequests().antMatchers("/actuator/**").hasRole("ENDPOINT_ADMIN").and().httpBasic();
////		http.requestMatcher(EndpointRequest.toAnyEndpoint()).authorizeRequests().anyRequest().hasRole("ENDPOINT_ADMIN")
////				.and().httpBasic();
//	}
//	
//}