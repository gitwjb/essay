package com.wjb.one.testb.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestList {
	public static void main(String[] args) {
		List<Object> lst = new ArrayList<>();
		Map<String, Object> hm = new HashMap<>();
		hm.put("name", "张三");
		lst.add(hm);
		
		System.out.println(Arrays.toString(lst.toArray()).getBytes().length);
	}
}
