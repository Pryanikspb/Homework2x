public class Main {

    public static void main(String[] args) {
        GryffindorStudent harry = new GryffindorStudent("Гарри Поттер", 80, 65, 70, 80, 90);
        GryffindorStudent ron = new GryffindorStudent("Рональд Уизли", 64, 75, 85, 94, 51);
        GryffindorStudent germione = new GryffindorStudent("Гермиона Грейнджер", 96, 72, 56, 84, 100);
        HufflepuffStudent zahariya = new HufflepuffStudent("Захария Смит", 60, 70, 54, 60, 63);
        HufflepuffStudent sedrick = new HufflepuffStudent("Седрик Диггори", 85, 90, 78, 90, 84);
        HufflepuffStudent justin = new HufflepuffStudent("Джастин Финч-Флетчли", 95, 70, 80, 72, 61);
        RavenclawStudent schjou = new RavenclawStudent("Чжоу Чанг", 60, 73, 84, 54, 55,50);
        RavenclawStudent padma = new RavenclawStudent("Падма Патил", 83, 50, 65, 57, 88, 72);
        RavenclawStudent marcus = new RavenclawStudent("Маркус Белби", 54, 69, 70, 71, 72,73);
        SlytherinStudent drako = new SlytherinStudent("Драко Малфой", 95, 84, 84, 95, 100,75,95);
        SlytherinStudent graham = new SlytherinStudent("Грэхэм Монтегю", 65, 50, 65, 58, 88, 72,60);
        SlytherinStudent gregory = new SlytherinStudent("Грегори Гойл", 50, 50, 51, 52, 53,54,55);


        harry.print();
        ron.print();
        germione.print();
        zahariya.print();
        sedrick.print();
        justin.print();
        schjou.print();
        padma.print();
        marcus.print();
        drako.print();
        graham.print();
        gregory.print();
        harry.compareGryffindorStudent(germione);
        sedrick.compareHufflepuffStudent(justin);
        padma.compareRavenclawStudent(marcus);
        drako.compareSlytherinStudent(graham);
        harry.compareHogwartsStudent(drako);
    }


}