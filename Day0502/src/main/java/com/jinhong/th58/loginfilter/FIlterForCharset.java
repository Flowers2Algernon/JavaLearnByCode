package com.jinhong.th58.loginfilter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
@WebFilter("/*")
public class FIlterForCharset implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }
    //注意此处编码设置别设置错了，不然会发送无法预料到的错误
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=utf-8");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
