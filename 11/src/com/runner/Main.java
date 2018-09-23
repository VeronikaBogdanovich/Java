package com.runner;

import dock.Dock;
import dock.LockDock;

import ship.Ship;
import thread.ShipThread;

import java.util.Random;

public class Main {
	private static void emulateWork(Dock dock) {
		Thread[] threads = new Thread[5];
		Random random = new Random();
		int name[]= new int[5];

		for (int i = 0; i < 5; i++) {
			int maxWeight = 20;
			int currentWeight = random.nextInt(maxWeight);
			name[i] = i+1;

			Ship ship = new Ship(maxWeight, currentWeight, name[i]);
			threads[i] = new Thread(new ShipThread(dock, ship));
		}

		// run
		for (int i = 0; i < 5; i++) {
			threads[i].start();
		}

		// wait
		for (int i = 0; i < 5; i++) {
			while (threads[i].isAlive()) {
				System.out.println("waiting");
			}
		}
	}
    public static void main(String[] args) {
		System.out.println("Lock variant");
		emulateWork(new LockDock(10, 1000));

    }
}
