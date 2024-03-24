package course2.lesson2_encapsulation_inheritance;

public class Main {
    public static void main(String[] args) {
        Gryffindor HarryPotter = new Gryffindor(93, 99, 98, 97, 92);
        Gryffindor HermioneGranger = new Gryffindor(100, 99, 98, 97, 72);
        Gryffindor RonWeasley = new Gryffindor(73, 70, 68, 82, 53);

        Slytherin DracoMalfoy = new Slytherin(4, 45, 20, 98, 36, 56, 55);
        Slytherin GrahamMontague = new Slytherin(2, 45, 52, 32, 52, 65, 17);
        Slytherin GregoryGoyle = new Slytherin(58, 7, 0, 12, 78, 96, 32);

        Hufflepuff CedricDiggory = new Hufflepuff(54, 2, 45, 75, 100);
        Hufflepuff ZachariahSmith = new Hufflepuff(54, 5, 34, 7, 42);
        Hufflepuff JustinFinchFletchley = new Hufflepuff(65, 96, 5, 75, 9);

        Ravenclaw ZhouChang = new Ravenclaw(51, 63, 48, 24, 45, 66);
        Ravenclaw PadmaPatil = new Ravenclaw(49, 96, 29, 93, 28, 97);
        Ravenclaw MarcusBelby = new Ravenclaw(5, 63, 0, 78, 35, 75);

        Hogwarts hogwarts = new Hogwarts();
        Hogwarts.printPropertyAllStudents(HarryPotter, DracoMalfoy, CedricDiggory, ZhouChang);
        Hogwarts.comparePropertyStudentsGryffindor(HermioneGranger, RonWeasley);
        Hogwarts.comparePropertyStudentsSlytherin(DracoMalfoy, GrahamMontague);
        Hogwarts.comparePropertyStudentsRavenclaw(ZhouChang, PadmaPatil);
        Hogwarts.comparePropertyStudentsHufflepuff(CedricDiggory, ZachariahSmith);
        Hogwarts.printPropertyAStudents(HarryPotter, DracoMalfoy);
    }
}
