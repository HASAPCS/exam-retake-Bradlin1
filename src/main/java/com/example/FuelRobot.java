package com.example;

public class FuelRobot {

    private int currentIndex;
    private boolean facingRight;

    public FuelRobot(int startIndex, boolean startFacingRight) {
        this.currentIndex = startIndex;
        this.facingRight = startFacingRight;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public boolean isFacingRight() {
        return facingRight;
    }

    public void changeDirection() {
        facingRight = !facingRight;
    }

    public void moveForward(int numLocs) {
        currentIndex += facingRight ? numLocs : -numLocs;
    }

    // Additional methods for testing purposes
    public void setCurrentIndex(int index) {
        currentIndex = index;
    }
}
