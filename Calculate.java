
import java.util.*;;

public class Calculate {
    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Calculator");
        System.out.println("Enter the First Value");
        int a = input.nextInt();
        System.out.println("Enter the Second Value");
        int b = input.nextInt();
        System.out.println("Enter 1 for the sum");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for divde");
        System.out.println("Enter 4 for the Multiple");
        System.out.println("Enter the Operation: ");
        int op = input.nextInt();
        
        switch (op) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a / b);
                break;
            case 4:
                System.out.println(a * b);
                break;
            default:
                System.out.println("Invalid option Entered");
        }
    }
}
