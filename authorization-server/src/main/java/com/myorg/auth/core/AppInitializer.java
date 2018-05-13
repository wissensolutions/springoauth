package com.myorg.auth.core;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * AppInitializer
 * SpringOAuth
 * <p>
 */
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /*
  * (non-Javadoc)
  * @see org.springframework.web.servlet.support. AbstractAnnotationConfigDispatcherServletInitializer#getRootConfigClasses ()
  */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { AppMvcConfig.class };
    }

    /*
     * (non-Javadoc)
     * @see org.springframework.web.servlet.support. AbstractAnnotationConfigDispatcherServletInitializer# getServletConfigClasses()
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {};
    }

    /*
     * (non-Javadoc)
     * @see org.springframework.web.servlet.support. AbstractDispatcherServletInitializer#getServletMappings()
     */
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

}
