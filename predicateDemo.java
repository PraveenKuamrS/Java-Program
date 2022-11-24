package com.string;

import java.util.function.Predicate;

public class predicateDemo {

	public static void main(String[] args) {
		
		Predicate< Integer> gt=(i) -> i>10;
		
		boolean result =gt.test(8);
		System.out.println("Greater than 10 :"+result);

	}

}
