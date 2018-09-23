import java.util.Scanner;

public class Engine {
    protected long mileage;
    protected boolean started;

    // methods
    public void turnOn() {
        started = true;
        System.out.println("Завелись");
    }

    public void turnOff() {
        started = false;
    }

    public void addMileage() {
        if (started)
            this.mileage++;
        System.out.println("Пробег "+getMileage()+" километров");
    }

    // constructors
    public Engine() {
    }

    public Engine(long mileage) {
        this.mileage = mileage;
    }

    // getters && setters
    public long getMileage() {
        return mileage;
    }

    protected void setMileage(long mileage) {
        this.mileage = mileage;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }


    // others
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        if (mileage != engine.mileage) return false;
        return started == engine.started;
    }

    @Override
    public int hashCode() {
        int result = (int) (mileage ^ (mileage >>> 32));
        result = 31 * result + (started ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Engine ");
        sb.append("mileage is: ").append(mileage);
        return sb.toString();
    }
}