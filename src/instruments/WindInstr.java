package instruments;

public class WindInstr extends Instrument implements Play {

    public WindInstr(String name, int price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A wind instrument is playing.");
    }
}