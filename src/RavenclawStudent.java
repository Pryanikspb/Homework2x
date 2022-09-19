public class RavenclawStudent extends HogwartsStudent{

    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public RavenclawStudent(String name, int spellPower, int transgression, int mind, int wisdom, int wit, int creativity) {
        super(name, spellPower, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    private int abilitySum() {
        return mind + wisdom + wit + creativity;
    }

    public void compareRavenclawStudent(RavenclawStudent ravenclawStudent) {
        int abilitySum1 = this.abilitySum();
        int abilitySum2 = ravenclawStudent.abilitySum();
        if (abilitySum1 > abilitySum2) {
            System.out.printf("Когтевранец %s лучше когтевранца %s. Сумма его характеристик %s выше %s у соперника.", getName(), ravenclawStudent.getName(), abilitySum1, abilitySum2);
        } else if (abilitySum2 > abilitySum1) {
            System.out.printf("Когтевранец %s лучше когтевранца %s. Сумма его характеристик %s выше %s у соперника.", ravenclawStudent.getName(), getName(), abilitySum2, abilitySum1);
        } else {
            System.out.printf("Когтевранцы %s и %s равны. Но некоторые равнее других. Их характеристики %s и %s.", getName(), ravenclawStudent.getName(), abilitySum1, abilitySum2);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return String.format("Когтевранец %s, ум %s, мудрость %s, остроумие %s, творчество %s", super.toString(), mind, wisdom, wit, creativity);
    }
}
