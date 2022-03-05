package ihs;

public class Demo1 {

	
	private String subject1;
	private static String subject2;  
	
	public static void main(String[] args) {

		Demo1 d = new Demo1();
		System.out.println(d.subject1);
		System.out.println(d.subject2);
		
		d.subject1 = "world";
		d.subject2 = "hello";
		System.out.println(d.subject1);
		System.out.println(d.subject2);
		
		d=null;
		d.subject2 = "hello";
		
		System.out.println(d.subject1);
		System.out.println(d.subject2);
		
		
		
	}

}
