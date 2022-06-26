//package JavaSyntax;
//
//import java.io.FileInputStream;
//
//public class FilePrinter {
//    public String content;
//
//    public FilePrinter(String filename) throws Exception
//    {
//        FileInputStream input = new FileInputStream(filename); //Открываем поток чтения файла
//        byte[] buffer = input.readAllBytes(); //Читаем файл в массив байт
//
//        this.content = new String(buffer); //Сохраняем массив байт в виде строки
//
//    }
//
//    public void printFile()
//    {
//        System.out.println(content); //Выводим содержимое файла на экран
//    }
//}
