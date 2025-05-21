public class IncrementoDecremento {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives); // 4

        lives --; // Decremento
        System.out.println(lives); // 3

        lives ++; // Incremento
        System.out.println(lives); // 4

        // Prefija
        int gift = 100 + lives++; // postfijo
        System.out.println(gift);
        System.out.println(lives); // 5
        gift = 100 + ++lives; // prefijo
        System.out.println(gift);
    }
}