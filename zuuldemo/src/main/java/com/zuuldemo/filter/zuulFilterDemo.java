package com.zuuldemo.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.http.protocol.RequestContent;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Author: dongqihang
 * @Date: Created in 15:20 2019/4/18
 */
@Component
public class zuulFilterDemo extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext rtx=RequestContext.getCurrentContext();
        HttpServletRequest request=rtx.getRequest();
        System.out.println(request.getRequestURI());
        System.out.println(request.getContextPath());
        System.out.println(request.getRemoteUser());
        Object access=request.getParameter("acc");
        if(access!=null){
            rtx.setSendZuulResponse(false);
            rtx.setResponseStatusCode(500);
            try {
                rtx.getResponse().getWriter().write("some error");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        System.out.println("ok");
        return null;
    }
}
