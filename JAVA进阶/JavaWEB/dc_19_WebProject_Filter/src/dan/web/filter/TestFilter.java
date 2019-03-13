package dan.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TestFilter implements Filter {

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("TestFilter执行");
		// 放行请求
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// 1、获得web.xml中filter 的名称<filter-name>QuickFilter1</filter-name>
		System.out.println(filterConfig.getFilterName());
		// 2、获得当前filter的初始化参数
		System.out.println(filterConfig.getInitParameter("aaa"));
		// 3、获得servletContext
		filterConfig.getServletContext();

		System.out.println("init ....");
	}

}
