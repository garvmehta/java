import java.util.*;
public class Strings{
    static void showLength(String str){
        System.out.println(str.length());
    }
    static void strConcat(String str1, String str2 ){
        System.out.println(str1+str2);
    }
    static void strSeperator(String str){
        for(int i = 0; i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String args[]){
        String name ;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println(name);
        showLength(name);
        strConcat("str1", "str2");
        strSeperator("garv mehta");
    }
}