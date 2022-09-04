import java.util.*;
public class SumOfTwoNo {
    public static int sum(int a , int b){
        return(a+b);
    }
    public static int multiply(int a , int b ){
        return(a*b);
    }
    public static int factorical(int a ){
       int fact = 1;
       if(a>0){

           while(a!=0){
               fact = fact * a;
               a--;
          }
       }else{
        fact = 1;
       }
        return fact;

    }
    public static void main (String arr[]){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(sum(a, b));
        System.out.println(multiply(a, b));
        System.out.println(factorical(a));
    }
    
}
