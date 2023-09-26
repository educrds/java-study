public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean playing = false;
        if (summer == false && temperature > 25 && temperature <= 35) {
            return playing;
        } else if (summer == true && temperature > 25 && temperature <= 45) {
            return !playing;
        }
        return playing;
    }

    public static void main(String[] args) {
//        isCatPlaying(true, 10);
        isCatPlaying(false, 25);
    }

}
