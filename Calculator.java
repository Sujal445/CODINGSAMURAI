import java.util.Scanner;
class Operation{
    float add(float a,float b){
        return (a+b);
    }
    
    float substract(float a , float b){
        return(a-b);
    }
    
    float multiply(float a , float b){
        return (a * b);
    }
    
    float divide(float a , float b){
        return(a / b);
    }
}

public class Calculator {
	public static void main(String[] args) {
		Operation op = new Operation();
		Scanner sc = new Scanner(System.in);
		boolean choice = true;
		float result = 0;
		while(choice){
		    System.out.println("Enter your Operation:");
		    float a = sc.nextFloat();
		    String operator = sc.next();
		    float b = sc.nextFloat();
		    switch(operator){
		        case "+":
		          result = op.add(a,b);
		         System.out.printf("%.2f + %.2f = %.2f \n",a,b,result);
		         break;
		         
		         case "-":
		          result = op.substract(a,b);
		         System.out.printf("%.2f - %.2f = %.2f \n",a,b,result);
		         break;
		         
		         
		         case "*":
		          result = op.multiply(a,b);
		         System.out.printf("%.2f  * %.2f = %.2f \n",a,b,result);
		         break;
		         
		         case "/":
		           result = op.divide(a,b);
		         System.out.printf("%.2f / %.2f = %.2f \n",a,b,result);
		         break;
		         
		         default:
		         System.out.println("You entered invalid operator");
		    }
		    
		    System.out.println("Do you want to repeat , true or false: ");
		    choice = sc.nextBoolean();
		    
		}
		         
		         
	}
}