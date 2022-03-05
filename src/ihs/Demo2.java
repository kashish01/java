package ihs;

import java.util.LinkedHashSet;

public class Demo2 {

	public static void main(String[] args) {

		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		set.add(1124);
		set.add(null);
		set.add(2324);
		set.add(1111);
		set.add(null);
		set.add(2222);
		set.add(1124);
		
		System.out.println(set);
	}

}
