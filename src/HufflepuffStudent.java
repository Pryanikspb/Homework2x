public class HufflepuffStudent extends HogwartsStudent{

    private int diligence;
    private int loyalty;
    private int honesty;

    public HufflepuffStudent(String name, int spellPower, int transgression, int diligence, int loyalty, int honesty) {
        super(name, spellPower, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    private int abilitySum() {
        return diligence + loyalty + honesty;
    }

    public void compareHufflepuffStudent(HufflepuffStudent hufflepuffStudent) {
        int abilitySum1 = this.abilitySum();
        int abilitySum2 = hufflepuffStudent.abilitySum();
        if (abilitySum1 > abilitySum2) {
            System.out.printf("Пуффендуец %s лучше пуффендуйца %s. Сумма его характеристик %s выше %s у соперника.", getName(), hufflepuffStudent.getName(), abilitySum1, abilitySum2);
        } else if (abilitySum2 > abilitySum1) {
            System.out.printf("Пуффендуец %s лучше пуффендуйца %s. Сумма его характеристик %s выше %s у соперника.", hufflepuffStudent.getName(), getName(), abilitySum2, abilitySum1);
        } else {
            System.out.printf("Пуффендуйцы %s и %s равны. Но некоторые равнее других. Их характеристики %s и %s.", getName(), hufflepuffStudent.getName(), abilitySum1, abilitySum2);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return String.format("Пуффендуец %s, трудолюбие %s, верность %s, честность %s", super.toString(), diligence, loyalty, honesty);
    }

}
