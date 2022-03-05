package ihs;

import java.util.ArrayList;
import java.util.List;

public class Demo5 {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1,"acb"));
		list.add(new Employee(2, "def"));
		list.add(new Employee(3, "ef"));
		int j = list.stream().filter(i-> i.getId()%2 !=0).mapToInt(i->i.getId()*i.getId()).sum();
		System.out.println(j);
		
	}

}
