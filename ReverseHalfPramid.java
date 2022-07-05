public class ReverseHalfPramid {
    public static void main (String arg[]){
        for (int row = 5; row >=1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println("  ");
        }
    }
}
