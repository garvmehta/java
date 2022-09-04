
import java.util.*;
public class HalfPiramidWithNo {
    public static void main(String arr[]){
        System.out.println("Half Piramid with no is started");
        for(int row = 1 ; row<=5; row++){
            for (int col = 1; col <=(5-row +1); col++) {
                System.out.print(col+" ");
            }
            System.out.println(' ');
        }
    }
}