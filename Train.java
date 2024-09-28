import java.util.ArrayList;

public class Train {
    // Attributes
    private Engine myEngine;
    private ArrayList<Car> currentCars;

    // Constructor
    /**
     * Constructs the train
     * with its fuel type, fuel capacity, number of cars, and the passenger capacity
     * and adds new car objects into the arraylist of cars
     * 
     * @param fuelType          fuel type of the train engine
     * @param fuelCapacity      fuel capacity of the train engine
     * @param nCars             number of the cars of the train
     * @param passengerCapacity passanger capacity of the cars of the train
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        this.myEngine = new Engine(fuelType, fuelCapacity);
        this.currentCars = new ArrayList<Car>(nCars);
        for (int i = 0; i < nCars; i++) {
            this.currentCars.add(new Car(passengerCapacity));
        }
    }

    // Accessors
    /**
     * Returns engine
     * 
     * @return engine
     */
    public Engine getEngine() {
        return this.myEngine;
    }

    /**
     * Returns the car
     * 
     * @param i index of the car in the arraylist 'currentCars'
     * @return the car
     */
    public Car getCar(int i) {
        return this.currentCars.get(i - 1);
    }

    /**
     * Returns the total capacity of this train
     * 
     * @return the total capacity of this train
     */
    public int getMaxCapacity() {
        int netCap = 0;
        for (Car i : this.currentCars) {
            netCap += i.getCapacity();
        }
        return netCap;
    }

    /**
     * Returns the total seats remaining in this train
     * 
     * @return the total seats remaining in this train
     */
    public int seatsRemaining() {
        int netSeats = 0;
        for (Car i : this.currentCars) {
            netSeats += i.seatsRemaining();
        }
        return netSeats;
    }

    // Methods
    /**
     * Prints the whole roster of this train
     */
    public void printManifest() {
        System.out.println("**Below is the roster of this train's passengers**");
        int num = 1;
        for (Car each : this.currentCars) {
            System.out.println("-- Car #" + num + " --");
            each.printManifest();
            num++;
        }
    }

    public static void main(String[] args) {
        Train myTrain = new Train(FuelType.ELECTRIC, 100.00, 3, 5);
        Passenger pp1 = new Passenger("Ruby");
        Passenger pp2 = new Passenger("Rachel");
        pp1.boardCar(myTrain.getCar(3));
        pp2.boardCar(myTrain.getCar(2));
        pp2.getOffCar(myTrain.getCar(3));
        myTrain.printManifest();
    }
}
