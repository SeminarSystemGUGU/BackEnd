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
        http.formLogin()//  ���嵱��Ҫ�û���¼ʱ��ת���ĵ�¼ҳ�档
                //.loginPage("http://localhost:8080/user/login")
                .and()
                .rememberMe()//�ṩ��ס�˺�����Ĺ���
                .and()
                .authorizeRequests()        // ������ЩURL��Ҫ����������Щ����Ҫ������
               // .antMatchers("/test/nice").hasRole("Teacher")
                .antMatchers("/**").permitAll()
                .anyRequest()               // �κ�����,��¼����Է���
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