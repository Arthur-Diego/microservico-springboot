package com.teste.apipedidos.apipedido.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.access.expression.method.MethodSecurityExpressionHandler;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.client.filter.OAuth2ClientContextFilter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;
import org.springframework.security.oauth2.provider.expression.OAuth2MethodSecurityExpressionHandler;
import org.springframework.security.web.util.matcher.RequestHeaderRequestMatcher;

import javax.swing.text.Highlighter;

@Configuration
@EnableResourceServer
public class SecurityConfiguration extends ResourceServerConfigurerAdapter {


    private static final String RESOURCE_ID = "resource-server-rest-api";
    private static final String SECURED_READ_SCOPE = "#oauth2.hasScope('vsf')";
    private static final String SECURED_WRITE_SCOPE = "#oauth2.hasScope('fdp')";
    private static final String SECURED_PATTERN = "/api/orders/**";

    private final static String resourceId = "resources";



//    @Override
//    public void configure(HttpSecurity http) throws Exception {
////        http.authorizeRequests()
////                .antMatchers(HttpMethod.GET, "/**").access("#oauth2.hasScope('read')")
////                .antMatchers(HttpMethod.OPTIONS, "/**").access("#oauth2.hasScope('read')")
////                .antMatchers(HttpMethod.POST, "/api/orders").access("#oauth2.hasScope('write')")
////                .antMatchers(HttpMethod.PUT, "/**").access("#oauth2.hasScope('write')")
////                .antMatchers(HttpMethod.PATCH, "/**").access("#oauth2.hasScope('write')")
////                .antMatchers(HttpMethod.DELETE, "/**").access("#oauth2.hasScope('write')")
////                .anyRequest().authenticated().
////                and().csrf().disable();
////        ;
//
//        http.authorizeRequests()
//                .anyRequest().authenticated().and()
//                .requestMatchers()
//                .antMatchers("/oauth/token",
//                         "/api/orders",
//                        "/api/orders/**",
//                        "/tokens/**"                        )
//                .and()
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//
//
////        http.requestMatchers().antMatchers("/login", "/oauth/authorize","/oauth/token").and()
////                .authorizeRequests().anyRequest().authenticated().and().formLogin().permitAll();
//    }

    @Override
    public void configure(ResourceServerSecurityConfigurer resources){
        resources.resourceId(resourceId);
    }

//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http.requestMatchers()
//                .antMatchers("/oauth/authorize").and().authorizeRequests()
//                .antMatchers(HttpMethod.POST, "api/orders", SECURED_PATTERN).access(SECURED_WRITE_SCOPE)
//                ;
//    }

//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http.requestMatchers()
//                .antMatchers("/oauth/authorize").and().authorizeRequests()
//                .antMatchers(HttpMethod.POST, "api/orders", SECURED_PATTERN).access(SECURED_WRITE_SCOPE)
//        ;
//
//        super.configure(http);
//    }

//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http
//                .anonymous().disable()
//                .requestMatchers().antMatchers(HttpMethod.POST, "/api/orders")
//                .and().authorizeRequests().antMatchers(HttpMethod.POST).access("hasRole('USER')")
//
//                .antMatchers(HttpMethod.POST, "/api/**").access("hasRole('USER')")
//                .antMatchers("/secure/").access("hasRole('ADMIN')")
//                .and()
//                .exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
//    }


//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//
//        http.requestMatcher(new RequestHeaderRequestMatcher("Authorization"))
//                .authorizeRequests()
//                .antMatchers("/**").fullyAuthenticated()
//                .antMatchers(HttpMethod.GET, "/**").access("#oauth2.hasScope('read')")
//                .antMatchers(HttpMethod.OPTIONS, "/**").access("#oauth2.hasScope('read')")
//                .antMatchers(HttpMethod.POST, "/**").access("#oauth2.hasScope('writeaoisjd')")
//                .antMatchers(HttpMethod.PUT, "/**").access("#oauth2.hasScope('write')")
//                .antMatchers(HttpMethod.PATCH, "/**").access("#oauth2.hasScope('write')")
//                .antMatchers(HttpMethod.DELETE, "/**").access("#oauth2.hasScope('write')");
//
//    }


    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest().authenticated().and()
                .requestMatchers()
                .antMatchers("/**", "/order/**" ,"/order/api/orders")
                .and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
                .csrf().disable();
    }
}
