package Calendar类;

import java.util.Date;
import java.util.Calendar;//抽象类

public class Test {
	public static void main(String[] args) {
		// 通过静态方法getInstance，直接返回子类,创建子类的对象
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		// 把日历对象,转成Date日期对象 getTime
		Date date = calendar.getTime();
		System.out.println(date);
		// 获取年份
		int year = calendar.get(Calendar.YEAR);
		System.out.println(year);
		// 获取月份
		int month = calendar.get(Calendar.MONTH)+1;
		System.out.println(month);
		// 获取日
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
//		//设置指定的时间 年月日
//		calendar.set(2008, 05, 12);
//		System.out.println(calendar);
//		System.out.println(calendar.get(Calendar.YEAR));
//		设置,月份,设置到10月分
		calendar.set(Calendar.MONTH, 10);
		System.out.println(calendar);
//		让日历中的天数,向后偏移10天，向前则是 -10
		calendar.add(Calendar.DAY_OF_YEAR, 10);
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		days();
		leapYear();
	}
	// 计算自己出生了多少天
	public  static void days() {
		//这个计算秒
		long time1  = Calendar.getInstance().getTimeInMillis();
		Calendar calendar = Calendar.getInstance();
		calendar.set(1993, 10, 25);
		long time2 = calendar.getTimeInMillis();
		System.out.println((time1-time2)/1000/86400);
	}
	//闰年计算
	public static void leapYear() {
		Calendar c = Calendar.getInstance();
		//月份 0-11，设置到3月1号，往前偏移一天，看是28还是29
		c.set(2019, 2, 1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
	}
}
