public class NumberPiramid {
    public static void main(String arr[] ){
        for(int row = 1 ; row<=5; row++){
            for(int col=5; col>=row; col--){
                System.out.print("  ");
            }
            for(int col =1; col<=row; col++){
                System.out.print(row+"   ");
            }
            System.out.println(" ");
        }
    }
}
