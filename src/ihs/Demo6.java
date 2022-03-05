package ihs;

import java.util.Arrays;
import java.util.List;

public class Demo6 {


	public static void main(String[] args) {

		Integer arr [] = {11,21,32,91,45,76,1001,231,111};
		//11,1001,111
		
//		for(int i=0;i<arr.length;i++)
//		{
//			int temp = arr[i];
//			String str = String.valueOf(temp);
//			if(str.charAt(0)=='1')
//				System.out.println(str);
//			
//		}
		
		List<Integer> list = Arrays.asList(arr);
		list.stream().map(i->String.valueOf(i)).filter(i->i.startsWith("1", 0)).forEach(System.out::println);
		
		
		//linklist 
		
	}

}
