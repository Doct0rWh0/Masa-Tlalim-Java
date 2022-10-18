public class Guitar implements instrument{
    int stringNum = 6;

    @Override
    public void play() {
        System.out.println("Guitar is playing in " + KEY + ", it have " + stringNum + " strings");
    }
}
