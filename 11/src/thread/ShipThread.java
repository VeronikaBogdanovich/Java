package thread;

import dock.Dock;
import ship.Ship;

public class ShipThread implements Runnable{
    private Ship ship; // корабль
    private Dock dock; // причал

    public ShipThread(Dock dock, Ship ship) {
        this.ship = ship;
        this.dock = dock;
    }

    @Override
    public void run() {
        // dock
        if (!dock.dock()) {
            System.out.println("Cannot dock " + ship.name);
            return;
        }

        // try place everything to dock
        if (ship.hasCargo()) {
            System.out.println("Try place " + ship.name + " with weight " + ship.getCurrentWeight() + " to dock");
            if (dock.place(ship.getCurrentWeight())) {
                ship.setCurrentWeight(0);
            }
        }

        // try load
        if (ship.hasSpace()) {
            System.out.println("Try load " + ship.name + " with weight " + ship.getAvailableSpace() + " to ship");
            ship.addCargo(dock.load(ship.getAvailableSpace()));
        }

        dock.sail();
    }
}
