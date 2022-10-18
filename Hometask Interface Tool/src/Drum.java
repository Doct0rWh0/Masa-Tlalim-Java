public class Drum implements instrument{
    int size = 24;
    @Override
    public void play() {
        System.out.println("Drum is playing in "+ KEY + " it's size is " + size);
    }
}
