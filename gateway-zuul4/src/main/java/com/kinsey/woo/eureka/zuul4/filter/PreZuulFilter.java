package com.kinsey.woo.eureka.zuul4.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class PreZuulFilter extends ZuulFilter {
	
	private static final Logger logger = (Logger) LoggerFactory.getLogger(PreZuulFilter.class); 

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		logger.info("PreZuulFilter>>>: "+ctx.getRequest().getRemoteHost());
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public String filterType() {
		return "pre";
	}

}
