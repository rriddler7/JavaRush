package JavaSyntax;

import java.util.ArrayList;

//Все классы в Java неявно (скрытно) унаследованы от класса Object.

//Оператор instanceof проверяет,
//является ли переменная имя объектом типа Тип
//public class InstanceofJava {
//    public static void main(String[] args) {
//        Object[] objects = {10, "Привет", 3.14};
//
//        for (int i = 0; i < objects.length; i++)
//        {
//            if (objects[i] instanceof String)
//            {
//                String s = (String) objects[i];
//                System.out.println(s);
//            }
//        }
//    }
//}

//Охотники за привидением: в погоне за типами
//В методе main создается и заполняется список разными объектами
//и передается методу checkElementType(ArrayList).
//Твоя задача — реализовать этот метод, который должен определить тип каждого элемента списка
public class InstanceofJava {

    public static void main(String[] args) {
        ArrayList<Object> elements = new ArrayList<Object>();
        elements.add("Привет");
        elements.add(10);
        elements.add(new Integer[15]);
        elements.add(new LinkageError());

        checkElementsType(elements);
    }

    public static void checkElementsType(ArrayList<Object> elements) {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i) instanceof String) {
                printString();
            } else if (elements.get(i) instanceof Integer) {
                printInteger();
            } else if (elements.get(i) instanceof Integer[]) {
                printIntegerArray();
            } else {
                printUnknown();
            }
        }
    }

    public static void printString() {
        System.out.println("Строка");
    }

    public static void printInteger() {
        System.out.println("Целое число");
    }

    public static void printIntegerArray() {
        System.out.println("Массив целых чисел");
    }

    public static void printUnknown() {
        System.out.println("Другой тип данных");
    }
}
