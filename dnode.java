package list;
import java.util.Scanner;



public class dnode {
	
	    dnode next, prev;
	    int data;

	    dnode(int x) {
	        data = x;
	        next = prev = null;
	    }
	}

	class DList {
	    dnode head, tail;

	    DList() {
	        head = tail = null;
	    }

	    void insertFront(int x) {
	        dnode temp = new dnode(x);
	        if (head == null) {
	            head = tail = temp;
	        } else {
	            temp.next = head;
	            head.prev = temp;
	            head = temp;
	        }
	    }

	    void insertLast(int x) {
	        dnode temp = new dnode(x);
	        if (head == null) {
	            head = tail = temp;
	        } else {
	            tail.next = temp;
	            temp.prev = tail;
	            tail = temp;
	        }
	    }

	    int deleteFront() {
	        if (head == null) {
	            System.out.println("---Empty--- cannot delete");
	            return -1;
	        }
	        int x = head.data;
	        if (head == tail) {
	            head = tail = null;
	        } else {
	            head = head.next;
	            head.prev = null;
	        }
	        return x;
	    }

	    int deleteLast() {
	        if (head == null) {
	            System.out.println("---Empty--- cannot delete");
	            return -1;
	        }
	        int x = tail.data;
	        if (head == tail) {
	            head = tail = null;
	        } else {
	            tail = tail.prev;
	            tail.next = null;
	        }
	        return x;
	    }

	    void count() {
	        int i = 0;
	        dnode o = head;
	        while (o != null) {
	            o = o.next;
	            i++;
	        }
	        System.out.println("Number of nodes: " + i);
	    }

	    void display() {
	        if (head == null) {
	            System.out.println("--Empty--");
	        } else {
	            dnode t = head;
	            while (t != null) {
	                System.out.print(t.data + " ");
	                t = t.next;
	            }
	            System.out.println();
	        }
	    }
	
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        DList list = new DList();
	        int choice, value;

	        do {
	            System.out.println("\n1. Insert Front\n2. Insert Last\n3. Delete Front\n4. Delete Last\n5. Display\n6. Count Nodes\n7. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter value to insert at front: ");
	                    value = scanner.nextInt();
	                    list.insertFront(value);
	                    break;
	                case 2:
	                    System.out.print("Enter value to insert at last: ");
	                    value = scanner.nextInt();
	                    list.insertLast(value);
	                    break;
	                case 3:
	                    System.out.println("Deleted from front: " + list.deleteFront());
	                    break;
	                case 4:
	                    System.out.println("Deleted from last: " + list.deleteLast());
	                    break;
	                case 5:
	                    list.display();
	                    break;
	                case 6:
	                    list.count();
	                    break;
	                case 7:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid input, try again.");
	            }
	        } while (choice != 7);

	        scanner.close();
	    }
	}
	
