package calci;
import java.util.Scanner;
public abstract class Calculator{
public static void cal(float a,float  b) {
	System.out.print("Choose the operation to be performed:\n 1->Addition\n 2->Subtraction\n 3->Multiplication\n 4->Division" );
	Scanner oper = new Scanner(System.in);
	int op = oper.nextInt();
	
	switch (op) {
	case 1:
		 if (op == 1) {

		   System.out.printf("The sum is:",a+b);}
		   break;
	case 2:
		if (op == 2) {

			   System.out.printf("The difference is:",a-b);}
			   break;
	case 3:
		if(op == 3) {
			
		     System.out.printf("The multiplication result is:",a*b);}
		
		break;
	case 4:
		if(op == 4) {
			System.out.printf("The division is:",a/b);}
		break;
		
	case 5:
		if(op >= 5) {
			System.out.printf("Invalid input");}
		break;
		
				
			
}

	
}
	public static void main(String[] args) {
		
		Scanner v = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		 float a = v.nextFloat();
			System.out.println("Enter the value of b:");
			float b = v.nextFloat();	
	Calculator.cal(a,b);
	}
	

}
