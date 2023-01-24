public class Calculate {
    public static void calc() {
        double maxPoints = 7;
        double results = 6;
        double procentage = results / maxPoints;
        System.out.printf("Out of %.1f points you scored %.1f points. %nThis gives you a %.2f%%%n", maxPoints, results, (procentage * 100));
    }
}
