package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex90_93_Iterator {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); //创建一个ArrayList对象
		list.add("大学英语");
		list.add("高等数学");
		list.add("大学语文");
		list.add("大学物理");
		System.out.println("数组中的元素：" + list);
		Iterator itor = list.iterator(); //获得list的迭代器
		while(itor.hasNext()) {
			if (itor.next().equals("大学语文")) {
				itor.remove(); //删除指定元素“大学语文”
			}
		}
		System.out.println("删除后的元素：" + list);
	}

}
