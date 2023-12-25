public class Main {
    public static void main(String[] args) {
        System.out.println("привет Ванечек!");
        System.out.println("Hello world!");

        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789.0;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 3.5;
        System.out.println(cat);
        paper = paper - 3.5;
        System.out.println(paper);

        var friend = 19;
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 3;
        System.out.println(friend);

        var frog = 3.5;
        frog = 3.5 * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var weight1 = 78.2;
        var weight2 = 82.7;
        var different = weight2 - weight1;
        System.out.println("разница " + different + " килограмма!");

        different = weight2 % weight1;
        System.out.println("разница через остаток от деления " + different);

        var allTime = 640;
        var timeFor1Person = 8;
        var allPeople = allTime / timeFor1Person;
        System.out.println("Всего работников в комании " + allPeople + " человек");

        var ifPeopleMore = 94;
        allPeople = allPeople + ifPeopleMore;
        System.out.println("Теперь в компании работают " + allPeople + " человека");
        var newTime = allTime / allPeople;
        System.out.println("Если в компании работают " +allPeople + " человек, то всего " + newTime + " часов работы может быть поделено между сотрудниками");



    }
}
