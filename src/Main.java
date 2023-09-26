public class Main {
    public static void main(String[] args) {

        int counter = 0;
        int values = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 5 == 0) && (i % 3 == 0)) {
                counter++;
                System.out.println("Current number in loop is: " + i);
                values += i;
            }
            if (counter == 5) {
                break;
            }
        }
        System.out.println("Sum values is: " + values);

    }
}
