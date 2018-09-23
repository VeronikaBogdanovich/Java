
public class Fraction {
    int numerator;
    int denominator=0;

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    public boolean exsist (){
        if(denominator==0) {
            return false;
        }
        return true;
    }
    public Fraction divide(Fraction f1, Fraction f2) {
        Fraction end = new Fraction(0, 1);
        end.setNumerator(f1.numerator * f2.denominator);
        end.setDenominator(f1.denominator * f2.numerator);
        return end;
    }
    public Fraction invert () {
        this.numerator=this.numerator*(-1);
        return this;
    }
}
