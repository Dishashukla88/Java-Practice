import java.util.Scanner;

class Product{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
   
  // Prompt the user to input the first number
  System.out.print("Input first number: ");
  // Read and store the first number
  int num1 = in.nextInt();
   
  // Prompt the user to input the second number
  System.out.print("Input second number: ");
  // Read and store the second number
   int num2=in.nextInt();
  // Calculate the product of the two numbers and display the result
  System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
    }
}