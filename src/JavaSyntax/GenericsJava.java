package JavaSyntax;

//Все классы в Java неявно (скрытно) унаследованы от класса Object.

//Под дженериками в Java подразумевают возможность добавлять к типам
//типы-параметры: ОсновнойТип<ТипПараметр>

import java.util.ArrayList;
import java.util.HashMap;

//public class GenericsJava {
//    public static int sum(ArrayList<Integer> numbers)
//    {
//        int result = 0;
//
//        for (int i = 0; i < numbers.size(); i++)
//            result = result + numbers.get(i);
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        for (int i = 0; i < 10; i++) {
//            numbers.add(i);
//        }
//
//        System.out.println(sum(numbers));
//    }
//}

//Дженерики и студенты
//В классе Faculty есть метод printStudentNames(ArrayList),
//который принимает список объектов и выводит их имена.
//Но на данный момент программа не компилируется.
//Твоя задача исправить этот баг.
//Для этого нужно исправить сигнатуру метода printStudentNames,
//чтобы он принимал список объектов только типа Student (используй дженерик).
//class Student {
//    private String name;
//
//    public Student(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//}
//
//public class GenericsJava {
//    public static void main(String[] args) {
//        ArrayList<Student> students = new ArrayList<Student>();
//        students.add(new Student("Акакий"));
//        students.add(new Student("Любослав"));
//
//        printStudentNames(students);
//    }
//
//    public static void printStudentNames(ArrayList<Student> students) {
//        for (int i = 0; i < students.size(); i++) {
//            System.out.println(students.get(i).getName());
//        }
//    }
//}

//Выводим в консоли разные типы
//В классе Solution есть метод printAnything(ArrayList),
//который должен принимать список и выводить его содержимое в консоли.
//Сейчас на вход принимается только список строк.
//Твоя задача исправить метод так,
//чтобы принимался список с любыми типами данных
//public class GenericsJava {
//    public static void printAnything(ArrayList arrayList) {
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
//    }
//
//    public static void main(String[] args) {
//        var arrayList = new ArrayList<>();
//        arrayList.add(15);
//        arrayList.add("Hello");
//        arrayList.add(154);
//        arrayList.add("string");
//
//        printAnything(arrayList);
//    }
//}

//У классов может быть не один тип параметр, а несколько:
//ОсновнойТип<ТипПараметр1, ТипПараметр2, ТипПараметр3>
//public class GenericsJava {
//    public static void main(String[] args) {
//        HashMap<Integer, String> map = new HashMap<Integer, String>(); //первый параметр метода put имеет тип Integer, второй — тип String
//        map.put(7, "Привет");
//        map.put(-15, "Привет");
//        System.out.println(map);
//    }
//}

//Сложные типы тоже можно использовать в качестве параметров:
//ОсновнойТип<ТипПараметр<ТипПараметрПараметра>>
//К примеру, создание списка, который будет хранить списки строк
public class GenericsJava {
    public static void main(String[] args) {
    // список приветствий
        ArrayList<String> listHello = new ArrayList<String>();
        listHello.add("Привет");
        listHello.add("Hi");

    // список прощаний
        ArrayList<String> listBye = new ArrayList<String>();
        listBye.add("Пока");
        listBye.add("Good Bye");

    // список списков
        ArrayList<ArrayList<String>> lists = new ArrayList<ArrayList<String>>();
        lists.add(listHello);
        lists.add(listBye);
        System.out.println(lists);
    }
}

//Так же сложные типы (типы с параметрами) можно использовать в качестве типов массивов:
//ОсновнойТип<ТипПараметр>[] array = new ОсновнойТип<ТипПараметр>[длина]
//Пример: ArrayList<String>[] list = new ArrayList<String>[10];
//ArrayList<Scanner>[] list = new ArrayList<Scanner>[10];
