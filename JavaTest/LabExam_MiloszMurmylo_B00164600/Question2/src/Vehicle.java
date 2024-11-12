public abstract class Vehicle {
    protected String name = "not set";
    protected int capacity = 2;
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

}
