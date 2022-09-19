public abstract class HogwartsStudent {

    private String name;
    private int spellPower;
    private int transgression;

    private int abilitySum () {
        return spellPower + transgression;
    }

    public void compareHogwartsStudent(HogwartsStudent hogwartsStudent) {
        int abilitySum1 = this.abilitySum();
        int abilitySum2 = hogwartsStudent.abilitySum();
        if (abilitySum1 > abilitySum2) {
            System.out.printf("Студент %s лучше студента %s. Сумма его характеристик %s выше %s у соперника.", getName(), hogwartsStudent.getName(), abilitySum1, abilitySum2);
        } else if (abilitySum2 > abilitySum1) {
            System.out.printf("Студент %s лучше студента %s. Сумма его характеристик %s выше %s у соперника.", hogwartsStudent.getName(), getName(), abilitySum2, abilitySum1);
        } else {
            System.out.printf("Студенты %s и %s равны. Но некоторые равнее других. Их характеристики %s и %s", getName(), hogwartsStudent.getName(), abilitySum1, abilitySum2);
        }
        System.out.println();
    }

    public void print() {
        System.out.println(toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public HogwartsStudent(String name, int spellPower, int transgression) {
        this.name = name;
        this.spellPower = spellPower;
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return String.format("Студент %s, сила магии %s, дальность трансгрессии %s", name, spellPower, transgression);
    }

}
