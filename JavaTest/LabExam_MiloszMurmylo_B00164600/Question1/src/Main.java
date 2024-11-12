public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setName("Audi A4");
        car1.setCapacity(5);
        car1.setTopSpeed(200);
        car1.terrainType = TerrainType.LAND;

        System.out.println(car1);
    }
}