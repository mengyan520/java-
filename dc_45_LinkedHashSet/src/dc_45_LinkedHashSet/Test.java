package dc_45_LinkedHashSet;

import java.util.LinkedHashSet;
/*
 *��������Ĺ�ϣ��ʵ�֣��̳���HashSet ��˫������
 *LinkedHashSet ��������,����˳��,�洢��ȡ����˳����ͬ��
 *�̲߳���ȫ�ļ���,�����ٶȿ�
 * */
public class Test {

	public static void main(String[] args) {
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("��");
		linkedHashSet.add("��");
		linkedHashSet.add("��");
		System.out.println(linkedHashSet);
	}

}
