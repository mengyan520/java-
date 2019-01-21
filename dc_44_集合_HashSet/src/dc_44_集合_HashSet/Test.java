package dc_44_����_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * ��ϣ��
 * ���򼯺�,�洢��ȡ����˳��ͬ,û������,���洢�ظ�Ԫ�أ���������
 * ����ı�д��,��ArrayList��ȫһ��
 * �洢����ѯ���Ƚϣ������������壩
 * �̲߳���ȫ
 * ������Ԫ������>��ϣ����*��������,��Ҫ����,�ײ�Ὺ��һ������Ϊԭ����2��������
 * ����Ԫ�ؿ�������������,�ٰ���Ԫ�����������,��˼������Ӿ�������ʱ��
 * Ĭ�ϳ���16��Ĭ�ϼ�������0.75
 * ��������ݳ�Ϊ���ƣ����˷���Դ��
 * ����Ҳ��Ϊ������ٹ�ϣ
 * */
/*
 * 1.���ȵ��ñ����hashCode()���������ϣֵ
 * 2.�����������Ƿ�����Ԫ�ع�ϣֵ��ͬ����Ԫ��,
 * ���û��ֱ�Ӵ���
 * �����ת��������
 * 3.��Ԫ�ػ��������λ���µ���Ԫ������equals����һһ�Ա�
һ����Ԫ��.equals(��Ԫ��)����true,ֹͣ�Ա�,˵���ظ�,���ٴ���
����������λ���µ���Ԫ�ض�ͨ��equals�����Աȷ���false,˵��û���ظ�,����
ע�⣺
ʹ��HashSet�洢�Զ������ͣ����û����д�����hashCode��equals������
���ж��ظ�ʱ��ʹ�õ��ǵ�ֵַ�������ͨ�����ݱȽ�Ԫ���Ƿ���ͬ��
��Ҫ��д��Ԫ�����hashcode��equals����
 * */
public class Test {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("��");
		set.add("��");
		set.add("��");
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		//����Ĺ�ϣֵ,��ͨ��ʮ��������
		Person person = new Person();
		person.name="����";
		person.age = 18;
		System.out.println(set.hashCode());
		System.out.println(person.hashCode());
		//String��ϣֵ
		String string1 = "abc";
		String string2 = "abc";
		System.out.println(string1.hashCode());
		System.out.println(string2.hashCode());
		//�洢
		//�򵥣�1.�ȽϹ�ϣֵ 2.�Ƚ�equals
		System.out.println("=======");
		Person person1 = new Person();
		person1.name="����";
		person1.age = 18;
		Person person2 = new Person();
		person2.name="����";
		person2.age = 18;
		HashSet<Person> hashSet = new HashSet<Person>();
		hashSet.add(person1);
		hashSet.add(person2);
		System.out.println(hashSet);
	}

}
