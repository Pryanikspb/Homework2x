public class SlytherinStudent extends HogwartsStudent{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness ;
    private int thist;

    public SlytherinStudent(String name, int spellPower, int transgression, int cunning, int determination, int ambition, int resourcefulness, int thist) {
        super(name, spellPower, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thist = thist;
    }

    private int abilitySum() {
        return cunning + determination + ambition + resourcefulness + thist;
    }

    public void compareSlytherinStudent(SlytherinStudent slytherinStudent) {
        int abilitySum1 = this.abilitySum();
        int abilitySum2 = slytherinStudent.abilitySum();
        if (abilitySum1 > abilitySum2) {
            System.out.printf("Слизеринец %s лучше слизеринца %s. Сумма его характеристик %s выше %s у соперника.", getName(), slytherinStudent.getName(), abilitySum1, abilitySum2);
        } else if (abilitySum2 > abilitySum1) {
            System.out.printf("Слизеринец %s лучше слизеринца %s. Сумма его характеристик %s выше %s у соперника.", slytherinStudent.getName(), getName(), abilitySum2, abilitySum1);
        } else {
            System.out.printf("Слизеринцы %s и %s равны. Но некоторые равнее других. Их характеристики %s и %s.", getName(), slytherinStudent.getName(), abilitySum1, abilitySum2);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return String.format("Слизеринец %s, хитрость %s, решительность %s, амбициозность %s, находчивость %s, жажда власти %s", super.toString(), cunning, determination, ambition, resourcefulness, thist);
    }
}
