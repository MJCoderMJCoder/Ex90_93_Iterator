package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex90_93_Iterator {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); //����һ��ArrayList����
		list.add("��ѧӢ��");
		list.add("�ߵ���ѧ");
		list.add("��ѧ����");
		list.add("��ѧ����");
		System.out.println("�����е�Ԫ�أ�" + list);
		Iterator itor = list.iterator(); //���list�ĵ�����
		while(itor.hasNext()) {
			if (itor.next().equals("��ѧ����")) {
				itor.remove(); //ɾ��ָ��Ԫ�ء���ѧ���ġ�
			}
		}
		System.out.println("ɾ�����Ԫ�أ�" + list);
	}

}
