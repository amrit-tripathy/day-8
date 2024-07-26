package com.grayMatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoOnStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = new Integer[] {45,10,23,34,99,78,55};
		Arrays.stream(arr)
		.limit(4)
		.filter(i->i%2==0)
		.map(i->i+10)	//map===intermediate operation
		.collect(Collectors.toList());//it converts to list
		//.forEach(i->System.out.println(i));  //forEach===terminal operation
		
		List<Integer> lis = new ArrayList<Integer>(Arrays.asList(4,5,6,7,8,9,0,4,5,6,7,8));
		
		//distinct can be used to skip repeated elements
		ArrayList<String>alist =new ArrayList<String>();
		alist.add("hello");
		alist.add("world");
		alist.add("hai");
		alist.add("bye");
		alist.add("apple");
		
		
		
		
		
		
	}

}
