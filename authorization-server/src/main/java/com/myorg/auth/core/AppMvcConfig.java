package com.myorg.auth.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * AppMvcConfig
 * SpringOAuth
 * <p>
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.myorg.auth" })
public class AppMvcConfig implements WebMvcConfigurer {
    // =================================================
    // Class Variables
    // =================================================

    // =================================================
    // Constructors
    // =================================================

    // =================================================
    // Instance Variables
    // =================================================

    // =================================================
    // Accessors
    // =================================================

    // =================================================
    // Implementations
    // =================================================

    // =================================================
    // Public methods
    // =================================================

    // =================================================
    // Private methods
    // =================================================

    // =================================================
    // Nested classes
    // =================================================

}
