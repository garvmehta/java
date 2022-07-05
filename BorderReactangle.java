public class BorderReactangle {
    public static void main(String arg[]) {
        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= 4; col++) {
                    if(row ==1 || row ==4 || col==1 || col ==4){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
            }
            System.out.println(" ");
        }
    }
}
