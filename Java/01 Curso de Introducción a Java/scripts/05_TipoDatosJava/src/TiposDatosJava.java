public class TiposDatosJava {
    public static void main(String[] args) {

        // Parte 1

        int n = 1234567890;
        long nL = 12345678901L;
        System.out.println(n);

        double nD = 123.456;
        float nF = 123.456F;
        System.out.println(nD);

        // Parte 2

        var salary = 1000; // int
        // pensión 3%
        var pension = salary * 0.03; // double
        var totalSalary = salary - pension;

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Gabriel Solari";
        System.out.println("EMPLOYEE: " + employeeName + " SALARY: " + totalSalary);
    }
}
