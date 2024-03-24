package course2.lesson2_encapsulation_inheritance;

public class Slytherin extends HogwartsStudents {
    private int cunning;//хитрость
    private int determination; //решительность
    private int ambition;
    private int resourcefulness; //находчивость
    private int authority; //жажда власти

    public Slytherin(int magic, int transgressions, int cunning, int determination, int ambition, int resourcefulness, int authority) {
        super(magic, transgressions);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.authority = authority;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getAuthority() {
        return authority;
    }
}
