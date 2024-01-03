package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StepTrackerTest {
    @Test
    void testStepTracker() {
        StepTracker tr = new StepTracker(10000);

        // Initially, no data recorded
        assertEquals(0, tr.activeDays(), "Initially, active days should be 0");
        assertEquals(0.0, tr.averageSteps(), "Initially, average steps should be 0.0");

        // Adding steps, days not active yet
        tr.addDailySteps(9000); // Not active
        tr.addDailySteps(5000); // Not active
        assertEquals(0, tr.activeDays(), "No active days after adding 9000 and 5000 steps");
        assertEquals(7000.0, tr.averageSteps(), "Average should be 7000 after adding 9000 and 5000 steps");

        // Adding more steps, 1 active day
        tr.addDailySteps(13000); // Active
        assertEquals(1, tr.activeDays(), "1 active day after adding 13000 steps");
        assertEquals(9000.0, tr.averageSteps(), "Average should be 9000 after adding 13000 steps");

        // Adding more steps, another active day
        tr.addDailySteps(23000); // Active
        tr.addDailySteps(1111);  // Not active
        assertEquals(2, tr.activeDays(), "2 active days after adding 23000 and 1111 steps");
        assertEquals(10222.2, tr.averageSteps(), 0.1, "Average should be approximately 10222.2 steps after all steps");
    }
}
