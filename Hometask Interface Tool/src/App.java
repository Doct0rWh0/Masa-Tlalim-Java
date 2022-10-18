public class App {

    public static void main(String[] args) {
        instrument[] instrArr = new instrument[9];
//        String[] guitarNames = {"Hohner", "Yamaha", "Gibson"};
//        String[] drumNames = {"Barrel", "Snare drum", "Hi-Hat"};
//        String[] tubeNames = {""};
        for(int i = 0; i < instrArr.length; i++){
            if(i % 3 == 0)
                instrArr[i] = new Tube();
            else if (i % 2 == 0)
                instrArr[i] = new Drum();
            else
                instrArr[i] = new Guitar();
        }
        for(int i = 0; i < instrArr.length; i++){
            instrArr[i].play();
        }
    }
}
