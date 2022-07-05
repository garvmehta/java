import java.util.*;

class Table {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        System.out.println(
        "Welcome to table create App"
        );
        System.out.print("Please Enter number to get table: ");
        int num = in.nextInt();

        System.out.println("Here is the Table of it");

        for(int i =1; i<=10;i++ ){
            System.out.println(num*i);
        }
    }
}