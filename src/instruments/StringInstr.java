package instruments;

public class StringInstr extends Instrument implements Play {

    public StringInstr(String name, int price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A string instrument is playing.");
    }
}