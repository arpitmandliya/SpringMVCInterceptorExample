package org.arpit.java2blog.springmvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SampleInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		request.setAttribute("blogName", "java2blog");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		String blogName = (String) request.getAttribute("blogName");
		// We are adding some modelAndView objects here and will use it in view jsp.
		modelAndView.addObject("blogName",blogName);
		modelAndView.addObject("authorName", "Arpit");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		String blogName = (String) request.getAttribute("blogName");
		String authorName = (String) request.getAttribute("authorName");
		System.out.println("Request URL::" + request.getRequestURL().toString());
		System.out.println("Blog name : " + blogName);
		System.out.println("Author Name : " + authorName);
	}
}
