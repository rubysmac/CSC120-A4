/**
 * This class sets the engine
 * taking user-given fuel type and maximum fuel level.
 */
public class Engine {

    // Attributes
    private FuelType f;
    private double currentFuelLevel;
    private double maxFuelLevel;

    // Accessors

    /**
     * Returns the current fuel level.
     * 
     * @return the current fuel level
     */
    public double getCurrentFuel() {
        return this.currentFuelLevel;
    }

    /**
     * Returns the maximum fuel level.
     * 
     * @return the maximum fuel level.
     */
    public double getMaxFuel() {
        return this.maxFuelLevel;
    }

    // Constructor
    /**
     * Constructs the engine with its fuel type and maximum fuel level,
     * also setting it as current fuel level
     * 
     * @param type fuel type
     * @param max  maximum fuel level
     */
    public Engine(FuelType type, double max) {
        this.f = type;
        this.currentFuelLevel = max;
        this.maxFuelLevel = max;
    }

    // Methods
    /**
     * Replenishes the fuel level into maximum level.
     */
    public void refuel() {
        this.currentFuelLevel = this.maxFuelLevel;
    }

    /**
     * Uses and subtracts 10 level of fuel level from current fuel level
     * 
     * @return true if current fuel level is above 0, otherwise false
     */
    public boolean go() {
        if (this.currentFuelLevel > 0) {
            this.currentFuelLevel = this.currentFuelLevel - 10;
            System.out.println("current fuel level: " + this.currentFuelLevel);
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
}