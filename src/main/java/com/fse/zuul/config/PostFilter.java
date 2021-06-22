package com.fse.zuul.config;

/**
 * Created by Firoz on 6/22/2021.
 */

import com.netflix.zuul.ZuulFilter;
public class PostFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "post";
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
        System.out.println("Inside Response Filter");

        return null;
    }
}