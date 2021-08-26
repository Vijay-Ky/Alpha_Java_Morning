package app18;

import java.util.ArrayList;
import java.util.Collections;
public class Manager12 extends ArrayList {
public static void main(String[] args) {
		Manager12 list1 = new Manager12();
		list1.add(9);
		list1.add(0);
		list1.add("vijay");
		list1.add(true);
		list1.add(8);
		list1.add(2);
		list1.add(1);
		list1.add(3);
		
		Collections.sort(list1);
		
		System.out.println(list1);
		
	}
}
