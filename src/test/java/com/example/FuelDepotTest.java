package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FuelDepotTest {

    private FuelRobot robot;
    private FuelDepot depot;

    @BeforeEach
    void setUp() {
        robot = new FuelRobot(2, true); // Starting at index 2, facing right
        List<FuelTank> tanks = Arrays.asList(
            new FuelTank(50),
            new FuelTank(20),
            new FuelTank(70),
            new FuelTank(40),
            new FuelTank(60)
        );

        depot = new FuelDepot(robot, tanks);
    }

    @Test
    void testNextTankToFillWithLowestLevel() {
        int nextTank = depot.nextTankToFill(50);

        assertEquals(1, nextTank, "Next tank to fill should be the one with the lowest level within the threshold.");
    }

    @Test
    void testNextTankToFillNoneWithinThreshold() {
        robot.setCurrentIndex(3); // Set the robot's current index

        int nextTank = depot.nextTankToFill(50);

        assertEquals(1, nextTank, "Next tank to fill should be the current robot position as none are within threshold.");
    }

    @Test
    void testMoveToLocation() {
        depot.moveToLocation(4);

        assertEquals(4, robot.getCurrentIndex(), "Robot should move to index 4.");
        assertEquals(true, robot.isFacingRight(), "Robot should still be facing right.");
    }

    @Test
    void testMoveToLocationChangeDirection() {
        robot.setCurrentIndex(3); // Starting at index 3
        robot.changeDirection();  // Now facing left

        depot.moveToLocation(1);

        assertEquals(1, robot.getCurrentIndex(), "Robot should move to index 1.");
        assertEquals(false, robot.isFacingRight(), "Robot should be facing left after moving.");
    }
}
