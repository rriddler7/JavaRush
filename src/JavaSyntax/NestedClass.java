package JavaSyntax;

import java.util.ArrayList;

//Вложенные классы Nested classes бывают статическими и нестатическими

//Статический вложенный (static nested class)
//Статические вложенные классы можно использовать вне своего родительского класса.
//Если у такого класса стоит модификатор доступа public,
//его можно использовать в любом месте программы.

//public class NestedClass {
//    static ArrayList<Point> points = new ArrayList<Point>();
//
//    public static void main(String[] args)
//    {
//        Point point = new Point();
//        point.x = 100;
//        point.y = 200;
//        points.add(point);
//    }
//
//    static class Point
//    {
//        int x;
//        int y;
//    }
//}

//Утильный калькулятор
//Давай проведем рефакторинг кода: вынесем отдельно утильные методы.
//Для этого создай внутренний статический (вложенный) класс Calculator
//и перенеси в него методы add, subtract, multiply и divide.
//Не забудь подкорректировать их вызовы.
//public class NestedClass {
//    public static final String EQUAL = " = ";
//
//    public static void main(String[] args) {
//        int a = 69;
//        int b = 31;
//        Calculator.add(a, b);
//        Calculator.subtract(a, b);
//        Calculator.multiply(a, b);
//        Calculator.divide(a, b);
//    }
//
//    public static class Calculator {
//
//        public static void add(int a, int b) {
//            System.out.println(a + " + " + b + EQUAL + (a + b));
//        }
//
//        public static void subtract(int a, int b) {
//            System.out.println(a + " - " + b + EQUAL + (a - b));
//        }
//
//        public static void multiply(int a, int b) {
//            System.out.println(a + " * " + b + EQUAL + (a * b));
//        }
//
//        public static void divide(int a, int b) {
//            System.out.println(a + " / " + b + EQUAL + (a / b));
//        }
//    }
//}

//Главное отличие вложенного статического класса от обычного класса.
//Методы вложенного статического класса имеют доступ ко всем
//статическим переменным и методам своего класса родителя, даже если те объявлены private.
//public class NestedClass
//{
//    private static ArrayList<Point> points;
//
//    static class Point
//    {
//        int x;
//        int y;
//
//        public static void main(String[] args)
//        {
//            Point point = new Point();
//            point.x = 100;
//            point.y = 200;
//
//            // будет работать
//            points = new ArrayList<Point>();
//            points.add(point);
//        }
//    }
//}

//Нестатические просто называют внутренними классами (inner class)
//Двигатель — сердце автомобиля
//Двигатель — сложный механизм, для описания которого недостаточно обычной переменной.
//В классе Car создай внутренний класс (inner class) Engine.
//В классе Engine создай boolean поле isRunning, которое принимает значение true,
//если двигатель запущен, и false в противном случае.
//public class NestedClass {
//    private Engine engine;
//
//    class Engine{
//        private boolean isRunning;
//
//        public void start() {
//            isRunning = true;
//        }
//
//        public void stop() {
//            isRunning = false;
//        }
//    }
//}

//Объекты внутренних и вложенных классов
//В классе Outer есть внутренний (Inner) и вложенный (Nested) классы.
//В методе main класса Solution создай по одному объекту каждого из них.
class Outer {
    class Inner {
        Inner() {
            System.out.println("Создание объекта внутреннего класса");
        }
    }
    static class Nested {
        Nested() {
            System.out.println("Создание объекта вложенного класса");
        }
    }
}

public class NestedClass {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        Outer.Nested nested = new Outer.Nested();
    }
}
