import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* System.out.println("привет Ванечек!");
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
        frog = frog * 10.0;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4.0;
        System.out.println(frog);

        var weight1 = 78.2;
        var weight2 = 82.7;
        var different = weight2 - weight1;
        System.out.println("разница " + different + " килограмма!");

        var different1 = weight2 % weight1;
        System.out.println("разница через остаток от деления " + different1);

        var allTime = 640;
        var timeFor1Person = 8;
        var allPeople = allTime / timeFor1Person;
        System.out.println("Всего работников в комании " + allPeople + " человек");

        var ifPeopleMore = 94;
        allPeople = allPeople + ifPeopleMore;
        System.out.println("Теперь в компании работают " + allPeople + " человека");
        var newTime = timeFor1Person * allPeople;
        System.out.println("Если в компании работают " +allPeople + " человек, то всего " + newTime + " часов работы может быть поделено между сотрудниками");

        byte catFat = 2;
        System.out.println(catFat);
        short fatDog = 3;
        System.out.println(fatDog);
        int fatPerson = 11;
        System.out.println(fatPerson);
        long road = 12L;
        System.out.println(road);
        float city = 12f;
        System.out.println(city);
        double alesha = 12.0;
        System.out.println(alesha);

        float drone = 27.12f;
        long bus = 987678965549L;
        float run = 2.786f;
        short boy = 569;
        short girl = -159;
        short sema = 27897;
        byte artem = 67;

        short allPapers = 480;
        byte lyudmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAnfreevna = 30;

        int papersForOnePerson = allPapers / (lyudmilaPavlovna + annaSergeevna + ekaterinaAnfreevna);
        System.out.println("на одного ученика рассчитано " + papersForOnePerson + " листов бумаги!");

        byte makes_Bottles_In_2Minutes = 16;
        int makes_Bottles_In_1Minutes = makes_Bottles_In_2Minutes / 2;
        System.out.println(makes_Bottles_In_1Minutes + " бутылок делает машина в 1 минуту");
        int makes_Bottles_In_20Minutes = makes_Bottles_In_1Minutes * 20;
        System.out.println(makes_Bottles_In_20Minutes + " бутылок делает машина в 20 минут");
        int minutesInOneDay = 60 * 24;
        int makes_Bottles_In_OneDay = makes_Bottles_In_1Minutes * minutesInOneDay;
        System.out.println(makes_Bottles_In_OneDay + " бутылок делает машина за 1 день");
        int makes_Bottles_In_ThreeDays = (minutesInOneDay * 3) * makes_Bottles_In_1Minutes;
        System.out.println(makes_Bottles_In_ThreeDays + " бутылок делает машина за 3 дня");
        int makes_Bottles_In_OneMonth = (minutesInOneDay * 30) * makes_Bottles_In_1Minutes;
        System.out.println(makes_Bottles_In_OneMonth + " бутылок делает машина за месяц с учетом непрерывной работы");

        byte needTins = 120;
        int needTinsOfWhiteColorFOr1Class = 2;
        int needTinsOfBrownColorFor1Class = 4;
        int allClasses = needTins / (needTinsOfBrownColorFor1Class + needTinsOfWhiteColorFOr1Class);
        System.out.println("всего в школе " + allClasses + " классов");
        int purchasedTinsOfWhite = needTinsOfWhiteColorFOr1Class * allClasses;
        System.out.println("всего было куплено " + purchasedTinsOfWhite + " банок белой краски");
        int purchasedTinsOfBrown = allClasses * needTinsOfBrownColorFor1Class;
        System.out.println("было куплено " + purchasedTinsOfBrown + " банок коричневой краски");

        int allBananas = 5;
        int weightOfOneBanana = 80;
        int allMilk = 200;
        int weightOfMilk100Ml = 105;
        int allIceCreams = 2;
        int weightOfOnePieceOfIceCream = 100;
        int allEggs = 4;
        int weightOfOneEgg = 70;
        int full_Weight_Of_Breakfast = (allBananas * weightOfOneBanana) + ((allMilk / 100) * weightOfMilk100Ml) + (weightOfOnePieceOfIceCream * allIceCreams) + (allEggs * weightOfOneEgg);
        System.out.println(full_Weight_Of_Breakfast + " полный вес завтрака в граммах");
        float gramInOneKilo = 1000.0f;
        float weightOfBreakfastInKilograms = full_Weight_Of_Breakfast / gramInOneKilo;
        System.out.println(weightOfBreakfastInKilograms + " вес завтрака в кг");

        float needToLose = 7.000f;
        float canLoseInOneDay1 = 0.250f;
        float canLoseInOneDay2 = 0.500f;
        float ifHeLoses500InOneDay = needToLose / canLoseInOneDay2;
        System.out.println(ifHeLoses500InOneDay + " дней понадобится для коррекции веса при учете потери в день по 500г");
        float ifHeLoses250InOneDay = needToLose / canLoseInOneDay1;
        System.out.println(ifHeLoses250InOneDay + " дней понадобится для коррекции веса при учете потери в день по 250г ");
        float itTakesIfHeLoses250G = 28f;
        float itTakesIfHeLoses500G = 14f;
        float onAverageHeLoses = (itTakesIfHeLoses250G + itTakesIfHeLoses500G) / 2;
        System.out.println(onAverageHeLoses + " дней в среднем понадобится при потери веса в среднем, чередуя минимум и максимум");

        int mariaGets = 67760;
        int denisGets = 83690;
        int kristinaGets = 76230;

        int risingTenPercentsMaria = ((mariaGets / 100) * 10) + mariaGets;
        System.out.println("получает Мария после повышения " + risingTenPercentsMaria);
        int risingTenPercentsDenis = ((denisGets / 100) * 10) + denisGets;
        System.out.println("Получает Денис после повышения " + risingTenPercentsDenis);
        int risingTenPercentKristina = ((kristinaGets / 100) * 10) + kristinaGets;
        System.out.println("Получает Кристина после повышения " + risingTenPercentKristina);

        int yearsSalaryOfMaria = risingTenPercentsMaria * 12;
        int yearsSalaryOfMariaBefore = mariaGets * 12;
        int differenceBetweenBeforeAfterMaria = yearsSalaryOfMaria - yearsSalaryOfMariaBefore;
        System.out.println("Разница между годовой зарплатой Марии до и после повышения равна " + differenceBetweenBeforeAfterMaria);

        int yearsSalaryOfDenis = risingTenPercentsDenis * 12;
        int yearsSalaryOfDenisBefore = denisGets * 12;
        int differenceBetweenBeforeAfterDenis = yearsSalaryOfDenis - yearsSalaryOfDenisBefore;
        System.out.println("Разница между до и после повышения зарплаты Дениса равна " +differenceBetweenBeforeAfterDenis);

        int yearsSalaryOfKristina = risingTenPercentKristina * 12;
        int yearsSalaryOfKristinaBefore = kristinaGets * 12;
        int differenceBetweenBeforeAfterKristina = yearsSalaryOfKristina - yearsSalaryOfKristinaBefore;
        System.out.println("Разница между до и после повышения зарплаты Кристина равна " + differenceBetweenBeforeAfterKristina);
*/








                                    //  Домашнаяя работа по if - else
        // Задача 1
        Scanner scan = new Scanner(System.in);

        /* System.out.println("Введите ваш возраст: ");
        int age1 = scan.nextInt();

        if (age1 == 0 && age1 < 18) {
            System.out.println("Вы еще не совершеннолетний");
        } else if (age1 < 0) {
            System.out.println("Error");
        } else {
            System.out.println("Вы уже совершеннолетний ");
        }  */


        //Задача 2
        /*System.out.print("Какая сегодня погода? Напишите в градусах. ");
        int temperature = scan.nextInt();

        if (temperature < 4 && temperature >= -50) {
            System.out.println("Холодно. Оденьте шапку");

        } else if (temperature > 60 || temperature < -51) {
            System.out.println("Error");

        } else
            System.out.println("На улице тепло, можно без шапки ");  */


                  //Задача 3
      /*  System.out.println("Вы превышаете скорость? (да-нет) ");
        String speed = scan.nextLine();

        if (speed.equals("Да") || speed.equals("да")) {
            System.out.println("Пора тормознуть");
        } else if (speed.equals("Нет") || speed.equals("нет")) {
            System.out.println("Отлично, переходите к следующему вопросу");
        } else
            System.out.println("Уточните правильность ответа");

        System.out.println("Какая ваша скорость передвижения на данный момент?: ");
        int speedRightNow = scan.nextInt();
        if (speedRightNow > 60) {
            System.out.println("Можно схлопать штраф");
        } else if (speedRightNow < 60 && speedRightNow >= 10) {
            System.out.println("Скорость в пределах нормы");
        } else {
            System.out.println("Пешком быстрее");


        }
           */

        //   Задача 4
        /*System.out.print("Введите ваш возраст: ");
        int age = scan.nextInt();


        if (age >= 2 && age <=6  ) {
            System.out.println("Вам нужно в детский сад");

        } else if (age >= 7 && age <=17) {
            System.out.println("Вам необходимо в школу ");
        } else if (age >= 18 && age <= 24) {
            System.out.println("В универ");
        } else if (age > 24) {
            System.out.println("Ваше место на работе");
        }   */



                //Задача 5
      /*  System.out.println("Возраст ребенка: ");
        int age = scan.nextInt();

        if (age < 5) {
            System.out.println("Ребенок не может кататься на атракционе");
        } else if (age >= 5 && age <= 14) {
            System.out.println("Ребенок допущен на атракцион только в присутствии взрослого");
        } else if (age > 14) {
            System.out.println("Допущен");
        }
               */

                          //Задача 6
        /*int max = 102;
        int sitPlaces = 60;
        int stand = max - sitPlaces;
        System.out.println("Сколько людей по вашим подсчетам на данный момент в вагоне?: ");
        int peopleNow = scan.nextInt();
        int available;

        if (peopleNow > max) {
            System.out.println("Если только на крыше");
        } else if (peopleNow == max) {
            System.out.println("Вагон полон");
        } else if (peopleNow < max && peopleNow >= sitPlaces) {
            available = max - peopleNow;
            System.out.println("Свободных сидячих мест нет. " + available + " мест доступно для продолжения пути стоя");
        } else if (peopleNow < sitPlaces) {
            available = sitPlaces - peopleNow;
            System.out.println("Доступно " + available + " сидений и " + stand + " мест для продолжения пути стоя");
         }    */

                              //Задача 7
        int one = 13;

        int two = 15;

        int three = 10;

        if (two > one && two > three) {
            System.out.println("Самое большое число из представленных " + two);
        } else
            System.out.println("Числа меньше, чем " + two);
        }




    }



