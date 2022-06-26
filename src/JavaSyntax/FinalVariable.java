package JavaSyntax;

//Константы final
//ей должно быть присвоено стартовое значение,
//которое можно присвоить в конструкторе
//Если конструкторов несколько, final переменной
//должно быть присвоено значение во всех конструкторах.

//public class FinalVariable {
//    public final int maxAge = 25;
//    public final int maxWeight;
//
//    public FinalVariable (int weight)
//    {
//        this.maxWeight = weight; // занесение стартового значения в константу
//    }
//}

/*
Жажда скорости CarConcern
*/

public class FinalVariable {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public FinalVariable(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public FinalVariable(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "Оранжевый";
    }

    public FinalVariable(String model) {
        this.model = model;
        this.year = 4321;
        this.color = "Оранжевый";
    }
}
