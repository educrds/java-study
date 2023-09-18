public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(25.42);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long miles = toMilesPerHour(kilometersPerHour);
            String message = kilometersPerHour + " km/h " + "= " + miles + " mi/h";
            System.out.println(message);
        }
    }
}
