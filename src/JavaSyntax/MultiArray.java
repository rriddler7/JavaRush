package JavaSyntax;

import java.util.Scanner;

//Двумерные массивы
//Двумерный массив — это массив массивов,
//то есть в каждой его ячейке находится
//ссылка на некий массив.

//Поменять строки местами
//public class MultiArray {
//    public static void main(String[] args) {
//        int[][] matrix = {
//                {1, 2, 3, 4, 5},
//                {5, 4, 3, 2, 1}
//        };
//
//        int[] tmp = matrix[0];
//        matrix[0] = matrix[1];
//        matrix[1] = tmp;
//    }
//}

/*
Таблица умножения
*/
//public class MultiArray {
//
//    public static int[][] MULTIPLICATION_TABLE;
//
//    public static void main(String[] args) {
//        MULTIPLICATION_TABLE = new int[10][10];
//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 10; j++) {
//                MULTIPLICATION_TABLE[i - 1][j - 1] = i * j;
//                System.out.print(MULTIPLICATION_TABLE[i - 1][j - 1]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }
//}

//Неровные массивы с разной длиной строк
//public class MultiArray {
//    public static void main(String[] args) {
//        int[][] matrix = new int[2][];
//        matrix[0] = new int[10];
//        matrix[1] = new int[50];
//        System.out.println(matrix.length); //количество строк 2
//        System.out.println(matrix[0].length); //длина нулевой строки
//    }
//}

/*
Треугольный массив
*/
//значение каждого элемента — это сумма индексов
//public class MultiArray {
//    public static int[][] result = new int[10][];
//
//    public static void main(String[] args) {
//        for (int i = 0; i < result.length; i++) {
//            result[i] = new int[i + 1];
//            for (int j = 0; j < result[i].length; j++) {
//                result[i][j] = i + j;
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

//Вывод на экран
//public class MultiArray {
//    public static void main(String[] args) {
//        int[][] matrix = new int[3][];
//        matrix[0] = new int[]{1, 2, 3, 4, 5, 6};
//        matrix[1] = new int[]{1, 2, 3};
//        matrix[2] = new int[]{1};
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++)
//                System.out.print( matrix[i][j] + " " );
//            System.out.println();
//        }
//    }
//}

//Создание массива вводом количества строк и их длиной с консоли
//public class MultiArray {
//    public static int[][] multiArray;
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//
//        multiArray = new int[n][];
//        for (int i = 0; i < n; i++) {
//            int size = scanner.nextInt();
//            multiArray[i] = new int[size];
//        }
//
//        for (int i = 0; i < multiArray.length; i++) {
//            for (int j = 0; j < multiArray[i].length; j++)
//                System.out.print( multiArray[i][j] + " " );
//            System.out.println();
//        }
//    }
//}

//Многомерные массивы
//public class MultiArray {
//    public static void main(String[] args) {
//        int[][][][] matrix;
//        matrix = new int[2][][][];                // создаем массив «ссылок на ссылки на ссылки» длины 2
//        for (int i = 0; i < matrix.length; i++)
//        {
//            matrix[i] = new int[3][][];             // создаем массив «ссылок на ссылки» длины 3
//            for (int j = 0; j < matrix[i].length; j++)
//            {
//                matrix[i][j] = new int[4][];          // создаем массив ссылок длины 4
//                for (int k = 0; k < matrix[i][j].length; k++)
//                    matrix[i][j][k] = new int[5];       // создаем массивы целых чисел длины 5
//            }
//        }
//    }
//}

//Вывод на экран все числа из трехмерного массива multiArray
public class MultiArray {
    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                for (int k = 0; k < multiArray[i][j].length; k++) {
                    System.out.print(multiArray[i][j][k]);
                }
            }
        }
    }
}
