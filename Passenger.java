/**
 * This class represents a passenger
 * taking user-given name.
 */
public class Passenger {

    // attribute
    private String name;

    // constructor
    /**
     * Constructs the passenger
     * 
     * @param name name of the passenger
     */
    public Passenger(String name) {
        this.name = name;
    }

    // getter
    /**
     * Returns the name of the passenger
     * 
     * @return the name of the passenger
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the name of the passenger when printed
     */
    public String toString() {
        return this.name;
    }

    // methods
    /**
     * Boards the passenger to the car
     * 
     * @param c the car which passenger is boarding on
     */
    public void boardCar(Car c) {
        if (c.addPassenger(this)) {
            System.out.println("The passenger(" + this.name + ") got on board");
        } else {
            System.out.println("The passenger(" + this.name + ") could not get on board");
        }
    }

    /**
     * Takes passenger off the car
     * 
     * @param c the car which passenger is getting off from
     */
    public void getOffCar(Car c) {
        if (c.removePassenger(this)) {
            System.out.println("The passenger(" + this.name + ") got off the car");
        } else {
            System.out.println("So the passenger(" + this.name + ") can not get off");
        }
    }
}
