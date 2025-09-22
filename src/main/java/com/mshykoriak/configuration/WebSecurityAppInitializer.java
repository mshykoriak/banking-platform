package com.mshykoriak.configuration;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * Initializes spring security filter chain
 * @author Misha Shykoriak
 * @since 1.0
 */
public class WebSecurityAppInitializer extends AbstractSecurityWebApplicationInitializer {

    @Override
    protected String getDispatcherWebApplicationContextSuffix() {
        return AbstractDispatcherServletInitializer.DEFAULT_SERVLET_NAME;
    }
}
