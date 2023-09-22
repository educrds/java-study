public class AreaCalculator {
    public static double area(double radius) {
        double area = -1.0;
        return radius < 0 ? area : area(radius, radius) * Math.PI;
    }

    public static double area(double x, double y) {
        double area = -1.0;
        if (x < 0 || y < 0) {
            return area;
        }
        area = x * y;
        return area;
    }

    public static void main(String[] args) {
        area(5.0, 4.0);
        area(5.0);
    }
}
