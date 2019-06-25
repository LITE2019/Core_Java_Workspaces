package com.test.core;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethodExp {

	public static void main(String[] args) {
		List<String> employee=new ArrayList<String>();
		employee.add("Pradeep");
		employee.add("Verma");
		employee.add("Liquid");
		
		employee.forEach(action ->System.out.println(action));
		
		//other way
		
		employee.forEach(System.out::println);
		
		//order by
		employee.stream().forEachOrdered(action ->System.out.println(action));
		
		employee.stream().forEachOrdered(System.out::println);

	}

}
