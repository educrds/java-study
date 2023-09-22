public class DecimalComparator {
    public static boolean hasTeen(int num1, int num2, int num3) {
        boolean teen =((num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19));
        return teen;
    }
    public static boolean isTeen(int num1) {
        boolean teen =(num1 >= 13 && num1 <= 19);
        return teen;
    }

    public static void main(String[] args) {
        hasTeen(22, 23, 34);
        isTeen(13);
    }
}
