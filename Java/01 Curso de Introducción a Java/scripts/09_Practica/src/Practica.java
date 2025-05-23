public class Practica {
    public static void main(String[] args) {

        /*
         * ### **Variables**
         **Ejercicio 1.** Ponte creativo y preséntanos a tu familia con variables,
         * utiliza todos los tipos y cantidad de variables que puedas, no olvides
         * las convenciones de nombres Camel Case.
         * */

        String nameMe = "Gabriel";
        String nameWife = "Aracelly";
        String nameSisterInLaw1 = "Paloma";
        String nameSisterInLaw2 = "Sandra";

        int ageMe = 27;
        int ageWife = 30;
        int ageSisterInLaw1 = 33;
        int ageSisterInLaw2 = 23;

        System.out.println("My name is " + nameMe + " and I have " + ageMe + " years old.");
        System.out.println("My wife is " + nameWife + " and She has " + ageWife + " years old.");
        System.out.println("My sister in law is " + nameSisterInLaw1 + " and She has " + ageSisterInLaw1 + " years old.");
        System.out.println("My other sister in law is " + nameSisterInLaw2 + " and She has " + ageSisterInLaw2 + " years old.");

        /*
        **Ejercicio 2.** Usando los dos tipos de *casting* que aprendiste (implícito y explícito), resuelve
        * los siguientes *casteos* ++ indicando qué tipo es y si se está calculando estimación o exactitud ++.
        * char c = 'z'; conviértelo a int
        * int i = 250; conviértelo a long y luego de long a short
        * double d = 301.067; conviértelo a long
        * int i = 100; súmale 5000.66 y conviértelo a float
        * int i = 737; multiplícalo por 100 y conviértelo a byte
        * double d = 298.638; divídelo entre 25 y conviértelo a long
        * */

        // char c = 'z'; convirtiendo a int
        char c = 'z';
        int cInt = c; // casting implícito, exactitud
        System.out.println("char a int: " + cInt);

        // int i = 250; convirtiendo a long y luego de long a short
        int i1 = 250;
        long i1Long = i1; // casting implícito, exactitud
        short i1Short = (short) i1Long; // casting explícito, exactitud
        System.out.println("int a long: " + i1Long);
        System.out.println("long a short: " + i1Short);

        // double d = 301.067; convirtiendo a long
        double d1 = 301.067;
        long d1Long = (long) d1; // casting explícito, estimación (pierde decimales)
        System.out.println("double a long: " + d1Long);

        // int i = 100; súmale 5000.66 y convirtiendo a float
        int i2 = 100;
        double suma = i2 + 5000.66; // resultado en double
        float sumaFloat = (float) suma; // casting explícito, estimación
        System.out.println("int + double a float: " + sumaFloat);

        // int i = 737; multiplicando por 100 y convirtiendo a byte
        int i3 = 737;
        int producto = i3 * 100; // resultado en int
        byte productoByte = (byte) producto; // casting explícito, estimación (overflow)
        System.out.println("int * 100 a byte: " + productoByte);

        // double d = 298.638; dividiendo entre 25 y convirtiendo a long
        double d2 = 298.638;
        double division = d2 / 25; // resultado en double
        long divisionLong = (long) division; // casting explícito, estimación
        System.out.println("double / 25 a long: " + divisionLong);
    }
}
