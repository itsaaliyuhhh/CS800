package assignment1.polymorphism;

public class DisplayShipArray {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Baratie", "1998");
        ships[1] = new CruiseShip("Going Merry", "1999", 50);
        ships[2] = new CargoShip("Thousand Sunny", "2007", 10000);

        for (Ship ship : ships) {
            ship.printShipInfo();
            System.out.println();
        }
    }
}
