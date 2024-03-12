import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 40);
        Fighter alex = new Fighter("Alex" , 20 , 95, 100, 20);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run(r.randomlySelectFirstFighter());
    }
}
