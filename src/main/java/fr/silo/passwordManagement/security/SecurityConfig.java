package fr.silo.passwordManagement.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled =true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@SuppressWarnings("deprecation")
	@Bean
	public static NoOpPasswordEncoder passwordEncoder() {
	return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}
	
	@Autowired
	public void globalConfig(AuthenticationManagerBuilder auth , DataSource dataSource) throws Exception {
		auth.jdbcAuthentication()
			.dataSource(dataSource)
				.usersByUsernameQuery("select person_email,person_password , enable from person where person_email = ?;")
					.authoritiesByUsernameQuery("select person_email, role from person where person_email= ?;");
	}
	

	/*protected void configure(HttpSecurity http) throws Exception{
		http
		.authorizeRequests()
        .antMatchers(
        		"/css/**",
        		"/bootstrap/**",
        		"/img/**",
        		"/fonts/**"
        		).permitAll()
					   .and()
		.csrf().disable()
			.authorizeRequests()
				.anyRequest()
					.authenticated()
						.and()
				.formLogin()
					.loginPage("/login")
						.permitAll()
							.defaultSuccessUrl("/main" ,true);
	}*/
}
