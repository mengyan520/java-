package 日期格式化SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
//import java.text.DateFormat;抽象类
import java.text.SimpleDateFormat;//子类
public class Test {
	public static void main(String[] args) throws ParseException {
		//在类构造方法中,写入字符串的日期格式 (自己定义) E 代表星期几，F代表月份第几周
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分钟ss秒");
		String date = sdf.format(new Date());
		System.out.println(date);
		// 调用方法 parse 传递String,返回Date (日期模式和下面要转化的字符串格式一定要一样)
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date2 = sdf2.parse("2019-01-20 20:32:23");//字符串转化会有异常，不确定一定能转化成功
		System.out.println(date2);
	}
}
