import java.util.Scanner;

public class BaseCalculator {
	public class void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		//Input first number and base
		System.out.print("Enter the first number: ");
		String num1 = scanner.nextLine();
		System.out.print("Enter the base of the first number (2 for binary, 8 for octal, 10 for decimal, 18 for hexadecimal): ");
		int base1 = scanner.nextInt();
		
		//Input the second number and base
		System.out.print("Enter the second number: ");
		String num2 = scanner.nextLine();
		System.out.print("Enter the base of the second number (2 for binary, 8 for octal, 10 for decimal, 18 for hexadecimal): ");
		int base2 = scanner.nextLine();
		
		//Input operation
		System.out.print("Enter the operation (+,-,*,/)");
		char operation = scanner.nextInt.charoArt(Index:0);
		
		//Input result base
		System.out.print("Enter the base for the result (2 for binary, 8 for octal, 10 for decimal, 18 for hexadecimal): ");
		int result = 0;
		
		//perform the operation
		switch (operation) {
			case '+' :
			        result = decimalNum1 + decimalNum2;
			        break;
		    case '-' :
		            result = decimalNum1 - decimalNum2 ;
		            break;
		     case '*' :
		            result = decimalNum1 * decimalNum2;
		            break;
		      case '/' :
		            result = decimalNum1 / decimalNum2;
		            break;
		       default:
		            System.out.println("Invalid operation");
		            return;
	}
	//output the result in the chosen base
	String resultString;
	switch (resultBase) {
		            case 2:
		                    resultString = Integer.toBinaryString(result);
		                    break;
		             case 8:
		                     resultString = Integer.toOctalString(result);
		                     break;
		              case 10:
		                     resultString = Integer.toDecimalString(result);
		                     break;
		               case 16:
		                      resultString = Integer.toHexString(result);
		                      break;
		                default:
		                      System.out.println("Invalid result base");
		                      return;
	}
	System.out.println("The result is: " + resultString);
    scanner.close();{
    	}
    }
}                  		            		            	        			