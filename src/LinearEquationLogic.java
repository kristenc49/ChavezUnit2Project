import java.util.Scanner;
public class LinearEquationLogic {

    private LinearEquation linearEquation;
    public LinearEquationLogic() {
        linearEquation = null;
    }

    public void start() {
    welcome();
    linearEquation.lineInfo();
    }

    private void welcome() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the linear equation calculator!");
        System.out.println("Enter coordinate pair 1: ");
        String coordPair1 = scan.nextLine();
        System.out.println("Enter coordinate pair 2: ");
        String coordPair2 = scan.nextLine();
        int x1 = Integer.parseInt(coordPair1.substring(0, coordPair1.indexOf(",")));
        int x2 = Integer.parseInt(coordPair1.substring(coordPair1.indexOf(","), coordPair1.indexOf(")")));
        int y1 = Integer.parseInt(coordPair2.substring(0, coordPair2.indexOf(",")));
        int y2 = Integer.parseInt(coordPair2.substring(coordPair2.indexOf(","), coordPair2.indexOf(")")));

        LinearEquation linearEquation = new LinearEquation(x1, y1, x2, y2);
        System.out.println(linearEquation.lineInfo(););
    }



}

