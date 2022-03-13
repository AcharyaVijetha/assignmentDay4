package com.demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListS {
public static void main(String[] args) {
	List<String> names= new LinkedList<String>(); 
names.add("ram");
names.add("raju");
names.add("kiran");
names.add("ramya");
names.add("Tanush");
names.add("kirti");
names.add("vijay");
names.add("sham");
names.add("lucky");
names.add("vinay");
System.out.println(names);
names.add(3,"vijetha");
System.out.println(names);
names.remove(6);
System.out.println(names);
System.out.println(names.contains("vijay"));
Iterator<String> it=names.iterator();
while(it.hasNext()) {
	

String name=it.next();
System.out.println("Hi"+name);
}
for(String name:names)
	System.out.println("hi"+name);
ListIterator<String> lstr=names.listIterator();

while(lstr.hasNext()) {
	String name=lstr.next();
			System.out.println("Hello"+name);		
}
for(String name:names)
	System.out.println("hi"+name);

}
}
