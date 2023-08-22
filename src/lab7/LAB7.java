package lab7;

public class LAB7 {

    public static void main(String[] args) {
        POINT p1 = new POINT();
        POINT p2 = new POINT(10, 30.5);
        POINT p3 = new POINT();
        System.out.println("the distance is: " + p1.distance(p2));
        System.out.println("the distance is: " + p3.distance(p1, p2));
    }

}
