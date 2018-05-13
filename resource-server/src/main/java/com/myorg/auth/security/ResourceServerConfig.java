package com.myorg.auth.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;

/**
 * ResourceServerConfig
 * SpringOAuth
 * <p>
 *
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    public static final String RESOURCE_ID = "test";

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/api/admin").hasRole("ADMIN");
        http.authorizeRequests().antMatchers("/api/staff").hasRole("STAFF");
        http.authorizeRequests().antMatchers("/api/client").access("#oauth2.hasScope('trust')");
    }

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) {
        RemoteTokenServices tokenService = new RemoteTokenServices();
        tokenService.setClientId("jsclient");
        tokenService.setClientSecret("123456");
        tokenService.setCheckTokenEndpointUrl("http://localhost:8080/authorization-server/oauth/check_token");

        resources.resourceId(RESOURCE_ID).tokenServices(tokenService);
    }
}