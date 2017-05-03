package com.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by wuyawei on 2017/4/21.
 */
public class FirstFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFIlter()函数执行了");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
