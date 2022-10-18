public class Tube implements instrument{

    int diameter = 30;

    @Override
    public void play() {
        System.out.println("Tube is playing in "+ KEY + ", it's diameter is " + diameter);
    }
}
