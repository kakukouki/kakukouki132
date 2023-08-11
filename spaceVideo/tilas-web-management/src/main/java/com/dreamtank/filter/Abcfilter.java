package com.dreamtank.filter;

import jakarta.servlet.*;

import java.io.IOException;

//@WebFilter(urlPatterns = "/login")
public class Abcfilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Abc放行前逻辑 ");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("Abc放行后逻辑");
    }
}
