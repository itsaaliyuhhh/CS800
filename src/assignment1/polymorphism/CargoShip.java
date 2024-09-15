package assignment1.polymorphism;

public class CargoShip extends Ship {
    private int cargoCapacityInTons;

    public CargoShip(String shipName, String yearBuilt, int cargoCapacityInTons) {
        super(shipName, yearBuilt);
        this.cargoCapacityInTons = cargoCapacityInTons;
    }

    public int getCargoCapacityInTons() {
        return cargoCapacityInTons;
    }

    public void setCargoCapacityInTons(int cargoCapacityInTons) {
        this.cargoCapacityInTons = cargoCapacityInTons;
    }

    @Override
    public void printShipInfo() {
        System.out.println("Cargo Ship Name: " + getShipName());
        System.out.println("Cargo Capacity: " + cargoCapacityInTons + " tons");
    }
}
