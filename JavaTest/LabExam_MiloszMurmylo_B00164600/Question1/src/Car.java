public class Car {
    private String name = "not set";
    private int capacity = 2;

    private int TopSpeed;
    public TerrainType terrainType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getTopSpeed() {
        return TopSpeed;
        }


    public void setTopSpeed(int topSpeed) {
        TopSpeed = topSpeed;
    }

    public String toString(){
        String fastCar = (this.getTopSpeed() > 150) ? "Fast" : "Slow";
        return fastCar + " "  +this.terrainType + " car = " + this.name + " (capacity " + this.capacity + " passengers)";
    }

}
