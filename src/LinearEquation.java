public class LinearEquation {
 // instance variables:
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    private int coordPair1;

    private int coordPair2;
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        LinearEquation linearEquation = new LinearEquation(x1, y1, x2, y2);
    }

    public double distance() {
        return Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }

    public double yIntercept() {
        return y1 - (slope() * x1);
    }

    public double slope() {
        double yDifference = y2 - y1;
        double xDifference = x2 - x1;
        double slope = yDifference / xDifference;
        return slope;
    }

    public String equation() {
        double yDifference = y2 - y1;
        double xDifference = x2 - x1;
        return "y = " + yDifference + "/" + xDifference + " + " + yIntercept();
    }

    public String coordinateForx(double x) {
        return "(" + x + ", " + ((slope() * x1) + yIntercept());
    }

    public String lineInfo() {
        return "The two points are: " + coordPair1 + " and " + coordPair2 + "\n" + "The equation of the line between these points is: " + equation() + "\n" + "The slope of this line is: " + slope() + "The y-intercept of this line is: " + yIntercept() + "The distance between these points is " + distance();
    }
}
