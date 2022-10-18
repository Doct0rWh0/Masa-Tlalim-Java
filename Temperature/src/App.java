import java.util.prefs.AbstractPreferences;

public class App {
    public static void main(String[] args) {
        for (Month i : Month.values()){
            System.out.println(i);
            System.out.println(i.getIndex());
        }
        Month.setTemperature(Month.AUG, 28);
        System.out.println(Month.getTemperature(Month.AUG));
    }
}
