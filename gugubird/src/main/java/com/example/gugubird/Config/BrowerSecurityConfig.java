package com.example.gugubird.Config;

import com.example.gugubird.Service.UserSecurityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsUtils;

@EnableWebSecurity
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class BrowerSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UserSecurityServiceImpl authUserService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .loginPage("http://localhost:8080/#/")
               .defaultSuccessUrl("http://localhost:8080/#/StuMainPage").failureUrl("http://localhost:8080/#/")
                .loginProcessingUrl("/security/login")
                //.loginPage("http://localhost:8080/user/login")
                .and()
                .rememberMe()
                .and()
                .authorizeRequests()
               // .requestMatchers(CorsUtils::isPreFlightRequest).permitAll()
               // .antMatchers("/test/nice").hasRole("Teacher")
                //.antMatchers("/student/**").hasRole("Teacher")
                .antMatchers("/**/**","/security/login").permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .csrf().disable();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(authUserService)
                .passwordEncoder(new MyPasswordEncoder());
    }

}