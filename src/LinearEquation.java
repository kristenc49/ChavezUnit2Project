
public class LinearEquation {
 // instance variables:
    private int x1;
    private int x2;
    private int y1;
    private int y2;


    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double distance() {

        double distance = Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
        return roundedToHundreth(distance);
    }

    public double yIntercept() {

        double yIntercept = y1 - (slope() * x1);
        return roundedToHundreth(yIntercept);
    }

    public double slope() {
            double yDifference = y2 - y1;
            double xDifference = x2 - x1;
            double slope = yDifference / xDifference;
            return roundedToHundreth(slope);

    }

    public String equation() {
        if (y1 == y2) {
            return "y = " + (int) yIntercept();
        } else {
            double yDifference = y2 - y1;
            double xDifference = x2 - x1;
            return "y = " + (int) yDifference + "/" + (int) xDifference + "x + " + yIntercept();
        }
    }

        public String coordinateForX (double x) {
        double y = (roundedToHundreth((slope() * x))) + yIntercept();
            return "The point on the line is (" + x + ", " + y + ")";

        }

        public String lineInfo () {
        if (x1 != x2) {
            return "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")" + "\n" + "The equation of the line between these points is: " + equation() + "\n" + "The slope of this line is: " + slope() + "\n" + "The y-intercept of this line is: " + yIntercept() + "\n" + "The distance between these points is: " + distance();
        } else {
            return "These points are on a vertical line: " + x1;
        }
        }

        private double roundedToHundreth (double toRound){
            double rounded = Math.round(toRound * 100) / 100.0;
            return rounded;
        }

}
