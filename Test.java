package MyAdapter;

public class Test {
    public static void main(String[] args) {
        Connection charger = new Charger(new Iphone());
        charger.connectWithPowerSocket();
    }
}
