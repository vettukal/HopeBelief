package book.two;

public class DeleteDuplicates {

	public static void main(String[] args) {
		Node head = new Node();
		head.data = 5;
		
		
		Node n1 = new Node();
		n1.data = 6;
		
		
		Node n2 = new Node();
		n2.data = 7;
		
		Node n3 = new Node();
		n3.data = 5;
		
		Node n4 = new Node();
		n4.data = 8;
		
		Node n5 = new Node();
		n5.data = 7;
		
		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		Node dup1 = head;
		while(dup1!=null){
			System.out.println(dup1.data);
			dup1 = dup1.next;
		}
		System.out.println("---------------------");
		
		Node dup = deleteDuplicates(head);
		System.out.println(dup.data);
		while(dup!=null){
			System.out.println(dup.data);
			dup = dup.next;
		}
		
	}

	public static Node deleteDuplicates(Node head){
		Node i = head;
		Node j = i;

		while(i.next!=null){
			int data = i.data;
			while(j.next!=null){
				if(j.next.data == data)
					j.next = j.next.next;
				j = j.next;
			}
			i = i.next;
		}
		return head;
	}
	

	
	
}

	class Node{
		int data;
		Node next;
	}

