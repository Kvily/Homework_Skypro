package course2.lesson2_encapsulation_inheritance;

public class Ravenclaw extends HogwartsStudents{
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(int magic, int transgressions, int intelligence, int wisdom, int wit, int creativity) {
        super(magic, transgressions);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }
}
