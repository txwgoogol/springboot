package com.example.springboot;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	@org.junit.Test
	public void contextLoads() {
		Set<String> set = new HashSet<>();
		set.add("20180101");
		set.add("20180102");
		set.add("20180103");
		set.add("20180104");
		set.add("20180105");
		
		System.out.println("排序前：" + set.toString());
		Set<String> sortSet = new TreeSet<String>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);//降序排列
			}
		});
		sortSet.addAll(set);
		System.out.println("排序后：" + sortSet);
	}
}
