import java.util.*;
public class Factrecursion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number : ");
        int num = sc.nextInt();
        int answer = factorial(num);
        System.out.print(" factorial of " + num + " is : "+answer);
    }
    static int factorial(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

    
}
