import java.util.*;
public class Hexagon {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("input length of a side : ");
        double ns =sc.nextDouble();
        System.out.print("the area of hexagon is: " +hexagonArea(n));
    }
    static double hexagonArea(double n){
        return (6 * (n * n)) / (4* Math.tan(Math.PI / 6));

    }    
}
