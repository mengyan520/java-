package dc_44_集合_HashSet;

public class Person {
	/*
	 *  没有做重写父类,每次运行结果都是不同整数
	 *  如果子类重写父类的方法,哈希值,自定义的
	 *  存储到HashSet集合的依据
	 */
	String name;
	int age;
	public int hashCode(){
		return name.hashCode()+age*55;
	}
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(obj instanceof Person){
			Person p = (Person)obj;
			return name.equals(p.name) && age==p.age;
		}
		return false;
	}
	@Override
	public String toString() {
		return "姓名:"+name+" "+"年龄："+age;
	}
	
}
