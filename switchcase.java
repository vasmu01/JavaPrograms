//wap to show the concept of switch case.

import java.util.Scanner;
public class switchcase
{
	public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
 	System.out.println("Enter a number");
   int a = sc.nextInt();
    	System.out.println("Enter a number");
  int b = sc.nextInt();
   
	    	System.out.println("Enter a operator +, - ,* , %");
char operator= sc.next().charAt(0);
 switch(operator){
      case '+':
           System.out.println(a+b);
           break;
 	
 
      case '-':
           System.out.println(a-b);
            break;

      case '*':
           System.out.println(a*b);
            break;

      case '/':
           System.out.println((float)a/(float)b);
            break;
 }	
	     
	}
}
