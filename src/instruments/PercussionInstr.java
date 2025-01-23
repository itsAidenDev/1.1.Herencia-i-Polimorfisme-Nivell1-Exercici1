package instruments;

public class PercussionInstr extends Instrument implements Play {

    public PercussionInstr(String name, int price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A percussion instrument is playing.");
    }
}