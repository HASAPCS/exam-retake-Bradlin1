package com.example;

public class FuelTank {

    private int fuelLevel; // Fuel level of the tank, ranging from 0 to 100

    /**
     * Constructor to create a FuelTank with a specific fuel level.
     *
     * @param fuelLevel Initial fuel level of the tank.
     */
    public FuelTank(int fuelLevel) {
        setFuelLevel(fuelLevel);
    }

    /**
     * @return an integer value that ranges from 0 (empty) to 100 (full)
     */
    public int getFuelLevel() {
        return fuelLevel;
    }

    /**
     * Sets the fuel level of the tank.
     * 
     * @param fuelLevel New fuel level to be set.
     */
    public void setFuelLevel(int fuelLevel) {
        if (fuelLevel < 0 || fuelLevel > 100) {
            throw new IllegalArgumentException("Fuel level must be between 0 and 100.");
        }
        this.fuelLevel = fuelLevel;
    }
}
