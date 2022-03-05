package ihs;

import java.util.Arrays;
import java.util.List;

public class Demo7 {


	public static void main(String[] args) {

		//1
		//2
		
		Node head = new Node(1, null);
		
		Node first = new Node(2,null);
		head.pointer=first;
		
//		Node sec = new Node(3,null);
//		first.pointer=sec;
		
		
		Node i=head,j=head;
		for( ;j!=null &&  j.pointer!=null ;i=i.pointer,j=j.pointer.pointer)
		{
			
		}
		
		System.out.println(i.data);
		
		//1,2,3
		
	}

}

class Node{
	
	int data;
	Node pointer;
	
	public Node getPointer() {
		return pointer;
	}

	public void setPointer(Node pointer) {
		this.pointer = pointer;
	}

	public Node(int data, Node pointer) {
		this.data = data;
		this.pointer = null;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	
}
