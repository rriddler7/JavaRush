package JavaSyntax;

//Статические методы привязаны к статическому объекту класса
//и могут обращаться только к статическим переменным
//и/или другим статическим методам класса.

//Обычные же методы привязаны к объектам (экземплярам) класса и
//могут обращаться к обычным-переменным класса (а также к статическим переменным и методам).
//Чтобы вызвать обычный метод у класса, сначала нужно создать объект этого класса,
//а только потом вызвать метод у объекта. Вызвать обычный метод не у объекта, а у класса нельзя.
//Вызвать нестатический метод у класса нельзя!

//Чтобы вызвать статический метод, достаточно
// чтобы просто существовал статический объект класса
//(который всегда существует после загрузки класса в память).
//Именно поэтому метод main() — статический.
//Он привязан к статическому объекту класса,
// для его вызова не нужно создавать никакие объекты.

//Чтобы вызвать статический метод из другого класса,
//нужно указать имя класса перед именем статического метода.

//public class StaticMethods
//{
//    public static void main(String args[]) //Метод main вызывается Java-машиной командой вида: StaticMethods.main();
//    {
//        test();
//    }
//
//    public static void test() //Статический метод test() вызывается в статическом методе main().
//    {
//        int d = 2/0;
//    }
//}

/*
Конвертер строки
*/
//В методе main конвертируй строку string в тип double
//с помощью статического метода parseDouble класса Double.
//Затем округли полученное значение, используя статический метод round класса Math.
//Результат выведи на экран.
//public class StaticMethods {
//    public static void main(String[] args) {
//        String string = "12.84";
//        double x = Double.parseDouble(string); //указываем имя класса перед именем статического метода
//        System.out.println(Math.round(x));
//    }
//}

//Оконные работы
//В классе Window есть метод changeSize, который должен менять
//размеры окна на значения, переданные в метод.
//Но если ты запустишь программу, то убедишься,
//что этот метод не работает.
//Тебе нужно исправить ошибки так, чтобы метод заработал.
//class Window {
//    private int height = 2;
//    private int width = 3;
//
//    public void changeSize(int height, int width){
//        this.height = height;
//        this.width = width;
//    }
//
//    public void printSize(){
//        System.out.println("Height = " + height);
//        System.out.println("Width = " + width);
//    }
//}
//
//public class StaticMethods {
//    public static void main(String[] args) {
//        Window window = new Window();
//        window.printSize();
//        window.changeSize(4, 5);
//        window.printSize();
//    }
//}

//Одинаковые машины
//В далеком-далеком прошлом все машины называли одинаково.
//Но вот в один прекрасный день директору завода по производству
//автомобилей надоело однообразие, и он выдал распоряжение:
//давать разные названия моделям авто. Итак, как ты уже догадался,
//твоя задача — помочь главному инженеру исправить программу
public class StaticMethods {
    private String modelName;
    private int speed;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
