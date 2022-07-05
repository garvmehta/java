public class palendromePattern {
    public static void main(String arr[]){
        for(int row = 1; row<=5; row++){
            for (int col = 5; col >=row; col--) {
                System.out.print("  ");    
            }

            for(int col=row; col>=1; col-- ){
                System.out.print(col+" ");
            }
            for (int col = 2; col <=row; col++) {
                System.out.print(col+" ");
            }
            System.out.println(" ");
        }
    }
}
