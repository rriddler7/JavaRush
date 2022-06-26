package JavaSyntax;

import javax.imageio.stream.ImageInputStream;
import java.util.Arrays;

//Метод Arrays.toString() возвращает «текстовое представление массива»
//public class ClassArrays {
//    public static String[] strings = new String[]{"I", "love", "Java"};
//    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
//
//    public static void main(String[] args) {
//        String str = Arrays.toString(strings);
//        System.out.println(str);
//        String str1 = Arrays.toString(ints);
//        System.out.println(str1);
//    }
//}

//Метод Arrays.deepToString()
//преобразовывает в строку (выводит на экран) двумерный массив
//public class ClassArrays {
//    public static String[][] strings = new String[][]{{"🙂", "🙂", "🙂", "🙂"}, {"🙃", "🙃", "🙃", "🙃"}, {"😋", "😋", "😋", "😋"}, {"😎", "😎", "😎", "😎"}};
//    public static int[][] ints = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
//
//    public static void main(String[] args) {
//        String str = Arrays.deepToString(strings);
//        System.out.println(str);
//        String inta = Arrays.deepToString(ints);
//        System.out.println(inta);
//    }
//}

//Метод Arrays.equals() сравнивает по содержанию
//Метод возвращает true (истина),
//если массивы равной длины и их элементы равны.
//Иначе возвращает false (ложь).
//public class ClassArrays {
//    public static void main(String[] args) {
//        int[] x1 = {1, 2, 3};
//        int[] x2 = {1, 2, 3};
//        int[] x3 = {1, 2, 3, 4};
//        System.out.println(x1.equals(x2)); //false (ссылки не равны). Метод equals у массивов сравнивает ссылки двух массивов
//        System.out.println(Arrays.equals(x1, x2)); //true (содержимое массивов равно)
//        System.out.println(Arrays.equals(x1, x3)); //false (содержимое массивов отличается)
//    }
//}

//Метод Arrays.deepEquals() сравнивает многомерные массивы
//Метод возвращает true (истина), если массивы равной длины и их элементы равны.
//Иначе возвращает false (ложь). Если элементы внутри массива — тоже массивы,
//для их сравнения используется метод Arrays.deepEquals() и т.д.
//public class ClassArrays {
//    public static void main(String[] args) {
//        int[][] x1 = {{1, 2, 3}, {4, 5, 6}};
//        int[][] x2 = {{1, 2, 3}, {4, 5, 6}};
//        System.out.println(x1.equals(x2)); //false (ссылки не равны)
//        System.out.println(Arrays.equals(x1, x2)); //false (содержимое массивов неравно)
//        //Метод Arrays.equals сравнит x1 и x2 как одномерные массивы,
//        //которые хранят ссылки. Ссылки в них хранятся разные.
//        System.out.println(Arrays.deepEquals(x1, x2)); //true (содержимое массивов равно)
//    }
//
//}

/*
Сравнение двумерных массивов
*/
//public class ClassArrays {
//
//    public static int[][] arrayFirst = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
//    public static int[][] arraySecond = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
//
//    public static void main(String[] args) {
//        System.out.println(Arrays.deepEquals(arrayFirst, arraySecond));
//    }
//}

//Метод Arrays.fill() заполняет переданный массив переданным значением
//С помощью метода Arrays.fill() можно заполнить определенным
//значением не весь массив, а его часть между индексами
//Работает только с одномерными массивами
//public class ClassArrays {
//    public static void main(String[] args) {
//        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
////        Arrays.fill(x, 999);
//        Arrays.fill(x, 3, 7, 999);
//        String str = Arrays.toString(x);
//        System.out.println(str);
//    }
//}

//Реализуй статический метод main(String[]),
//который заполняет массив array значениями valueStart и valueEnd.
//Если длина массива четная, его первую половину нужно заполнить значениями valueStart,
//а вторую — valueEnd. Если длина массива нечётная,
//то первую большую часть заполнить значениями valueStart,
//вторую меньшую — valueEnd. Для заполнения массива используй метод Arrays.fill(int[], int, int, int)
//public class ClassArrays {
//    public static int[] array = new int[21];
//    public static int valueStart = 10;
//    public static int valueEnd = 13;
//
//    public static void main(String[] args) {
//        if (array.length % 2 == 0) {
//            Arrays.fill(array, 0, array.length / 2, valueStart);
//            Arrays.fill(array, array.length / 2, array.length, valueEnd);
//        }
//        else {
//            Arrays.fill(array, 0, array.length / 2 + 1, valueStart);
//            Arrays.fill(array, array.length / 2 + 1, array.length, valueEnd);
//        }
//        System.out.println(Arrays.toString(array));
//    }
//}

//Метод Arrays.copyOf()
//Размер массива после его создания поменять нельзя.
//Для изменения его размера можно:
//Создать новый массив нужной длины
//Скопировать в него все элементы из первого массива.
//Этот метод не меняет существующий массив, вместо этого он
//создает новый массив и копирует в него элементы старого массива.
//public class ClassArrays {
//    public static void main(String[] args) {
//        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        int[] x2 = Arrays.copyOf(x, 5);
//        String str2 = Arrays.toString(x2);
//        System.out.println(str2);
//
//
//        int[] x3 = Arrays.copyOf(x, 15);
//        String str3 = Arrays.toString(x3);
//        System.out.println(str3);
//    }
//}

//Метод Arrays.copyOfRange()
//Этот метод тоже создает новый массив,
//но заполняет его данными из произвольного места
//исходного массива между индексами
//public class ClassArrays {
//    public static void main(String[] args) {
//        int[] x = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//
//        int[] x2 = Arrays.copyOfRange(x, 5, 10);
//        String str2 = Arrays.toString(x2);
//        System.out.println(str2);
//
//        int[] x3 = Arrays.copyOfRange(x, 5, 15);
//        String str3 = Arrays.toString(x3);
//        System.out.println(str3);
//    }
//}

//Делим массив
//Реализуй метод main(String[]), который делит массив array на два подмассива
//и заполняет ими двумерный массив result. Если длина массива нечетная,
//то большую часть нужно скопировать в первый подмассив.
//Для разделения массива используй метод Arrays.copyOfRange(int[], int, int)
//public class ClassArrays {
//    public static int[][] result = new int[2][];
//    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
//
//    public static void main(String[] args) {
//        if (array.length % 2 == 0) {
//            result[0] = Arrays.copyOfRange(array, 0, array.length / 2);
//            result[1] = Arrays.copyOfRange(array, array.length / 2, array.length);
//        }
//        else {
//            result[0] = Arrays.copyOfRange(array, 0, array.length / 2 + 1);
//            result[1] = Arrays.copyOfRange(array, array.length / 2 + 1, array.length);
//        }
//        System.out.println(Arrays.deepToString(result));
//    }
//}

//Метод Arrays.sort() сортировка
//Три самых частых действия при работе с массивами:
//Сортировка массива
//Поиск минимального (или максимального) элемента массива
//Определение индекса элемента в массиве (поиск элемента в массиве)
//Сортировать можно не только весь массив, но и часть массива
//public class ClassArrays {
//    public static void main(String[] args) {
//        int[] x = {11, -2, 3, 0, 999, -20, 8, -20, 99, -20};
//        Arrays.sort(x);
//        String str = Arrays.toString(x);
//        System.out.println(str);
//
//        int[] x2 = {11, -2, 3, 0, 999, -20, 8, -20, 99, -20};
//        Arrays.sort(x2, 4, 8);
//        String str2 = Arrays.toString(x2);
//        System.out.println(str2);
//
//        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//    }
//}
//В Java для сортировки массивов используется самый быстрый алгоритм сортировки — QuickSort.
//Скорость его сортировки зависит от размера массива и рассчитывается по формуле N*Log(N).

//Метод Arrays.binarySearch()
//умеет искать заданное значение в массиве. Это не обычный поиск, а так называемый бинарный поиск.
//Суть его заключается вот в чем:
//Предварительно массив сортируется
//Затем средний элемент массива сравнивается с искомым (с тем, который мы ищем).
//Если искомый больше среднего, поиск продолжается в правой половине массива.
//Если искомый элемент меньше среднего, поиск продолжается в левой половине массива
//Благодаря тому, что массив отсортирован, можно за одно сравнение отбросить половину массива.
//Затем на следующем шаге отбросить еще половину и т.д.
//Если элемент в массиве не найден, индекс будет отрицательным.
//public class ClassArrays {
//    public static void main(String[] args) {
//        int[] x = {11, -2, 3, 0, 999, -20, 8, -20, 99, -20};
//
//        int index1 = Arrays.binarySearch(x, 0);
//        System.out.println(index1);
//        int index2 = Arrays.binarySearch(x, -20);
//        System.out.println(index2);
//        int index3 = Arrays.binarySearch(x, 99);
//        System.out.println(index3);
//        int index4 = Arrays.binarySearch(x, 5);
//        System.out.println(index4);
//    }
//}

//Реализуй метод main(String[]), который выводит в консоль true,
//если элемент содержится в переданном массиве, иначе — false.
//Массив array не должен изменять расположение своих элементов.
//Для поиска элемента в массиве нужен бинарный поиск. Чтобы это сделать,
//используй статический метод Arrays.binarySearch(int[], int) класса Arrays.
/*
Есть ли кто?
*/
public class ClassArrays {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int[] copy = Arrays.copyOf(array, array.length);
        Arrays.sort(copy);
        int index = Arrays.binarySearch(copy, element);
        System.out.println(index >= 0);
    }
}