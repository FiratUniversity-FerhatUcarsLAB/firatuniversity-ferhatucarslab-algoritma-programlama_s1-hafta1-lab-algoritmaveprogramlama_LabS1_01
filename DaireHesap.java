public class DaireHesap {
    public static void main(String[] args) {
        double yaricap = 3.5;
        double cevre = 2 * Math.PI * yaricap;
        double alan = Math.PI * Math.pow(yaricap, 2);
        System.out.println("Çevre: " + cevre);
        System.out.printf("Alan: %.2f%n", alan);
    }
}