class ButterFlyPattern {
    public static void main(String arr[]){
        System.out.println(" Buffterfly pattern started ");
        for (int row = 1; row <= 5; row++) {
            for(int col = 1 ; col<=row; col++){
                System.out.print("* ");
            }
            for (int col = 1; col <=((5-row) )*2 ; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            
            System.out.println(" ");
        }
        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col >=row ; col--) {
                System.out.print("* ");
            }
            for (int col = 1; col <=(5-row)*2 ; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col >=row ; col--) {
                System.out.print("* ");
            }
        }
    }
}
