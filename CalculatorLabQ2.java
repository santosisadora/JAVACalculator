import java.util.Scanner;

public class CalculatorLabQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2;
		//get input from user asking for both numbers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        num1 = scanner.nextInt();
        System.out.print("Enter second number:");
        num2 = scanner.nextInt();

        //ask the user to choose the operation he wants to perform with the numbers
        System.out.print("Enter an operator (+, -, *, /): ");
        //using char because it corresponds to math operations
        char operator = scanner.next().charAt(0);

        scanner.close();
        int output;
       //use switch to correspond to each operation
        switch(operator)
        {
            case '+':
            	output = num1 + num2;
                break;

            case '-':
            	output = num1 - num2;
                break;

            case '*':
            	output = num1 * num2;
                break;

            case '/':
            	output = num1 / num2;
                break;
                
                //Display an error message in case user types anything other than an operator
                
                default:
                    System.out.printf("You have entered wrong operator");
                    return;
            }
            //print ou the output
            System.out.println(output);
        }
	}
