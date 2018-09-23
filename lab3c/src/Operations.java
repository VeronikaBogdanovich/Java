import java.util.Scanner;

public class Operations {
    public static void Intersection(Line[] lines, int n, Scanner in) {
        System.out.println("Выберите две прямые: ");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " линиия " + lines[i]);
        }
        int a = in.nextInt();
        int b = in.nextInt();
        Point p;
        Fraction det = Det(lines[a - 1].getA(), lines[a - 1].getB(), lines[b - 1].getA(), lines[b - 1].getB());
        if (det.getNumerator() == 0) {
            System.out.println("Пересечений нет");
        } else {
            Fraction x = Det(lines[a - 1].getC(), lines[a - 1].getB(), lines[b - 1].getC(), lines[b - 1].getB());
            x = x.divide(x, det);
            x = x.invert();
            Fraction y = Det(lines[a - 1].getA(), lines[a - 1].getC(), lines[b - 1].getA(), lines[b - 1].getC());
            y = y.divide(y, det);
            y = y.invert();
            p = new Point(x, y);
            System.out.println("Прямые " + lines[a - 1] + " и " + lines[b - 1] + " пересекаются в точке " + p);
        }

    }

    public static void Parallel(Line[] lines, int n, Scanner in) {
        for (int i=0; i<n; i++){
            System.out.println("Прямые параллельные прямой "+lines[i]+" :");
            for(int j=0; j<n; j++){
                if (Det(lines[i].getA(), lines[i].getB(), lines[j].getA(), lines[j].getB()).getNumerator()==0&&i!=j){
                    System.out.println(lines[j]);
                }
            }
        }
    }

    private static int NOD(int n1, int n2) {
        int div;
        if (n1 == n2) return n1;
        int d = n1 - n2;
        if (d < 0) {
            d = -d;
            div = NOD(n1, d);
        } else
            div = NOD(n2, d);
        return div;
    }

    private static int NOK(int d, Fraction f2) {
        return d * f2.getDenominator() / NOD(d, f2.getDenominator());
    }

    private static int NumiratorDifference(int n, int m, Fraction f2) {
        int det = NOK(m, f2);
        int num = n * (det / m) - f2.getNumerator() * (det / f2.getDenominator());
        return num;
    }

    private static int DeterminatorDifference(int m, Fraction f2) {
        int det = NOK(m, f2);
        return det;
    }

    private static Fraction Det(Fraction a, Fraction b, Fraction c, Fraction d) {
        Fraction f1 = new Fraction(0, 1);
        Fraction f2 = new Fraction(0, 1);
        f1.setNumerator(a.getNumerator() * d.getNumerator());
        f1.setDenominator(a.getDenominator() * d.getDenominator());
        f2.setNumerator(b.getNumerator() * c.getNumerator());
        f2.setDenominator(b.getDenominator() * c.getDenominator());
        Fraction end = new Fraction(NumiratorDifference(f1.getNumerator(), f1.getDenominator(), f2), DeterminatorDifference(f1.getDenominator(), f2));
        return end;
    }
}
