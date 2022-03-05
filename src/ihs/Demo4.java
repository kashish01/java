package ihs;

import java.util.ArrayList;
import java.util.List;

public class Demo4 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		int j = list.stream().mapToInt(i->i).sum();
		System.out.println(j);
		
	}

}
