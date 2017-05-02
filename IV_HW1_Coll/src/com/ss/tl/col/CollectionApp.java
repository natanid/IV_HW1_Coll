//1. Написати програму для роботи з списком. 
//У першій половині списку замінити всі входження деякого елементу Е1
// на  будь-який інший елемент Е2;
package com.ss.tl.col;

import java.util.ArrayList;

public class CollectionApp {

	
	public static void main(String[] args) {

		ArrayList<String> elements = new ArrayList<String>();
		// adding elements:
		elements.add("E1");
		elements.add("E3");
		elements.add("E1");
		elements.add("E2");
		elements.add("E9");
		elements.add("E4");
		elements.add("E5");
		elements.add("E1");
		elements.add("E5");
		elements.add("E2");
	//	System.out.println(elements.size());
		System.out.println(elements);
		
		int half = elements.size() / 2;
		for (int i = 0; i < half; i++) {
			if(elements.get(i).contains("E1")){
//				if(elements.get(i).equals("E1")){
				int index = elements.indexOf(elements.get(i));
				elements.set(index,"E2");
			}
			
		}
		
		System.out.println(elements);

	}
}