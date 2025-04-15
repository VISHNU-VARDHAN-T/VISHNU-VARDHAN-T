package list;
import java.util.Scanner;
public class Node{
Node next;
int data;
	 Node() {
		next=null;
		
	}
	 
Node(int x){
	data=x;
	next=null;
	
}
class List {
	private int i=0;
	Node tail;
	List(){
		tail=null;
		
	}
	void insertfront(int x) {
		Node temp = new Node(x);
		
		if(tail==null) {
			System.out.println("--Empty--");
			tail=temp;
		}
		else {
			temp.next = tail.next;
			tail.next=temp;
		}
	}
	void insertlast(int x) {
		Node temp = new Node(x);
		if(tail==null) {
			System.out.println("--Empty--");
			tail=temp;
		tail.next=tail;
		}
		else {
			tail.next=tail.next;
			tail.next=temp;
			tail=temp;
		}
	}
	int deletefront() {
		if(tail==null) {
			System.out.println("--Empty--");
		return -1;
		}
		else if(tail.next==tail) {
			
			tail=null;
			return 0;
		}
		else {
			int x = tail.data;
			tail=tail.next.next;
			return x;
		}
	}
	int deletelast() {
		if(tail==null) {
			System.out.println("--Empty--");
		return -1;
		}
		else if(tail.next==tail) {
			
			tail=null;
			return 0;
		}
		else {
	Node t = tail;
	while(t!=tail) {
		t=t.next;
	}
	t.next=t.next.next;
	int x = tail.data;
	tail=t;
	return x;
	}
	}
	void display() {
		if(tail==null) {
			System.out.println("--Empty--");
		}
		else {
		Node t=tail;
			while(t!=null) {
				System.out.println(t.data);
				t=t.next;
			}}
	}
	void count() {
		Node o = tail;
		while(o!=null) {
			o = o.next;
			i++;
			
		}
		System.out.println("number of node are:"+ i);
	}
int search(int x) {
	Node t=tail;
	while(t!=null) {
		if(x==t.data) {
			System.out.println("Found the element :"+x);
		return 1;
		}
		
		
		else {
			System.out.println("Searching............."+x+"\nnot found");
		t = t.next;
			
		}
	}
	return 0;
	
	}
	
}

	public class Node1 {
		public static void main(String args[]) {
			int a;
			Node o = new Node();
			List l1 = o.new List();
			Scanner sc = new Scanner(System.in);
			do {
				System.out.println(" 1.Insert front\n 2.Display\n 3.Insert last\n 4.Delete front\n 5.Delete last\n 6.no of nodes\n 7.search for x\n 8.exit");
				a = sc.nextInt();
				switch(a) {
				case 1:
					System.out.println("Enter the element to be inserted in front:");
					l1.insertfront(sc.nextInt());
					break;
				case 2:
					l1.display();
				break;
				case 3:
					System.out.println("Enter the element to be inserted in last:");
				l1.insertlast(sc.nextInt());
				break;
				case 4:
				l1.deletefront();
				break;
				case 5:
		       l1.deletelast();
		       break;
				case 6:
					l1.count();
							break;
				case 7:
					
						System.out.println("Enter the elment u want to search:");
					l1.search(sc.nextInt());
					 
					break;
				case 8:
					return;
				
				}
				
			}
			while(a!=8); {
				sc.close();}
			}
		

	
}}

