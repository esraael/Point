package lab7;

public class POINT {

    private double x;
    private double y;

    public POINT() {

    }

    public POINT(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public double distance(POINT p) {
        double X = x - p.x;
        double Y = y - p.y;
        return Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));
    }

    public double distance(POINT p1, POINT p2) {
        double X = p1.x - p2.x;
        double Y = p1.y - p2.y;
        return Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));

    }

    @Override
    public String toString() {
        return "Pointt{" + "x=" + x + "Y=" + y + '}';
    }

}
