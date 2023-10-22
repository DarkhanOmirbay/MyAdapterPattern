package MyAdapter;

public class Charger implements Connection{
    private Iphone iphone;
    public Charger(Iphone iphone){
        this.iphone=iphone;
    }

    @Override
    public void connectWithPowerSocket() {
        iphone.charging();
    }
}
