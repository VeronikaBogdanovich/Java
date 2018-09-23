package com.company.run;

import com.company.entity.Wheel;
import com.company.entity.Car;
import com.company.exception.NameException;
import com.company.exception.PositiveNumberException;
import com.company.exception.VolumeException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CarRunner {

    public static void main(String[] args) throws InterruptedException {
        Car astonMartin = new Car();
        try {
            String filePath = "/Users/veronikabogdanovich/Documents/Java/lab8a/src/out.txt";
            BufferedWriter out;
            out = new BufferedWriter(new FileWriter(filePath));
            //File f = new File(filePath, "out1.txt");
            astonMartin.setName("Rapide");
            astonMartin.setMileage(15000);
            astonMartin.setFuel(0);
            astonMartin.setWheels(new Wheel(10.0));
            System.out.println(astonMartin);


            astonMartin.turnOn();
            astonMartin.fillFuel(1);
            astonMartin.run();
            astonMartin.stop();
            astonMartin.turnOff();
            astonMartin.changeWheel();
            astonMartin.run();
            astonMartin.turnOn();
            astonMartin.fillFuel(1);
            astonMartin.run();
            astonMartin.stop();
            astonMartin.addMileage();
            astonMartin.turnOff();
            astonMartin.showName();
            out.write(astonMartin.toString());
            out.close();
        } catch (PositiveNumberException e) {
            e.printStackTrace();
        } catch (VolumeException e) {
            e.printStackTrace();
        } catch (NameException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}