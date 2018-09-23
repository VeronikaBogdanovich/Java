
public class CarRunner {
    public static void main(String[] args) throws InterruptedException {
        Car AstonMartin = new Car();
        AstonMartin.setName("Rapide");
        AstonMartin.setMileage(15000);
        AstonMartin.setFuel(0);
        AstonMartin.setWheels(new Wheel(10.0));
        System.out.println(AstonMartin);
        AstonMartin.turnOn();
        AstonMartin.fillFuel(1);
        AstonMartin.run();
        AstonMartin.stop();
        AstonMartin.turnOff();
        AstonMartin.changeWheel();
        AstonMartin.run();
        AstonMartin.turnOn();
        AstonMartin.fillFuel(1);
        AstonMartin.run();
        AstonMartin.stop();
        AstonMartin.addMileage();
        AstonMartin.turnOff();
        AstonMartin.showName();
    }
}