package dan.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
	public static void main(String[] args) {
		// 获得动态的代理对象----在运行时 在内存中动态的为Target创建一个虚拟的代理对象
		// objProxy是代理对象 根据参数确定到底是谁的代理对象
		TargetInterface objProxy = (TargetInterface) Proxy.newProxyInstance(Target.class.getClassLoader(), // 与目标对象相同的类加载器
				new Class[] { TargetInterface.class }, (InvocationHandler) new InvocationHandler() {
					// invoke 代表的是执行代理对象的方法
					
					// method：代表目标对象的方法字节码对象
					// args:代表目标对象的响应的方法的参数
					public Object invoke1(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("目标方法前的逻辑");
						// 执行目标对象的方法
						Object invoke = method.invoke(new Target(), args);
						System.out.println("目标方法后的逻辑");
						return invoke;
					}

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("目标方法前的逻辑");
						// 执行目标对象的方法
						Object invoke = method.invoke(new Target(), args);
						System.out.println("目标方法后的逻辑");
						return invoke;
					}
				});

		objProxy.method1();
	}
}
