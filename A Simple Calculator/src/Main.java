import java.util.Scanner; // Import the Scanner class
public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in); // Create a Scanner Object

        boolean continueCalc = true;

        while (continueCalc) {
            System.out.println("Enter an operator (+, -, *, /, sqrt, powers): ");

            String operation = myObj.next(); //Get a character from a String

            double result;

            if (operation.equals("sqrt")) {
                // Only ask for one number and calculate square root
                System.out.print("Enter a number to find the square root: ");
                double num = myObj.nextDouble();
                result = Math.sqrt(num);
                System.out.println("Result: " + result);

            } else if (operation.equals("powers")) {
                System.out.println("Enter a base: ");
                double base = myObj.nextDouble();

                System.out.println("Enter a exponents: ");
                double exponent = myObj.nextDouble();

                result = Math.pow(base, exponent);

                System.out.println("Result: " + result);

            } else {

                System.out.println("Enter first number: ");

                double UserNum1 = myObj.nextDouble(); //Read first user input


                System.out.println("Enter second number: ");

                double UserNum2 = myObj.nextDouble(); //Read second user input

                switch (operation) {
                    case "+":
                        result = UserNum1 + UserNum2;
                        break;
                    case "-":
                        result = UserNum1 - UserNum2;
                        break;
                    case "*":
                        result = UserNum1 * UserNum2;
                        break;
                    case "/":
                        result = UserNum1 / UserNum2;
                        break;
                    case "%":
                        System.out.print("Do you want 'percent' or 'modulus'? ");
                        String type = myObj.next(); // you'll need to make sure 'scanner' is accessible
                        if (type.equalsIgnoreCase("percent")) {
                            result = (UserNum1 / 100) * UserNum2;
                        } else if (type.equalsIgnoreCase("modulus")) {
                            result = UserNum1 % UserNum2;
                        } else {
                            System.out.println("Invalid type for %");
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Invalid operator");
                        continue; // restart loop
                }
                System.out.println("Result: " + result);
            }

            System.out.println("Do you want to continue? (yes/no) : ");
            String answer = myObj.next();

            if (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("y")) {
                continueCalc = false;
                System.out.println("Calculator ended. Goodbye!");
            }
        }
            myObj.close();
    }
}

