package queue;
import java.util.Scanner;
public class Queue {
private int r,f,MAX,a[];          
	int dequeue() {
if(f==-1) {
	return -1;}
else if(f==r){
	int x = a[f];
	f=r=-1;
	return x;
	}
else {
	int x = a[f];
	f++;
	return x;}
	}
	boolean IsEmpty() {
		if(f==-1) {
			return true;}
		else {
			return false;}}
boolean IsFull() {
			if(r==MAX-1) {
				return true;}
			
			else {
				return false;
			}}
			void display() {
				for(int i=0;i<=r;i++) {
					System.out.println(a[i]);
				}}
				void enqueue(int x) {
					if(r==MAX-1) {
						System.out.println("Overflow");
					}
					else if(f==-1||r==-1) {
						r=f=0;
						a[r]=x;}
					else {
						r++;
						a[r]=x;
					}}
				
				
public static void main(String[] args) {
	int ch;
	Scanner vi= new Scanner(System.in);
	Queue qu = new Queue();
	do {
		System.out.println("1.Add an Element\n 2.Pop an element\n 3.Display\n 4.IsEmpty\n 5.IsFull\n 6.Exit");
		ch = vi.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter the element to be inserted:");
			qu.enqueue(vi.nextInt());
			break;
		case 2:
			System.out.println(qu.dequeue());
			break;
		case 3:
			qu.display();
			break;
		case 4:
			if(qu.IsEmpty()) {
				System.out.println("Underflow");
				System.out.println(true);}
				break;	
		case 5:
			if(qu.IsFull());
				System.out.println("Overflow");
				System.out.println(true);
				break;}
		
	}
	while(ch!=5);  
	System.out.println("END");
}}
	




				
			