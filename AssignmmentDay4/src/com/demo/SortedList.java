package com.demo;


import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedList {
	public static void main(String[] args) {
	SortedSet<String> city= new TreeSet<String>(); 
	city.add("bengaluru");
	city.add("chenai");
	city.add("hydrabhad");
	city.add("mumbai");
	city.add("bhopal");
	city.add("jaipur");
	city.add("shimla");
	city.add("patna");
	city.add("ranchi");
	city.add("panaji");
	System.out.println(city);
	city.add("bengaluru");
	System.out.println(city);
	System.out.println(city.contains("assam"));
	city.add("assam");

	System.out.println(city);

	city.remove("ranchi");
	System.out.println(city);
	Iterator<String> it=city.iterator();
	while(it.hasNext()) {
		

	String citys=it.next();
	System.out.println("welcome to"+" "+citys);
	}
	}
}
