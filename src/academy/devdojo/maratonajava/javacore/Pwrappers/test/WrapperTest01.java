package academy.devdojo.maratonajava.javacore.Pwrappers.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'P';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; // autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; // unboxing

        intW = Integer.parseInt("2");
        System.out.println(intW);
        System.out.println("---------------");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        try {
            intW = Integer.parseInt("abc");
            System.out.println("Número convertido com sucesso: "+intW);
        } catch (NumberFormatException e){
            System.out.println("O valor inserido não é conversível para um int.");
        }
    }
}
