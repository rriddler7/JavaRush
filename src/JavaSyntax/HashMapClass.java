package JavaSyntax;

//Класс HashMap является самой популярной коллекцией из всех карт (Map).
//С одной стороны, он очень похож на HashSet и имеет все его методы,
//а с другой — на список (ArrayList), если бы индексами у списка могли быть не числа, а слова.

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//public class HashMapClass {
//    public static void main(String[] args) {
//        HashMap<String, Integer> map = new HashMap<String, Integer>();
//        map.put("Серега", 21);
//        map.put("Николай", 22);
//        map.put("Иван Петрович", 48);
//        map.put("Анюта", null);
//
//        System.out.println(map);
////        Если при добавлении элемента выяснится,
////        что элемент с таким ключом уже есть,
////        старое значение ключа заменится на новое.
//        map.put("Анюта", 13);
//        System.out.println(map);
//    }
//}

//Успеваемость студентов
//В классе Solution объявлено поле grades типа HashMap,
//где ключ — имя и фамилия студента, а значение - его средняя оценка.
//Твоя задача — реализовать метод addStudents, который добавит 5 студентов
//с их средней оценкой в коллекцию grades.
//public class HashMapClass {
//    public static HashMap<String, Double> grades = new HashMap<String, Double>();
//
//    public static void main(String[] args) {
//        addStudents();
//        System.out.println(grades);
//    }
//
//    public static void addStudents() {
//        grades.put("Давыдов Олег", 4.3d);
//        grades.put("Шульга Николай", 4.1d);
//        grades.put("Колос Василий", 4.9d);
//        grades.put("Шевченко Тарас", 3.7d);
//        grades.put("Марчук Любослав", 3.2d);
//    }
//}

//Подмножества HashMap: множество ключей
//public class HashMapClass {
//    public static void main(String[] args) {
//        HashMap<String, Integer> map = new HashMap<String, Integer>();
//        map.put("Серега", 21);
//        map.put("Николай", 22);
//        map.put("Иван Петрович", 48);
//        map.put("Анюта", null);
//
//        for (String key: map.keySet()) //keySet() возвращает множество ключей
//        {
//            Integer value = map.get(key);
//            System.out.println(key + " --> " + value);
//        }
//    }
//}

//Успеваемость студентов-2
//В классе Solution объявлено поле grades типа HashMap,
//где ключ — имя и фамилия студента, а значение - его средняя оценка.
//На этот раз твоя задача — реализовать методы: - printStudents,
//который выводит только имена всех студентов (ключ коллекции);
//- getAverageMark, который возвращает средний балл всех студентов
//public class HashMapClass {
//    public static HashMap<String, Double> grades = new HashMap<String, Double>();
//
//    public static void main(String[] args) {
//        addStudents();
//        System.out.println("Список студентов группы: ");
//        printStudents();
//        System.out.print("Средний балл группы: " + getAverageMark());
//    }
//
//    public static void addStudents() {
//        grades.put("Давыдов Олег", 4.3d);
//        grades.put("Шульга Николай", 4.1d);
//        grades.put("Колос Василий", 4.9d);
//        grades.put("Шевченко Тарас", 3.7d);
//        grades.put("Марчук Любослав", 3.2d);
//    }
//
//    public static void printStudents() {
//        for (String name : grades.keySet()) {
//            System.out.println(name);
//        }
//    }
//
//    public static Double getAverageMark() {
//        Double identity = 0d;
//        for (Double value : grades.values()) {
//            identity += value;
//        }
//        System.out.println();
//        return identity / grades.size();
//    }
//}

//Использование цикла по парам
//В коллекции HashMap есть вспомогательный класс для хранения пары элементов
//class Entry<KeyType, ValueType>
//{
//    private KeyType key;
//    private ValueType value;
//
//    public KeyType getKey()
//    {
//        return this.key;
//    }
//
//    public ValueType getValue()
//    {
//        return this.value;
//    }
//}
//Результат вызова метода entrySet() у объекта типа HashMap<ТКлюч, ТЗначение>
//будет иметь тип Set<Entry<ТКлюч, ТЗначение>>:
//Set<Entry<Ключ, Значение>> имя = map.entrySet();
//public class HashMapClass {
//    public static void main(String[] args) {
//        HashMap<String, Integer> map = new HashMap<String, Integer>();
//        map.put("Серега", 21);
//        map.put("Николай", 22);
//        map.put("Иван Петрович", 48);
//        map.put("Анюта", null);
//
////        Set<Map.Entry<String, Integer>> entries = map.entrySet();
////        for(Map.Entry<String, Integer> pair: entries)
////        {
////            String key = pair.getKey();
////            Integer value = pair.getValue();
////            System.out.println(key + " --> " + value);
////        }
//
//        //упрощенный вариант
//        for(Map.Entry<String, Integer> pair: map.entrySet())
//        {
//            String key = pair.getKey();
//            Integer value = pair.getValue();
//            System.out.println(key + " --> " + value);
//        }
//    }
//}

//Успеваемость студентов-3
//В классе Solution объявлено поле grades типа HashMap<String, Double>,
//где ключ — имя и фамилия студента, а значение - его средняя оценка.
//Попробуем сделать один метод, который будет выводить полную информацию
//о студентах, используя метод entrySet класса HashMap.
//public class HashMapClass {
//    public static HashMap<String, Double> grades = new HashMap<String, Double>();
//
//    public static void main(String[] args) {
//        addStudents();
//        printStudentsInfo();
//    }
//
//    public static void addStudents() {
//        grades.put("Кесарчук Олег", 4.3d);
//        grades.put("Шульга Николай", 4.1d);
//        grades.put("Колос Василий", 4.9d);
//        grades.put("Шевченко Тарас", 3.7d);
//        grades.put("Марчук Любослав", 3.2d);
//    }
//
//    public static void printStudentsInfo() {
//        for (Map.Entry<String, Double> pair: grades.entrySet()){
//            String key = pair.getKey();
//            Double value = pair.getValue();
//            System.out.println(key + " : " + value);}
//    }
//}

//ArrayList vs HashMap
//В классе Solution есть метод getProgrammingLanguages,
//который возвращает список языков программирования.
//Тебе нужно переписать этот метод, чтобы он возвращал HashMap.
//Ключом в этой коллекции будет индекс элемента в ArrayList.
public class HashMapClass {

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static HashMap<Integer, String> getProgrammingLanguages() {
        HashMap<Integer, String> programmingLanguages = new HashMap<Integer, String>();
        programmingLanguages.put(0, "Java");
        programmingLanguages.put(1, "Kotlin");
        programmingLanguages.put(2, "Go");
        programmingLanguages.put(3, "Javascript");
        programmingLanguages.put(4, "Typescript");
        programmingLanguages.put(5, "Python");
        programmingLanguages.put(6, "PHP");
        programmingLanguages.put(7, "C++");
        return programmingLanguages;
    }

}
