//package com.teste.authserver.authserver.config;
//
//import com.zaxxer.hikari.HikariDataSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
//import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
//import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
//import org.springframework.security.oauth2.provider.error.DefaultWebResponseExceptionTranslator;
//import org.springframework.security.oauth2.provider.error.WebResponseExceptionTranslator;
//import org.springframework.security.oauth2.provider.token.TokenStore;
//import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
//import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
//
//@Configuration
//@EnableAuthorizationServer
//public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
//
//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @Autowired
//    private UserDetailsService userDetails;
//
//    @Autowired
//    private HikariDataSource dataSource;
//
//    @Override
//    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
//
//        clients.jdbc(dataSource);
////        clients.inMemory()
////                .withClient("api")
////                .secret("{noop}api123")
////                .scopes("read", "write")
////                .authorizedGrantTypes("password", "refresh_token")
////                //                .authorities("USER")
////                .accessTokenValiditySeconds(30)
////                .refreshTokenValiditySeconds(3600 * 24);
//
//    }
//
//    @Override
//    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
//        endpoints
//                .tokenStore(tokenStore())
//                .accessTokenConverter(accessTokenConverter())
//                .reuseRefreshTokens(false)
//                .authenticationManager(authenticationManager)
//                .userDetailsService(userDetails)
//                .exceptionTranslator(loggingExceptionTranslator());
//    }
//
//    @Bean
//    public JwtAccessTokenConverter accessTokenConverter() {
//        JwtAccessTokenConverter accessTokenConverter = new JwtAccessTokenConverter();
//        accessTokenConverter.setSigningKey("api");
//        return accessTokenConverter;
//    }
//
//    @Bean
//    public TokenStore tokenStore() {
//        return new JwtTokenStore(accessTokenConverter());
//    }
//
//    @Bean
//    public WebResponseExceptionTranslator loggingExceptionTranslator() {
//        return new DefaultWebResponseExceptionTranslator() {
//            @Override
//            public ResponseEntity<OAuth2Exception> translate(Exception e) throws Exception {
//                // This is the line that prints the stack trace to the log. You can customise this to format the trace etc if you like
//                e.printStackTrace();
//
//                // Carry on handling the exception
//                ResponseEntity<OAuth2Exception> responseEntity = super.translate(e);
//                HttpHeaders headers = new HttpHeaders();
//                headers.setAll(responseEntity.getHeaders().toSingleValueMap());
//                OAuth2Exception excBody = responseEntity.getBody();
//                return new ResponseEntity<>(excBody, headers, responseEntity.getStatusCode());
//            }
//        };
//    }
//
//}
