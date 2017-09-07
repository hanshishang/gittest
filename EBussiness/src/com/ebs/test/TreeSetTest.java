package com.ebs.test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
        Set ts = new TreeSet();
        ts.add(new Teacher("zhangsan", 1)); 
        ts.add(new Teacher("mazi", 3));
        ts.add(new Teacher("wangwu",4));
        ts.add(new Teacher("wangmazi", 3));
        ts.add(new Teacher("zzz", 5));
        ts.add(new Teacher("lisi", 2));
        ts.add(new Teacher("yyyy",4));
   
        Iterator it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
	}
}
