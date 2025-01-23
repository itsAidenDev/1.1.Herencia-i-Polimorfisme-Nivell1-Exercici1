package instruments;

public class Main {
    public static void main(String[] args) {

        WindInstr flute = new WindInstr("Flute", 100);
        StringInstr guitar = new StringInstr("Guitar", 250);
        PercussionInstr drums = new PercussionInstr("Drums", 500);

        System.out.println("\nPlaying instruments...");
        flute.play();
        guitar.play();
        drums.play();
    }
}