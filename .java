import java.util.Scanner;
public class Calculator {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.println("Basic Calculator");
 while (true) {
 System.out.println("Enter an expression (e.g., '5 + 10') or 'exit' to quit:");
 String userInput = input.nextLine();
 if (userInput.equalsIgnoreCase("exit")) {
 System.out.println("Thank you for using the Calculator");
 break;
 }
 try {
 double result = evaluateExpression(userInput);
 System.out.println("Result: " + result);
 } catch (IllegalArgumentException e) {
 System.out.println("Error: " + e.getMessage());
 }
 }
 input.close();
 }
 private static double evaluateExpression(String expression) {
 String[] parts = expression.split(" ");
 if (parts.length != 3) {
7
 throw new IllegalArgumentException("Invalid expression. Use the 
format 'number operator number'");
 }
 double num1 = Double.parseDouble(parts[0]);
 String operator = parts[1];
 double num2 = Double.parseDouble(parts[2]);
 switch (operator) {
 case "+":
 return num1 + num2;
 case "-":
 return num1 - num2;
 case "*":
 return num1 * num2;
 case "/":
 if (num2 == 0) {
 throw new IllegalArgumentException("Division by 0 is not 
allowed.");
 }
 return num1 / num2;
 default:
 throw new IllegalArgumentException("Invalid operator. Valid 
operators are '+', '-', '*', '/'");
 }
 }
}
