public class DiamondPattern {
    public static void main(String arr[]){
        for (int row = 1; row <=5; row++) {
                for (int col = 5; col >=row ; col--) {
                    System.out.print("  ");
                }
                for (int col = 1; col <=row ; col++) {
                    System.out.print("* ");
                }
                for (int col = 2; col <=row; col++) {
                    System.out.print("* ");
                }
                System.out.println(" ");
        }

        for (int row = 5; row >=1; row--) {
            for (int col = 5; col >=row ; col--) {
                System.out.print("  ");
            }
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            for (int col = 2; col <=row; col++) {
                System.out.print("* ");
            }
            System.out.println(" ");
    }
        
    }
}
