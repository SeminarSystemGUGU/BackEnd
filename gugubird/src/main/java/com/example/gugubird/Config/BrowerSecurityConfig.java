package com.example.gugubird.Config;

import com.example.gugubird.Service.UserSecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class BrowerSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UserSecurityService authUserService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()//  定义当需要用户登录时候，转到的登录页面。
                //.loginPage("http://localhost:8080/user/login")
                .and()
                .rememberMe()//提供记住账号密码的功能
                .and()
                .authorizeRequests()        // 定义哪些URL需要被保护、哪些不需要被保护
               // .antMatchers("/user/hello").hasRole("Teacher")
                .antMatchers("/**").permitAll()
                .anyRequest()               // 任何请求,登录后可以访问
                .authenticated()
                .and()
                .csrf().disable();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//                .inMemoryAuthentication()
//
//                .withUser("user").password("password").roles("USER");
        auth.userDetailsService(authUserService)
                .passwordEncoder(new MyPasswordEncoder());
//        auth.inMemoryAuthentication()
//                .passwordEncoder(new MyPasswordEncoder())
//                .withUser("cxh").password("cxh").roles("ADMIN");
       // auth.userDetailsService(userDetailsService());
        //auth.authenticationProvider(authenticationProvider());
    }

}