package JavaSyntax;

import java.util.Scanner;

//public class StringArray {
//    public static void main(String[] args) {
//        Scanner console = new Scanner(System.in);
//        String[] array = new String[5];
//        for (int i = 0; i < 5; i++)
//        {
//            array[i] = console.nextLine();
//        }
//        for (int i = 5; i >= 0; i--)
//        {
//            System.out.println(array[i]);
//        }
//    }
//}

//Сравнение ячеек массива String
//public class StringArray {
//    public static void main(String[] args) {
//        String[] array = new String[5];
//
//        array[1] = "Привет";
//        array[2] = array[1];
//        array[3] = new String("Привет");
//        // сравниваем
//        System.out.println(array[1] == array[2]); //true (ссылки равны)
//        System.out.println(array[1] == array[3]); //false (ссылки не равны)
//        System.out.println(array[1].equals(array[3])); //true (строки равны)
//        System.out.println(array[1].equalsIgnoreCase(array[3])); //true (строки все равно равны)
//    }
//}

//Удаляем одинаковые строки
//public class StringArray {
//    public static String[] strings;
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        strings = new String[6];
//        for (int i = 0; i < 6; i++) {
//            strings[i] = scanner.nextLine();
//        }
//
//        for (int i = 0; i < strings.length; i++) {
//            String currentString = strings[i];
//            for (int j = i + 1; j < strings.length; j++) {
//                if (currentString == null) {
//                    break;
//                }
//                if (currentString.equals(strings[j])) {
//                    strings[j] = null;
//                    strings[i] = null;
//                }
//            }
//        }
//        for (int i = 0; i < strings.length; i++) {
//            System.out.print(strings[i] + ", ");
//        }
//    }
//}