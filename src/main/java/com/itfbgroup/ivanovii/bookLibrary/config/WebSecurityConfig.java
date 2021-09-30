package com.itfbgroup.ivanovii.bookLibrary.config;

import com.itfbgroup.ivanovii.bookLibrary.service.MyUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author Ivanov Ivan
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private MyUserDetailService MyUserDetailService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
        .authorizeRequests()
                .antMatchers("/login*").permitAll()
                .antMatchers("/book/*").permitAll()
                .antMatchers("/books").permitAll()
               // .antMatchers("/users").hasRole("ADMIN")
               // .antMatchers("/user").hasRole(("ADMIN"))
                .antMatchers("/author/*").permitAll()
                .antMatchers("/authors").permitAll()
                .antMatchers("/about").permitAll()
                .antMatchers("/users").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST,"/user/*").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST,"/author/*").hasAnyRole("ADMIN","USER")
                .antMatchers(HttpMethod.POST,"/book/*").hasAnyRole("ADMIN","USER")
                .antMatchers(HttpMethod.PUT,"/user/*").hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT,"/author/*").hasAnyRole("ADMIN","USER")
                .antMatchers(HttpMethod.PUT,"/book/*").hasAnyRole("ADMIN","USER")
                .anyRequest().authenticated().
        and()
                .formLogin()/*.loginPage("/login.html")
                .permitAll()*/
        .and().httpBasic();
        //.and().logout().permitAll().logoutSuccessUrl("/");
    }

    @Autowired
    protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(MyUserDetailService).passwordEncoder(passwordEncoder());
      /*  auth.inMemoryAuthentication()
                .passwordEncoder(passwordEncoder())
                .withUser("user1").password(passwordEncoder().encode("user1Pass")).roles("USER")
                .and()
                .withUser("user2").password(passwordEncoder().encode("user2Pass")).roles("USER")
                .and()
                .withUser("admin").password(passwordEncoder().encode("adminPass")).roles("ADMIN");*/
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
