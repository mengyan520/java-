package 接口_多实现02;
/*
 * 类同时实现了接口A、接口B
 * 如果A、B有完全一样的抽象方法，如果返回值不一样，则不能重写，会报错，应避免此类情形出现
 * */
public class C implements A, B {

	public void a() {
		
	}
	@Override
	public void b() {
	}
}
