package assignment1.polymorphism;

public class CruiseShip extends Ship {
    private int maxNumofPassengers;

    public CruiseShip(String shipName, String yearBuilt, int maxNumofPassengers) {
        super(shipName, yearBuilt);
        this.maxNumofPassengers = maxNumofPassengers;
    }

    public int getMaxNumofPassengers() {
        return maxNumofPassengers;
    }

    public void setMaxNumofPassengers(int maxNumofPassengers) {
        this.maxNumofPassengers = maxNumofPassengers;
    }

    @Override
    public void printShipInfo() {
        System.out.println("Cruise Ship Name: " + getShipName());
        System.out.println("Maximum Passengers: " + maxNumofPassengers);
    }
}
