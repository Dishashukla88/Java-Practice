import java.util.*;
public class Palindrome2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n = sc.nextInt();
        int rev = 0;
        int c = n;
        while(c>0){
            rev = rev*10 + c % 10;
            c= c/10;
        }
        if(rev == n){
            System.out.println("palindrome number it is!");
        }
        else{
            System.out.println("no it is not a palindrome number");
        }
    }
}
