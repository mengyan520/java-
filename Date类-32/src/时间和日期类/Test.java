package 时间和日期类;
import java.util.Date;
/*
 * 1000ms = 1s
 * 时间原点：1970年1月1日，无业0:00:00
 * */
public class Test {
	public static void main(String[] args) {
		//获取当前日期系统毫秒值 long型
		System.out.println(System.currentTimeMillis());
		//Date类的构造方法
		//空参
		Date date1 = new Date();
		//获取到的是,当前操作系统中的时间和日期
		System.out.println(date1);
		//有参 传递毫秒值,将毫秒值转成对应的日期对象
		Date date2 = new Date(0);
		Date date3 = new Date(1547985851525L);
		System.out.println(date2);
		System.out.println(date3);
		//获取当前时间戳
		System.out.println(date1.getTime());
		//根据给定的毫秒值，转成对应的日期对象
		date1.setTime(1547985851525L);
		System.out.println(date1);
	}
}
