package 字节流输出;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StreamServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取图片
		String path = this.getServletContext().getRealPath("a.jpg");
		InputStream inputStream = new FileInputStream(path);
		//获取响应输入流
		ServletOutputStream outputStream = response.getOutputStream();
		int len = 0;
		byte[] bytes = new byte[1024];
		while ((len = inputStream.read(bytes)) != -1) {
			//上传图片
			outputStream.write(bytes, 0, len);
		}
		inputStream.close();
//		outputStream.close();响应输入流会自动关闭
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}