package ship;

public class Ship {
    public int name;
    private int maxWeight;
    private int currentWeight;

    public Ship(int maxWeight, int currentWeight, int name) {
        this.name = name;
        this.maxWeight = maxWeight;
        this.currentWeight = currentWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    public boolean hasCargo() {
        return currentWeight > 0;
    }

    public boolean hasSpace() {
        return currentWeight < maxWeight;
    }

    public int getAvailableSpace() {
        return maxWeight - currentWeight;
    }

    public void addCargo(int weight) {
        currentWeight += weight;
    }
}
