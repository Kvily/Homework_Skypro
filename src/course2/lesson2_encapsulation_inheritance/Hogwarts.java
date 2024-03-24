package course2.lesson2_encapsulation_inheritance;

public class Hogwarts {
    public static void printPropertyAllStudents(HogwartsStudents HarryPotter, Slytherin DracoMalfoy, Hufflepuff CedricDiggory, Ravenclaw ZhouChang) {
        System.out.print("HarryPotter: ");
        System.out.println("Сила магии " + HarryPotter.magic
                + "; Сила трансгрессии " + HarryPotter.transgressions);
        printPropertyStudents((Gryffindor) HarryPotter);
        markingLine();
        System.out.print("DracoMalfoy: ");
        System.out.println("Сила магии " + DracoMalfoy.magic
                + "; Сила трансгрессии " + DracoMalfoy.transgressions);
        printPropertyStudents((Slytherin) DracoMalfoy);
        markingLine();
        System.out.print("CedricDiggory: ");
        System.out.println("Сила магии " + CedricDiggory.magic
                + "; Сила трансгрессии " + CedricDiggory.transgressions);
        printPropertyStudents((Hufflepuff) CedricDiggory);
        markingLine();
        System.out.print("ZhouChang: ");
        System.out.println("Сила магии " + ZhouChang.magic
                + "; Сила трансгрессии " + ZhouChang.transgressions);
        printPropertyStudents((Ravenclaw) ZhouChang);
        markingLine();
    }

    public static void printPropertyStudents(Gryffindor HarryPotter) {
        System.out.print("HarryPotter: ");
        System.out.println("Благородство " + HarryPotter.getNobility()
                + "; Честь " + HarryPotter.getHonor()
                + "; Храбрость " + HarryPotter.getBravery());
    }

    public static void printPropertyStudents(Slytherin DracoMalfoy) {
        System.out.print("DracoMalfoy: ");
        System.out.println("Хитрость " + DracoMalfoy.getCunning()
                + "; Решительность  " + DracoMalfoy.getDetermination()
                + "; Амбициозность " + DracoMalfoy.getAmbition()
                + "; Находчивость " + DracoMalfoy.getResourcefulness());
    }

    public static void printPropertyStudents(Hufflepuff CedricDiggory) {
        System.out.print("CedricDiggory: ");
        System.out.println("Трудолюбиые " + CedricDiggory.getHardworking()
                + "; Верность " + CedricDiggory.getLoyalty()
                + "; Честность " + CedricDiggory.getHonesty());
    }

    public static void printPropertyStudents(Ravenclaw ZhouChang) {
        System.out.print("ZhouChang: ");
        System.out.println("Ум " + ZhouChang.getIntelligence()
                + "; Мудрость " + ZhouChang.getWisdom()
                + "; Остроумие " + ZhouChang.getWit()
                + "; Творчество " + ZhouChang.getCreativity()
        );
    }

    public static void comparePropertyStudentsGryffindor(Gryffindor HermioneGranger, Gryffindor RonWeasley) {
        int sumScoresOne = HermioneGranger.getBravery()
                + HermioneGranger.getHonor()
                + HermioneGranger.getNobility();
        int sumScoresTwo = RonWeasley.getBravery()
                + RonWeasley.getHonor()
                + RonWeasley.getNobility();

        System.out.println("HermioneGranger " + sumScoresOne);
        System.out.println("RonWeasley " + sumScoresTwo);
        markingLine();
        if (sumScoresOne > sumScoresTwo) {
            System.out.println("HermioneGranger"
                    + " лучший Гриффиндорец, чем "
                    + "RonWeasley");
        } else {
            System.out.println("RonWeasley"
                    + " лучший Гриффиндорец, чем "
                    + "HermioneGranger");
        }
        markingLine();
    }

    public static void comparePropertyStudentsSlytherin(Slytherin DracoMalfoy, Slytherin GrahamMontague) {
        int sumScoresOne = DracoMalfoy.getAmbition()
                + DracoMalfoy.getAuthority()
                + DracoMalfoy.getCunning();
        int sumScoresTwo = GrahamMontague.getAmbition()
                + GrahamMontague.getAuthority()
                + GrahamMontague.getCunning();

        System.out.println("DracoMalfoy " + sumScoresOne);
        System.out.println("GrahamMontague " + sumScoresTwo);

        markingLine();
        if (sumScoresOne > sumScoresTwo) {
            System.out.println("DracoMalfoy"
                    + " лучший Слизеринец, чем "
                    + "GrahamMontague");
        } else {
            System.out.println("GrahamMontague"
                    + " лучший Слизеринец, чем "
                    + "DracoMalfoy");
        }
        markingLine();
    }

    public static void comparePropertyStudentsRavenclaw(Ravenclaw ZhouChang, Ravenclaw PadmaPatil) {
        int sumScoresOne = ZhouChang.getIntelligence()
                + ZhouChang.getWit() + ZhouChang.getWisdom()
                + ZhouChang.getCreativity();
        int sumScoresTwo = PadmaPatil.getIntelligence()
                + PadmaPatil.getWit() + PadmaPatil.getWisdom()
                + PadmaPatil.getCreativity();

        System.out.println("ZhouChang " + sumScoresOne);
        System.out.println("PadmaPatil " + sumScoresTwo);

        markingLine();
        if (sumScoresOne > sumScoresTwo) {
            System.out.println("ZhouChang"
                    + " лучший Когтевранец, чем "
                    + "PadmaPatil");
        } else {
            System.out.println("PadmaPatil"
                    + " лучший Когтевранец, чем "
                    + "ZhouChang");
        }
        markingLine();
    }

    public static void comparePropertyStudentsHufflepuff(Hufflepuff CedricDiggory, Hufflepuff ZachariahSmith) {
        int sumScoresOne = CedricDiggory.getHardworking()
                + CedricDiggory.getLoyalty()
                + CedricDiggory.getHonesty();
        int sumScoresTwo = ZachariahSmith.getHardworking()
                + ZachariahSmith.getLoyalty()
                + ZachariahSmith.getHonesty();

        System.out.println("CedricDiggory " + sumScoresOne);
        System.out.println("ZachariahSmith " + sumScoresTwo);

        markingLine();
        if (sumScoresOne > sumScoresTwo) {
            System.out.println("CedricDiggory"
                    + " лучший Пуффендуец, чем "
                    + "ZachariahSmith");
        } else {
            System.out.println("ZachariahSmith"
                    + " лучший Пуффендуец, чем "
                    + "CedricDiggory");
        }
        markingLine();
    }

    public static void printPropertyAStudents(HogwartsStudents HarryPotter, Slytherin DracoMalfoy) {
        System.out.print("HarryPotter: ");
        System.out.println("Сила магии " + HarryPotter.magic
                + "; Сила трансгрессии " + HarryPotter.transgressions);
        System.out.print("DracoMalfoy: ");
        System.out.println("Сила магии " + DracoMalfoy.magic
                + "; Сила трансгрессии " + DracoMalfoy.transgressions);
        int sumScoresOne = HarryPotter.magic
                + HarryPotter.transgressions;
        int sumScoresTwo = DracoMalfoy.magic
                + DracoMalfoy.transgressions;
        System.out.println("HarryPotter " + sumScoresOne);
        System.out.println("DracoMalfoy " + sumScoresTwo);
        markingLine();
        if (sumScoresOne > sumScoresTwo) {
            System.out.println("HarryPotter"
                    + " обладает большей мощностью магии, чем  "
                    + "DracoMalfoy");
        } else {
            System.out.println("DracoMalfoy"
                    + " обладает большей мощностью магии, чем  "
                    + "HarryPotter");
        }
        markingLine();
    }

    public static void markingLine() {
        System.out.println("--------------------------------------------------------------------");
    }

}
