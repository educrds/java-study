public class SumOddRange {

    public static boolean isOdd(int number) {
        boolean valueReturned = false;
        boolean oddCondition = number % 2 == 1;

        if (number > 0 && oddCondition) {
            valueReturned = true;
        }
        return valueReturned;
    }

    public static int sumOdd(int startNum, int endNum) {
        int sumValues = 0;

        if (endNum >= startNum && endNum > 0 && startNum > 0) {
            for (int i = startNum; i <= endNum; i++) {
                if (isOdd(i)) {
                    sumValues += i;
                }
            }
        } else {
            return -1;
        }
        return sumValues;
    }

    public static void main(String[] args) {
        int values = sumOdd(13, 13);
        System.out.println(values);
    }
}
