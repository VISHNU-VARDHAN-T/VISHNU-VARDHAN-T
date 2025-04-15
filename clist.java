package com.list;

public class clist {
    cnode tail;

    public clist() {
        tail = null;
    }

  
    void insertfront(int x) {
        cnode temp = new cnode(x);
        if (tail == null) {
            tail = temp;
            tail.next = tail;
        } else {
            temp.next = tail.next;
            tail.next = temp;
        }
    }

    void insertback(int x) {
        cnode temp = new cnode(x);
        if (tail == null) {
            tail = temp;
            tail.next = tail;
        } else {
            temp.next = tail.next;
            tail.next = temp;
            tail = temp; 
        }
    }


    int deletefront() {
        if (tail == null) {
            System.out.println("List is empty!");
            return -1;
        } else if (tail.next == tail) {
            int x = tail.data;
            tail = null;
            return x;
        } else {
            int x = tail.next.data;
            tail.next = tail.next.next;
            return x;
        }
    }

  
    int deleteback() {
        if (tail == null) {
            System.out.println("List is empty!");
            return -1;
        } else if (tail.next == tail) {
            int x = tail.data;
            tail = null;
            return x;
        } else {
            cnode t = tail.next;
            while (t.next != tail) {
                t = t.next;
            }
            int x = tail.data;
            t.next = tail.next;
            tail = t;
            return x;
        }
    }

  
    void display1() {
        if (tail == null) {
            System.out.println("List is empty!");
            return;
        }
        cnode t = tail.next;
        do {
            System.out.print(t.data + " ");
            t = t.next;
        } while (t != tail.next);
        System.out.println();
    }


	 void display() {
	        if (tail == null) {
	            System.out.println("List is empty!");
	            return;
	        }
	        cnode t = tail.next;
	        do {
	            System.out.print(t.data + " ");
	            t = t.next;
	        } while (t != tail.next);
	        System.out.println();
	    }
}
