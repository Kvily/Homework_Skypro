package course2.lesson2_encapsulation_inheritance;

public class Hufflepuff extends HogwartsStudents {
    private int hardworking;//трудолюбие
    private int loyalty;//верность
    private int honesty;//честность

    public Hufflepuff(int magic, int transgressions, int hardworking, int loyalty, int honesty) {
        super(magic, transgressions);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }
}
