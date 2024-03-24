package course2.lesson2_encapsulation_inheritance;

public class Gryffindor extends HogwartsStudents{
    private int nobility;//благородство
    private int honor;
    private int bravery;

    public Gryffindor(int magic, int transgressions, int nobility, int honor, int bravery) {
        super(magic, transgressions);
        this.bravery = bravery;
        this.honor = honor;
        this.nobility = nobility;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

}
