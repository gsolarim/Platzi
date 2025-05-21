public class OperacionesMatematicas {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        System.out.println(Math.PI);
        System.out.println(Math.E);

        // Devuelve un entero hacia arriba
        // ceil -> redondeo hacia arriba
        System.out.println(Math.ceil(x));

        // Devuelve un  entero hacia abajo
        // floor -> redondeo hacia abajo
        System.out.println(Math.floor(x));

        // Devuelve un número elevado a otro
        System.out.println(Math.pow(x,y));

        // Devuelve un número mayor
        System.out.println(Math.max(x,y));

        // Devuelve la raíz cuadrada
        System.out.println(Math.sqrt(y));

        // Área de un círculo
        // pi * r2
        System.out.println(Math.PI * Math.pow(y,2));

        // Área de una esfera
        // 4 * pi * r2
        System.out.println(4 * Math.PI * Math.pow(y,2));

        // Volumen de una esfera
        // (4/3) * pi * r3
        System.out.println((4/3) * Math.PI * Math.pow(y,3));
    }
}