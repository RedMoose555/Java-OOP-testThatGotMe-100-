public final class ElectricCar extends Car{
    private static  int totalBatteries =0;
    public static int batteryKwh;

    public static int getTotalBatteries() {
        return totalBatteries = batteryKwh + totalBatteries;
    }

    public ElectricCar(int batteryKwh) {
        super();
        this.batteryKwh = batteryKwh;

    }


    @Override
    public String toString(){
        return "ElectricCar " + this.name + " (capacity " + this.capacity + " passengers)" + " battery "+ this.batteryKwh + "Kwh";
    }

}
