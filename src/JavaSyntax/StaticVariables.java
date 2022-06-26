package JavaSyntax;

//Статическая (static) переменная привязана к
//статическому объекту класса
//и всегда существует в единственном экземпляре.

//Солнечная система — наш дом
//Программа выводит на экран основные факты о Солнечной системе.
//Перепиши код так, чтобы в выводе использовались все переменные класса SolarSystem,
//но результат работы программы при этом не изменился.
class SolarSystem {
//  Объявление и инициализация статической переменной
    public static long age = 4568200000L;
    public static int planetsCount = 8;
    public static int starsCount = 1;
    public static String starName = "Солнце";
    public static int galacticCenterDistance = 27170;

//  Объявление статических переменных
//  и их инициализация в статическом блоке инициализации
//    public static long age;
//    public static int planetsCount;
//    public static int starsCount;
//    public static String starName;
//    public static int galacticCenterDistance = 27170;
//
//    static {
//        age = 4568200000L;
//        starsCount = 1;
//        starName = "Солнце";
//        galacticCenterDistance = 27170;
//    }
}

//public class StaticVariables {
////    private static long age = 4568200000L; //Переменная private, вне класса не видна
////    private static int planetsCount = 8;
////    private static int starsCount = 1;
////    private static String starName = "Солнце";
////    private static int galacticCenterDistance = 27170;
//
//    public static void main(String[] args) {
//        System.out.println("Человечество живет в Солнечной системе.");
//        System.out.println("Ее возраст около " + SolarSystem.age + " лет.");
//        System.out.println("В Солнечной системе " + SolarSystem.planetsCount + " известных планет.");
//        System.out.println("Как и большинство звездных систем, состоит из " + SolarSystem.starsCount + " звезды.");
//        System.out.println("Звезды по имени " + SolarSystem.starName + ".");
//        System.out.println("Расстояние к центру галактики составляет " + SolarSystem.galacticCenterDistance + " световых лет.");
//        System.out.println("Каждый обитатель Солнечной системы должен знать эту информацию!");
//    }
//}


//Нестатические переменные
//привязаны к объектам своего класса (экземплярам класса),
//статические переменные — к статическому объекту класса.
//Обращаться к обычным переменным класса (полям класса)
//можно только имея ссылку на объект класса.
//А также в методах внутри этого же класса.
//class DataInfo
//{
////    public int value = 100;
//    public static int value = 100; //статическое поле класса
//}
//
//public class StaticVariables {
//    public static void main(String[] args)
//    {
////    Обращение к полю класса с использованием ссылки на объект класса
////        DataInfo info = new DataInfo();
////        System.out.println(info.value);
//
////    Обращение к статическому полю класса не используя ссылку на объект класса
//        System.out.println(DataInfo.value);
//    }
//}

/*
Земля: техническая характеристика
*/
//Сделай все переменные класса Planet не статическими.
//После этого внеси необходимые правки в метод main.
//class Planet {
//    public String name;
//    public long age;
//    public int speed;
//    public int area;
//
//    public void printInformation() {
//        System.out.println("Человечество живет на планете " + name + ".");
//        System.out.println("Ее возраст около " + age + " лет.");
//        System.out.println("Земля вращается вокруг Солнца со скоростью " + speed + "км/ч.");
//        System.out.println("Площадь поверхности Земли составляет " + area + " квадратных километров.");
//    }
//}
//
//public class StaticVariables {
//
//    public static void main(String[] args) {
//        Planet earth = new Planet();
//        earth.name = "Земля";
//        earth.age = 4540000000L;
//        earth.speed = 170218;
//        earth.area = 510072000;
//        earth.printInformation();
//    }
//}

//Презентация роботов
//В методе main создается 5 роботов и выводится информация о них.
//Убери максимально возможное количество модификаторов static так,
//чтобы функционал программы не изменился.

class Robot {
    public static int robotCounter;

    public int id;

    public String model;

    public int productionYear;

    public static String vendor = "Javarush Co.";

    public Robot(String model, int productionYear) {
        this.model = model;
        this.productionYear = productionYear;
        this.id = ++robotCounter;
    }

    public void displayInformation() {
        System.out.printf("Я %d-й из %d роботов. Модель: %s. Произведен компанией %s в %d году.\n",
                id, robotCounter, model, vendor, productionYear);
    }
}

public class StaticVariables {
    public static void main(String[] args) {
        System.out.println("Презентация роботов произведенных компанией " + Robot.vendor);

        Robot robot1 = new Robot("RCV-322", 2019);
        robot1.displayInformation();

        Robot robot2 = new Robot("JavaTron-008", 2017);
        robot2.displayInformation();

        Robot robot3 = new Robot("BugDestroyer-007", 1998);
        robot3.displayInformation();

        Robot robot4 = new Robot("Gundam-14", 2004);
        robot4.displayInformation();

        Robot robot5 = new Robot("Eve-2", 2012);
        robot5.displayInformation();
    }
}
