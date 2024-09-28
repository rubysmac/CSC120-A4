import java.util.ArrayList;

/**
 * This class represents a car
 * taking user-given maximum number of passengers.
 */
public class Car {

    // Attributes
    private ArrayList<Passenger> currentPassengers;
    private int maxCapacity;

    // Constructors
    /**
     * Constructs the car with its maximum capacity of passengers
     * and assigns a new arraylist of passenger objects
     * 
     * @param max maximum capacity of the car
     */
    public Car(int max) {
        this.maxCapacity = max;
        this.currentPassengers = new ArrayList<Passenger>(max);
    }

    // Accessors
    /**
     * Returns the maximum capacity
     * 
     * @return the maximum capacity
     */
    public int getCapacity() {
        return this.maxCapacity;
    }

    /**
     * Returns the number of remaining seats
     * 
     * @return the number of remaining seats
     */
    public int seatsRemaining() {
        return this.maxCapacity - this.currentPassengers.size();
    }

    // Methods
    /**
     * Adds a passenger to the car if there are seats available
     * and the passenger isn't already in the car
     * 
     * @param p the passenger to be added in this car
     * @return true if successfully added, otherwise false
     */
    public boolean addPassenger(Passenger p) {
        if (seatsRemaining() > 0) {
            if (this.currentPassengers.contains(p)) {
                System.out.println("This passenger(" + p.getName() + ") is already in this car");
                return false;
            } else {
                this.currentPassengers.add(p);
                return true;
            }
        } else {
            System.out.println("There are no seats remaining in this car");
            return false;
        }
    }

    /**
     * Removes a passenger from the car if it contains the passenger
     * 
     * @param p the passenger to be removed from this car
     * @return true if successfully removed, otherwise false
     */
    public boolean removePassenger(Passenger p) {
        if (this.currentPassengers.contains(p)) {
            this.currentPassengers.remove(p);
            return true;
        } else {
            System.out.println("That passenger is not in this car");
            return false;
        }
    }

    /**
     * Prints the roster of passengers in this car
     */
    public void printManifest() {
        System.out.println("Current # of passengers in this car: " + currentPassengers.size());
        if (currentPassengers.size() != 0) {
            System.out.println("Below is the roster of this car's passengers: ");
            for (Passenger i : currentPassengers)
                System.out.println(i);
        } else {
            System.out.println("This car is EMPTY.");
        }
    }
}