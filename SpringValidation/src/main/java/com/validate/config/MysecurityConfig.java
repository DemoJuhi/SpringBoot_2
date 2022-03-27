package com.validate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MysecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.
				authorizeRequests()
				.antMatchers("/Signin/**").permitAll()
				.antMatchers("/public/**").hasRole("ADMIN")
				.antMatchers("/users/**").hasRole("USER")
				.anyRequest()
				.authenticated()
				.and()
				.formLogin()
				.loginPage("/signin");
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth
		.inMemoryAuthentication()
		.withUser("admin")
		.password(this.passwordencoder().encode("admin")).roles("ADMIN");
		
		auth
		.inMemoryAuthentication()
		.withUser("user")
		.password(this.passwordencoder().encode("user")).roles("USER");
	}
	
	@Bean
	public PasswordEncoder passwordencoder()
	{
		return new BCryptPasswordEncoder(10);
	}
	
	
	
	
	
	
	

}
