package mirea.lab3.Shelltask1;

public class Tester {
    public static void main(String[] args) {
        //1
        Double x = Double.valueOf(4);
        System.out.println(x);

        //2
        String str = "3";
        Double.parseDouble( str );
        System.out.println( str );

        //3
        Double k = Double.valueOf(5.1);

        byte byteValue = k.byteValue();
        System.out.println("byte: " + byteValue);

        short shortValue = k.shortValue();
        System.out.println("short: " + shortValue);

        int intValue = k.intValue();
        System.out.println("int: " + intValue);

        long longValue = k.longValue();
        System.out.println("long: " + longValue);

        float floatValue = k.floatValue();
        System.out.println("float: " + floatValue);

        // 4
        double doubleValue = k.doubleValue();
        System.out.println("double: " + doubleValue);

        //5
        String pi = Double.toString( 3.14 );
        System.out.println( "String pi: " + pi );

    }
}
