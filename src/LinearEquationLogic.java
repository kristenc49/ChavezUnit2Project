import java.util.Scanner;
public class LinearEquationLogic {


    public void start() {

    }

    public void welcome() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the linear equation calculator!");
        System.out.println("Enter coordinate pair 1: ");
        String coordPair1 = scan.nextLine();
        System.out.println("Enter coordinate pair 2: ");
        String coordPair2 = scan.nextLine();
    }
}
