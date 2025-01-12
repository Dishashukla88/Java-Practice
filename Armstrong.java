import java.util.*;
public class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arm = 0;
        System.out.print("enter any number : ");
        int n = sc.nextInt();
        int d=n;
        while(n>0)
        {
            int rem = n%10;
            arm = (rem*rem*rem);
            n = n/10;
        }
        if(c==n)
        {
            System.out.println("Armstrong number it is !");
        }
        else{
            
            System.out.println(" no it is not a Armstrong number");

        }
    }
}