package dc_44_����_HashSet;

public class Person {
	/*
	 *  û������д����,ÿ�����н�����ǲ�ͬ����
	 *  ���������д����ķ���,��ϣֵ,�Զ����
	 *  �洢��HashSet���ϵ�����
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
		return "����:"+name+" "+"���䣺"+age;
	}
	
}
