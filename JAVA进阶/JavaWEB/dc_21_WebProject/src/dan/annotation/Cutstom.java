package dan.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
//元注解
//注解修饰的范围
@Target({ ElementType.METHOD, ElementType.TYPE })
//注解可见级别
@Retention(RetentionPolicy.RUNTIME)
public @interface Cutstom {
//	String name();
//	int age() default 28;
	String value();
}
