package com.dreamtank.filter;

import jakarta.servlet.*;

import java.io.IOException;

//@WebFilter(urlPatterns = "/*")
public class Demofilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        System.out.println("init初始方法执行了");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Demo拦截到了请求");
        //放行
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("Demo放行后逻辑");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
        System.out.println("destroy 销毁方法被执行了");
    }
}
