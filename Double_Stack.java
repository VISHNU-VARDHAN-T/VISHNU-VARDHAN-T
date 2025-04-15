package stack;
import java.util.Scanner;
public class Double_Stack {
 int top1,top2;
 int size;
 int[] arr;

 public Double_Stack(int size) {
	 this.size = size;
	 top1 = -1;
	 top2 = size;
	 arr = new int[size];
 }

 public void push1(int x) {
	 if(top1 < top2 -1) {
		 top1++;
		 arr[top1] = x;
	 }
	 else {
		 System.out.println("Stack1 is overflow");
	 }
 }
 void push2(int x1) {
	 if (top2 > top1 + 1) {
		 top2 --;
		 arr[top2] = x1;
	 }
	 else {
		 System.out.println("Stack2 is overflow");
	 }
 }
int pop1() {
	if(top1 >= 0) {
		return arr[top1];
	}
	else {
		System.out.println("Stack 1 is underflow");
	return -1;
	}
}
int pop2() {
	if(top2 <size) {
		return arr[top2];
	}
	else {
		System.out.println("Stack2 is underflow");
		return -1;
	}
}
void displayStack1() {
	if(top1 == -1) {
		System.out.println("Stack1 is empty");
	}
	else {
		System.out.println("Stack 1 are:");
		for(int i=0;i <= top1;i++) {
			System.out.println(i);
		}
	}
}
void displayStack2() {
	if( top2 > size) {
		System.out.println("Stack 2 is empty");
	}
	else {
		System.out.println("Stack2 are: ");
		for(int i=size -1;i >=top2;i--) {
			System.out.println(i);
	}
}
}
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	int ch;
	System.out.println("Enter the size of the array");
	int size = scanner.nextInt();
	Double_Stack ts = new Double_Stack(size);
	do  {
	System.out.println("Choose an operation from below");
	System.out.println("1: Push to Stack 1");
    System.out.println("2: Push to Stack 2");
    System.out.println("3: Pop from Stack 1");
    System.out.println("4: Pop from Stack 2");
    System.out.println("5: Display Stack 1");
    System.out.println("6: Display Stack 2");
    System.out.println("7: Exit");
    System.out.print("Enter choice: ");
     ch = scanner.nextInt();
    
    switch (ch) {
    case 1:
    	System.out.println("Enter the values in Stack 1");
    	int x= scanner.nextInt();
    	ts.push1(x);
    	break;
    case 2:
        System.out.print("Enter value to push into Stack 2: ");
        int x1 = scanner.nextInt();
        ts.push2(x1);
        break;
    case 3:
        System.out.println("Popped from Stack 1: " + ts.pop1());
        break;
    case 4:
        System.out.println("Popped from Stack 2: " + ts.pop2());
        break;
    case 5:
        ts.displayStack1();
        break;
    case 6:
        ts.displayStack2();
        break;
    case 7:
        System.out.println("Exiting program...");
        
        return;
    }
	}
	while(ch!=7);
	scanner.close();
}
}
		
	

