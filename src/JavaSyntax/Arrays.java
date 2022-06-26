package JavaSyntax;

/*
Объединяем массивы
*/
//public class Arrays {
//    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
//    public static int[] resultArray;
//
//    public static void main(String[] args) {
//        resultArray = new int[firstArray.length + secondArray.length];
//        for (int i = 0; i < firstArray.length; i++) {
//            resultArray[i] = firstArray[i];
//        }
//        for (int i = 0; i < secondArray.length; i++) {
//            resultArray[i + firstArray.length] = secondArray[i];
//        }
//
//        for (int i = 0; i < resultArray.length; i++) {
//            System.out.print(resultArray[i] + ", ");
//        }
//    }
//}

import java.util.Scanner;

//Заполнение массива из 10 чисел числами
//public class Arrays {
//    public static void main(String[] args) {
//        int[] array = new int[10];
//
////        от 0 до 9
////        for (int i = 0; i < 10; i++) {
////            array[i] = i;
////        }
//
////        от 1 до 10
////        for (int i = 0; i < 10; i++) {
////            array[i] = i + 1;
////        }
//
////        от 10 до 1
//        for (int i = 0; i < 10; i++) {
//            array[i] = 10 - i;
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + ", ");
//        }
//    }
//}

//Вывести значения массива в обратном порядке
//public class Arrays {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] array = new int [10];
//        for (int i = 0; i < 10; i++) {
//            array[i] = sc.nextInt();
//        }
//
//        for (int i = 9; i >= 0; i--) {
//            System.out.print(array[i] + " ");
//        }
//    }
//}

/*
Reverse
*/
//Тебе нужно написать программу, которая:
//Считывает с консоли целое число N.
//Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
//Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.
//Каждое число выводить с новой строки. Число N выводить не нужно.

//public class Arrays {
//    public static void main(String[] args) {
//        Scanner console = new Scanner(System.in);
//        int[] array;
//        int N = console.nextInt();
//        if (N > 0) {
//            array = new int[N];
//            for (int i = 0; i < N; i++) {
//                array[i] = console.nextInt();
//            }
//            if (N % 2 == 1) {
//                for (int i = 0; i < array.length; i++) {
//                    System.out.println(array[i]);
//                }
//            }
//            else {
//                for (int i = 1; i <= array.length; i++) {
//                    System.out.println(array[array.length - i]);
//                }
//            }
//        }
//
//    }
//}

//Поиск минимального/максимального элемента в массиве
//public class Arrays {
//    public static void main(String[] args) {
//        Scanner console = new Scanner(System.in);
//        int[] array = new int[5];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = console.nextInt();
//        }
////        int min = array[0];
////        for (int i = 1; i < array.length; i++) {
////            if (array[i] < min)
////                min = array[i];
////        }
////        System.out.println(min);
//
//        int max = array[0];
//
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > max)
//                max = array[i];
//        }
//        System.out.println(max);
//    }
//}

/*
Максимальное из N чисел
*/
//public class Arrays {
//    public static int[] array;
//
//    public static void main(String[] args) throws Exception {
//        Scanner scanner = new Scanner(System.in);
//        int n = Integer.parseInt(scanner.nextLine());
//
//        array = new int[n];
//        for (int i = 0; i < n; i++) {
//            array[i] = Integer.parseInt(scanner.nextLine());
//        }
//
//        int max = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//        System.out.println(max);
//    }
//}

//Быстрая инициализация массива в Java
//Массив длины всех месяцев
public class Arrays {
    public static void main(String[] args) {
        //Поэлементная инициализация элементов в массив
//        int[] months = new int[12];
//        months[0] = 31; // январь
//        months[1] = 28; // февраль
//        months[2] = 31; // март
//        months[3] = 30; // апрель
//        months[4] = 31; // май
//        months[5] = 30; // июнь
//        months[6] = 31; // июль
//        months[7] = 31; // август
//        months[8] = 30; // сентябрь
//        months[9] = 31; // октябрь
//        months[10] = 30; // ноябрь
//        months[11] = 31; // декабрь

//        Инициализация с new
//        int[] months = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

//        Быстрая инициализация массива
//        Компилятор может определить тип контейнера (объекта-массива) на основе типа переменной-массива.
//        А для определения длины массива — банально подсчитать количество элементов, написанных в фигурных скобках.
        int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }

        // имена месяцев года
        String[] monthsname = { "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        for (int i = 0; i < monthsname.length; i++) {
            System.out.println(monthsname[i]);
        }
    }
}
