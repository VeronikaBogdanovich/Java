package com.company.entity;

import com.company.exception.NameException;
import com.company.exception.PositiveNumberException;
import com.company.exception.VolumeException;

public class Car extends Engine {
    private static boolean DRIVE = false;
    private final int MAX_VOLUME = 55;


    protected String name;
    protected int fuel;
    protected Wheel wheels;


    // methods
    public void changeWheel() {
        Wheel wheel = new Wheel();
//        setWheels(wheel);
        System.out.println("Колесо было заменено на колесо с " + getWheels());
    }

    public void showName() {
        System.out.println("модель машины " + getName());
    }

    public int fillFuel(int litters) throws VolumeException {

        if (litters < 0) {
            throw new VolumeException("Incorrect volume");
        } else if (this.fuel + litters > this.MAX_VOLUME) {
            throw new VolumeException("Too big amount of litters");
        } else if (this.fuel == 55) {
            System.out.println("No need in fuel");
        } else {
            this.fuel += litters;
        }

        if (fuel <= 55 && fuel > 1) {
            System.out.println("Бак заправлен достаточно. Топливо: " + getFuel() + " литров");
        }

        return fuel;
    }

    public void run() {
        if (started)
            DRIVE = true;
        this.mileage = mileage + 11;
        this.fuel--;
        if (!started)
            System.out.println("Заведите автомобиль!");
        else System.out.println("Едем");
    }

    public void stop() {
        if (!started)
            System.out.println("Машина не начала движение");
        if (!DRIVE)
            System.out.println("Машина не едет");
        if (DRIVE)
            DRIVE = false;
        System.out.println("Машина остановилась");
    }


    // constructors
    public Car() {
    }

    public Car(String name, long mileage, int fuel) {
        super(mileage);
        this.name = name;
        this.fuel = fuel;
    }

    public Car(int fuel, Wheel wheel) {
        this.fuel = fuel;
        this.wheels = wheel;
    }

    public Car(long mileage, int fuel, Wheel wheel) {
        super(mileage);
        this.fuel = fuel;
        this.wheels = wheel;
    }

    public Car(long mileage, int fuel) {
        super(mileage);
        this.fuel = fuel;
    }

    // getters && setters
    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) throws PositiveNumberException {
        if (fuel < 0) {
            throw new PositiveNumberException("Incorrect fuel");
        } else {
            this.fuel = fuel;
        }
    }

    public Wheel getWheels() {
        return wheels;
    }

    public void setWheels(Wheel wheels) throws PositiveNumberException {
        if (wheels.getRadius() <= 0) {
            throw new PositiveNumberException("Wheels are incorrect");
        } else {
            this.wheels = wheels;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws NameException {
        if (name.length() <= 0) {
            throw new NameException("Invalid name");
        } else {
            this.name = name;
        }
    }

    // others
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Машина ");
        sb.append(name);
        sb.append(" с ");
        sb.append(fuel);
        sb.append(" литрами топлива. ");
        sb.append("Пробег ");
        sb.append(getMileage());
        sb.append(" километров.");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        if (fuel != car.fuel) return false;
        return !(wheels != null ? !wheels.equals(car.wheels) : car.wheels != null);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + fuel;
        result = 31 * result + (wheels != null ? wheels.hashCode() : 0);
        return result;
    }
}
