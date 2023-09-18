public class BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp(true, -1);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean valueReturned = false;
        if (hourOfDay < 0 || hourOfDay > 23) {
            return valueReturned;
        }
        if (barking && hourOfDay < 8 || hourOfDay > 22) {
            valueReturned = true;
        }
        return valueReturned;
    }
}
