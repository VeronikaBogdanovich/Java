public class Wheel {
    public double radius;

    // constructors
    public Wheel() {
    }

    public Wheel(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // others
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("радиусом ");
        sb.append("колеса: ").append(radius=10);
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wheel wheel = (Wheel) o;

        return Double.compare(wheel.radius, radius) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }
}
