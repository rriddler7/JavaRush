package JavaSyntax;

import java.util.ArrayList;


//Array + List.
//Array — это массив, а List — список.
//Внутри каждого объекта типа ArrayList хранится обычный массив элементов.
//Когда вы считываете элементы из ArrayList, он считывает их со своего внутреннего массива.
//Когда записываете — записывает их во внутренний массив.

//Бухгалтерия
//В классе Solution есть список сотрудников
//waitingEmployees, которые ждут зарплату, и список сотрудников
//alreadyGotSalaryEmployees, которые её уже получили.
//Необходимо реализовать метод paySalary(String),
//который в качестве аргумента принимает имя сотрудника,
//желающего получить зарплату.
public class ClassArrayLiist {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
    }

    public static void paySalary(String name) {
        if (waitingEmployees.contains(name) && !alreadyGotSalaryEmployees.contains(name)) {
            alreadyGotSalaryEmployees.add(name);
            for (int i = 0; i < waitingEmployees.size(); i++) {
                if (waitingEmployees.get(i) != null && waitingEmployees.get(i).equals(name)) {
                    waitingEmployees.set(i, null);
                    break;
                }
            }
        }
    }
}
