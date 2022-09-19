public class GryffindorStudent extends HogwartsStudent{

    private int nobility;
    private int honor;
    private int bravery;

    public GryffindorStudent(String name, int spellPower, int transgression, int nobility, int honor, int bravery) {
        super(name, spellPower, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    private int abilitySum() {
        return nobility + honor + bravery;
    }


    public void compareGryffindorStudent(GryffindorStudent griffindorStudent) {
        int abilitySum1 = this.abilitySum();
        int abilitySum2 = griffindorStudent.abilitySum();
        if (abilitySum1 > abilitySum2) {
            System.out.printf("Гриффиндорец %s лучше гриффиндорца %s. Сумма его характеристик %s выше %s у соперника.", getName(), griffindorStudent.getName(), abilitySum1, abilitySum2);
        } else if (abilitySum2 > abilitySum1) {
            System.out.printf("Гриффиндорец %s лучше гриффиндорца %s. Сумма его характеристик %s выше %s у соперника.", griffindorStudent.getName(), getName(), abilitySum2, abilitySum1);
        } else {
            System.out.printf("Гриффиндорцы %s и %s равны. Но некоторые равнее других. Их характеристики %s и %s.", getName(), griffindorStudent.getName(), abilitySum1, abilitySum2);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return String.format("Гриффиндорец %s, благородство %s, честь %s, храбрость %s", super.toString(), nobility, honor, bravery);
    }


}
