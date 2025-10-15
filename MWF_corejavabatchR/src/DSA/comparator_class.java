package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Admin_class{
	int id;
	String name;
	
	public Admin_class(int id,String name) {
		this.id = id;
		this.name = name;
	}
}
class idchoice implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Admin_class a1 =(Admin_class) o1;
		Admin_class  a2 =(Admin_class) o2;
		/*if(a1.id == a2.id) {
			return 0;}
		else if (a1.id >a2.id) {
			return 1;}
		else {
			return -1;
		}*/
			
		return Integer.compare(a1.id,a2.id);
		
		
	}
	
}
class namechoice implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Admin_class a1 =(Admin_class) o1;
		Admin_class  a2 =(Admin_class) o2;
		return a1.name.compareToIgnoreCase(a2.name); //ignore case for not confusion between C and c
	}
	
}
public class comparator_class {
public static void main(String[] args) {
	ArrayList<Admin_class> al = new ArrayList<Admin_class>();
	al.add(new Admin_class(324, "\tZack"));
	al.add(new Admin_class(34, "\tBack"));
	al.add(new Admin_class(24, "\tNaack"));
	al.add(new Admin_class(404, "\tAck"));
	al.add(new Admin_class(44444, "\tCk"));
	al.add(new Admin_class(14, "\tMac"));
	al.add(new Admin_class(44, "\tcheck"));
	
	Collections.sort(al, new idchoice());
	
	Iterator<Admin_class> it = al.iterator();
	while(it.hasNext()) {
		Admin_class ac = it.next();
		System.out.println(ac.id +  ""+ ac.name);
	}
	
	System.out.println("give asorted name : ");
	
	Collections.sort(al , new namechoice());
	Iterator<Admin_class> name_it = al.iterator();
	while(name_it.hasNext()) {
		Admin_class ac = name_it.next();
		System.out.println(ac.id  +""  + ac.name);
	}
	
}
}
