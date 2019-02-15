package dc_10_WebProject_HttpServletRequest;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.jdi.Value;

public class RequestServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.获得客户端的请求方式
		String methodString = request.getMethod();
		System.out.println("Method：" + methodString);
		// 获得请求的资源
		String uri = request.getRequestURI();
		System.out.println("URI：" + uri);
		StringBuffer url = request.getRequestURL();
		System.out.println("URL：" + url);
		//获取web应用的名称
		String pathString = request.getContextPath();
		System.out.println("ContextPath：" + pathString);
		// 获取get请求的参数
		String query = request.getQueryString();
		System.out.println("GET请求参数：" + query);
		// 获得客户机（客户端）的一些信息
		String remoteAddr = request.getRemoteAddr();
		System.out.println("IP地址：" + remoteAddr);
		System.out.println("=======");
		// 2.获取请求头
		// 获取指定请求头
		String agent = request.getHeader("User-Agent");
		System.out.println("User-Agent：" + agent);
		// 获取全部请求头的名字
		Enumeration<String> headers = request.getHeaderNames();
		while (headers.hasMoreElements()) {
			String header = (String) headers.nextElement();
			String value = request.getHeader(header);
			System.out.println(header + "：" + value);
		}
		System.out.println("=======");
		// 解决post提交方式的乱码
		request.setCharacterEncoding("UTF-8");
		// 3.获取请求体
		// 单个表单值
		String username = request.getParameter("username");
		//解决get提交的方式的乱码
		System.out.println("username：" + new String(username.getBytes("ISO8859-1"), "UTF-8"));
		// 多个表单值
		String[] checkboxs = request.getParameterValues("hobby");
		for (String string : checkboxs) {
			System.out.println("hobby：" + string);
		}
		// 获取所有参数的名称
		Enumeration<String> pms = request.getParameterNames();
		while (pms.hasMoreElements()) {
			String string = (String) pms.nextElement();
			System.out.println(string);
		}
		// 获取所有参数的值
		Map<String, String[]> map = request.getParameterMap();
		for (Entry<String, String[]> entry : map.entrySet()) {
			for (String string : entry.getValue()) {
				System.out.println(entry.getKey() + "：" + string);
			}
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}