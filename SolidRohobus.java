import javax.swing.plaf.synth.SynthStyle;

class SolidRohobus {
    public static void main(String arr[]){
        for(int row = 1; row<= 5 ; row++){
            for(int col = 1; col<=(5 -row); col++){
                System.out.print("  ");
            }
            for(int col = 1 ; col<=5; col++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}