public class Main {
    public static void main(String[] args) {

        System.out.println(ElectricCar.getTotalBatteries());
        ElectricCar tesla = new ElectricCar(96);
        tesla.setName("Model Y Tesla");
        tesla.setCapacity(5);
        tesla.setTopSpeed(2000);
        tesla.terrainType = TerrainType.LAND;

        System.out.println(tesla);
        System.out.println(ElectricCar.getTotalBatteries());

        ElectricCar ev7 = new ElectricCar(64);
        ev7.setName("EV 7");
        ev7.setCapacity(5);
        ev7.terrainType = TerrainType.LAND;
        ev7.setTopSpeed(2000);

        System.out.println(ev7);
        System.out.println(ElectricCar.getTotalBatteries());

    }
}