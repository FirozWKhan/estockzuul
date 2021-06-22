package com.fse.zuul;

import com.fse.zuul.config.ErrorFilter;
import com.fse.zuul.config.PostFilter;
import com.fse.zuul.config.PreFilter;
import com.fse.zuul.config.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class EstockZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstockZuulApplication.class, args);
	}
	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}
