package com.fse.zuul.config;

import com.netflix.zuul.ZuulFilter;

/**
 * Created by Firoz on 6/22/2021.
 */
public class RouteFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "route";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        System.out.println("Inside Route Filter");
        return null;
    }
}