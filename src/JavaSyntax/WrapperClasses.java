package JavaSyntax;

//Autoboxing и unboxing
//Автоупаковка
//public class WrapperClasses {
//    byte byteValue;
//    short shortValue;
//    int intValue;
//    long longValue;
//
//    float floatValue;
//    double doubleValue;
//
//    char charValue;
//    boolean booleanValue;
//
//    Byte byteValueBox = Byte.valueOf(byteValue);
//    Short shortValueBox = Short.valueOf(shortValue);
//    Integer integerValueBox = Integer.valueOf(intValue);
//    Long longValueBox = Long.valueOf(longValue);
//
//    Float floatValueBox = Float.valueOf(floatValue);
//    Double doubleValueBox = Double.valueOf(doubleValue);
//
//    Character characterValueBox = Character.valueOf(charValue);
//    Boolean booleanValueBox = Boolean.valueOf(booleanValue);
//
//    public static void main(String[] args) {
//
//    }
//}

//Распаковка
//public class WrapperClasses {
//    Byte byteValueBox;
//    Short shortValueBox;
//    Integer integerValueBox;
//    Long longValueBox;
//
//    Float floatValueBox;
//    Double doubleValueBox;
//
//    Character characterValueBox;
//    Boolean booleanValueBox;
//
//    byte byteValue = byteValueBox.byteValue();
//    short shortValue = shortValueBox.shortValue();
//    int intValue = integerValueBox.intValue();
//    long longValue = longValueBox.longValue();
//
//    float floatValue = floatValueBox.floatValue();
//    double doubleValue = doubleValueBox.doubleValue();
//
//    char charValue = characterValueBox.charValue();
//    boolean booleanValue = booleanValueBox.booleanValue();
//
//    public static void main(String[] args) {
//
//    }
//}

//Благодаря autoboxing и unboxing можно присваивать тип int типу Integer и наоборот.
//Можно писать выражения любой сложности и не делать различий между типами int и Integer.
//public class WrapperClasses {
//    Integer a = 5; //Integer a = Integer.valueOf(5);
//    int b = a; //int b = a.intValue();
//    Integer c = a + b; //Integer c = Integer.valueOf(a.intValue() + b);
//    int d = a + b + c; //int d = a.intValue() + b + c.intValue();
//
//    int n = 5;
//    if (a == n) //if (a.intValue() == b)
//    {
//        ...
//    }
//}

/*
Сравнение чисел
*/
//При сравнения Integer и Integer через == происходит сравнение ссылок, а не значений
public class WrapperClasses {
    static Integer first = 1000;
    static Integer second = 1000;
    static int third = 1000;

    public static void main(String[] args) {
        System.out.println(first.equals(second));
        System.out.println(third == second);
        System.out.println(third == first);
    }
}
