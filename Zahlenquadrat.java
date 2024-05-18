public class Zahlenquadrat {
    public static void main(String[] args) {
        for (int a = -100; a <= 100; a++) {
            for (int b = -100; b <= 100; b++) {
                if (a * b == 15) {
                    int d = 12 - b;
                    int c = d + 5;
                    // int c = 3 - a;  auch
                    // int d = c - 5;  möglich
                    if ((b + d == 12) && (a + c == 3)) { // && (a + c == 3) nicht wirklich nötig, man könnte da auch alle 4 Rechnungen abfragen...
                        System.out.println("Ergebnis:");
                        System.out.println("a = " + a);
                        System.out.println("b = " + b);
                        System.out.println("c = " + c);
                        System.out.println("d = " + d);
                        return;
                    }
                }
            }
        }
        System.out.println("Keine Lösung möglich.");
    }
}
