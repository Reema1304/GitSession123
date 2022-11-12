package com.packagea;

import java.util.Iterator;
import java.util.TreeSet;

public class SortAscendingOrder {
	public static void main(String[] args) {
		String s="prakash";
		System.out.println("Given String: "+s);
		char ch[]=s.toCharArray();
		TreeSet<Character> ts=new TreeSet<Character>();
		for(int i=0;i<ch.length;i++) {
			ts.add(ch[i]);
		}
		System.out.print("string sorted in asecending order:");
		//System.out.println(ts);
		Iterator<Character> itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next());
			
		}
				
	}

}
