import java.util.Scanner;
public class LinearEquationLogic {

    private LinearEquation linearEquation;
    private Scanner scan;

    public LinearEquationLogic() {
        linearEquation = null;
        Scanner scan = new Scanner(System.in);
    }

    public void start() {
    String start = "y";
    Scanner scan = new Scanner(System.in);
    while (start.equals("y")) {
        welcome();
        System.out.println(linearEquation.lineInfo());
        String str = linearEquation.lineInfo();
        if (!str.contains("These points are")) {
            enterX();
        }
        System.out.print("Would you like to enter another pair of coordinates? Enter y/n:  ");
        start = scan.nextLine();
       }
    }

    private void welcome() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the linear equation calculator!");
        System.out.print("Enter coordinate pair 1: ");
        String coordPair1 = scan.nextLine();
        System.out.print("Enter coordinate pair 2: ");
        String coordPair2 = scan.nextLine();
        int x1 = Integer.parseInt(coordPair1.substring(1, coordPair1.indexOf(",")));
        int y1 = Integer.parseInt(coordPair1.substring((coordPair1.indexOf(",") + 2), coordPair1.indexOf(")")));
        int x2 = Integer.parseInt(coordPair2.substring(1, coordPair2.indexOf(",")));
        int y2 = Integer.parseInt(coordPair2.substring((coordPair2.indexOf(",") + 2), coordPair2.indexOf(")")));

        linearEquation = new LinearEquation(x1, y1, x2, y2);

    }

    private void enterX() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a value for x: ");
        double x = scan.nextDouble();
        String str = linearEquation.coordinateForX(x);
        System.out.println(linearEquation.coordinateForX(x));
    }




}

