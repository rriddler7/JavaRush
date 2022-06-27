package JavaSyntax;

import java.util.ArrayList;
import java.util.Arrays;

//Array + List.
//Array — это массив, а List — список.
//Внутри каждого объекта типа ArrayList хранится обычный массив элементов.
//Когда вы считываете элементы из ArrayList, он считывает их со своего внутреннего массива.
//Когда записываете — записывает их во внутренний массив.
//Изначально длина массива внутри списка — 10 элементов. А переменная size равна 0.
//Внутри каждого объекта ArrayList есть два поля:
//    Массив со списком элементов
//    Переменная size, которая хранит количество элементов списка
//Если при добавлении очередного элемента в список в массиве уже нет места, в методе add() происходит следующее:
//    создается новый массив в полтора раза длиннее предыдущего
//    в него копируются все элементы из существующего массива
//    в объекте ArrayList вместо старого массива сохраняется ссылка на новый.
//    В 10-ю ячейку нового массива записывается переданный элемент
//    size увеличивается на 1 и теперь будет равняться 11
//Аналогично при добавлении (вставке) элемента в середину списка.
//Существующие элементы сдвигаются на 1 вправо,
//и в свободную ячейку массива записывается нужный элемент.

//Бухгалтерия
//В классе Solution есть список сотрудников
//waitingEmployees, которые ждут зарплату, и список сотрудников
//alreadyGotSalaryEmployees, которые её уже получили.
//Необходимо реализовать метод paySalary(String),
//который в качестве аргумента принимает имя сотрудника,
//желающего получить зарплату.
//public class ClassArrayList {
//    public static ArrayList<String> waitingEmployees = new ArrayList<String>();
//    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<String>();
//
//    public static void initEmployees() {
//        waitingEmployees.add("Гвинно");
//        waitingEmployees.add("Гунигерд");
//        waitingEmployees.add("Боргелейф");
//        waitingEmployees.add("Нифрод");
//        waitingEmployees.add("Альбиуф");
//        waitingEmployees.add("Иногрим");
//        waitingEmployees.add("Фриле");
//    }
//
//    public static void main(String[] args) {
//        initEmployees();
//    }
//
//    public static void paySalary(String name) {
//        if (waitingEmployees.contains(name) && !alreadyGotSalaryEmployees.contains(name)) {
//            alreadyGotSalaryEmployees.add(name);
//            for (int i = 0; i < waitingEmployees.size(); i++) {
//                if (waitingEmployees.get(i) != null && waitingEmployees.get(i).equals(name)) {
//                    waitingEmployees.set(i, null);
//                    break;
//                }
//            }
//        }
//    }
//}

//Переворачивание данных
//Ты видишь рабочую программу, в которой массив int[] numbers заполняется числами в методе init().
//Затем в методе reverse() происходит перестановка чисел в обратном порядке.
//Твоя задача — переписать код так, чтобы вместо массива int[] numbers использовался список ArrayList<Integer> numbers.
//public class ClassArrayList {
//    public static ArrayList<Integer> numbers = new ArrayList<Integer>();
//
//    public static void main(String[] args) {
//        init();
//        print();
//
//        reverse();
//        print();
//    }
//
//    public static void init() {
//        for (int i = 0; i < 10; i++) {
//            numbers.add(i);
//        }
//    }
//
//    public static void reverse() {
//        int n = numbers.size() - 1;
//        for (int i = 0; i < numbers.size() / 2; i++) {
//            int temp = numbers.get(i);
//            numbers.set(i, numbers.get(n - i));
//            numbers.set(n - i, temp);
//        }
//    }
//
//    private static void print() {
//        for (int number : numbers) {
//            System.out.println(number);
//        }
//    }
//}

//Сортировка пузырьком
//Перед тобой программа, которая сортирует элементы списка по возрастанию методом "пузырька".
//Перепиши код, чтобы вместо списка ArrayList<Integer> numbers использовался массив int[] numbers.
//public class ClassArrayList {
//
//    public static int[] numbers = {56, 45, 89, 1, 45, 13, 4, 69, 11, -89};
//
//    public static void main(String[] args) {
//        print();
//        sort();
//        System.out.println("\nОтсортированные числа в натуральном порядке:");
//        print();
//    }
//
//    public static void sort() {
//        for (int i = 0; i < numbers.length - 1; i++) {
//            for (int j = 0; j < numbers.length - i - 1; j++) {
//                if (numbers[j] > numbers[j + 1]) {
//                    int temp = numbers[j];
//                    numbers[j] = numbers[j + 1];
//                    numbers[j + 1] = temp;
//                }
//            }
//        }
//    }
//
//    public static void print() {
//        for (int number : numbers) {
//            System.out.print(number + "\t");
//        }
//    }
//}

//Создаем свой список
//ArrayList — это список, который хранит динамически расширяемый массив элементов.
//Сейчас мы будем реализовывать свою версию списка, в котором хранятся строки.
//class CustomStringArrayList {
//
//    private int size;
//    private int capacity;
//    private String[] elements;
//
//    public CustomStringArrayList() {
//        capacity = 10;
//        size = 0;
//        elements = new String[capacity];
//    }
//
//    public void add(String element) {
//        if (size == capacity) {
//            grow();
//        }
//        elements[size] = element;
//        size++;
//    }
//
//    private void grow() {
//        capacity = (int) (capacity *  1.5);
//        String[] newElements = new String[capacity];
//        for (int i = 0; i < elements.length; i++) {
//            newElements[i] = elements[i];
//        }
//        elements = newElements;
//    }
//
//}
//
//public class ClassArrayList {
//
//    public static void main(String[] args) {
//        CustomStringArrayList arrayList = new CustomStringArrayList();
//        for(int i = 0; i < 25; i++) {
//            arrayList.add("count" + i);
//        }
//    }
//}

//Вставка элемента в середину (или в начало) списка
//Солнечная система
//В 3020 году ученые научились выращивать новые планеты,
//одну из которых отправили в космос на орбиту Солнца.
//Эта планета находится между Землей и Марсом.
//Реализуй метод createNewPlanet(String),
//который должен добавлять переданную планету в список planets сразу после Земли
//public class ClassArrayList {
//    public static ArrayList<String> planets = new ArrayList<String>();
//
//    public static void main(String[] args) {
//        addPlanets();
//        print();
//        createNewPlanet("Звезда Смерти");
//        print();
//    }
//
//    public static void createNewPlanet(String planetName) {
//        planets.add(planets.indexOf("Земля") + 1, planetName);
//    }
//
//    public static void addPlanets() {
//        planets.add("Меркурий");
//        planets.add("Венера");
//        planets.add("Земля");
//        planets.add("Марс");
//        planets.add("Юпитер");
//        planets.add("Сатурн");
//        planets.add("Уран");
//        planets.add("Нептун");
//    }
//
//    public static void print() {
//        for (int i = 0; i < planets.size(); i++) {
//            System.out.println(String.format("%s — %d-я планета от Солнца", planets.get(i), (i + 1)));
//        }
//        System.out.println();
//    }
//}

//Удаление элемента из списка
//Прощай, Паскаль
//В методе main найди и удали язык программирования Pascal из списка programmingLanguages.
//public class ClassArrayList {
//    public static ArrayList<String> programmingLanguages = new ArrayList<String>(Arrays.asList("C", "C++", "Python", "Java", "Pascal", "JavaScript", "Ruby"));
//
//    public static void main(String[] args) {
//
//        int n = programmingLanguages.indexOf("Pascal");
//        programmingLanguages.remove(n);
//        System.out.println(programmingLanguages);
//    }
//}

//Разбираем пирамиду бокалов
//Задача простая: нужно разобрать пирамиду из бокалов,
//в чем нам поможет метод removeGlassesReverse.
//Этот метод должен снимать каждый ряд, начиная сверху (с конца списка).
public class ClassArrayList {

    private static ArrayList<String> initList() {
        String glassTop     = "       🍷       ";
        String glassSecond  = "      🍷🍷      ";
        String glassThird   = "     🍷🍷🍷     ";
        String glassFourth  = "    🍷🍷🍷🍷    ";
        String glassFifth   = "   🍷🍷🍷🍷🍷   ";
        String glassSixth   = "  🍷🍷🍷🍷🍷🍷  ";
        String glassSeventh = " 🍷🍷🍷🍷🍷🍷🍷 ";
        String glassEighth  = "🍷🍷🍷🍷🍷🍷🍷🍷";
        ArrayList<String> list = new ArrayList<String>();
        list.add(glassEighth);
        list.add(glassSeventh);
        list.add(glassSixth);
        list.add(glassFifth);
        list.add(glassFourth);
        list.add(glassThird);
        list.add(glassSecond);
        list.add(glassTop);
        return list;
    }

    public static void print(ArrayList<String> glasses) {
        for(int i = glasses.size() - 1; i >= 0; i--) {
            System.out.println(glasses.get(i));
        }
    }

    public static void removeGlassesReverse(ArrayList<String> glasses) {
        System.out.println("Начинаем разбирать пирамиду...");

        for (int i = glasses.size() - 1; i >= 0; i--) {
            glasses.remove(i);
        }

        if(glasses.size() == 0) {
            System.out.println("Пирамида разобрана!");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> glasses = initList();
        print(glasses);

        removeGlassesReverse(glasses);
        print(glasses);
    }
}