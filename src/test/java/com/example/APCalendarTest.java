package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class APCalendarTest {

    @Test
    void testNumberOfLeapYears() {
        assertEquals(0, APCalendar.numberOfLeapYears(2001, 2003)); // No leap years
        assertEquals(1, APCalendar.numberOfLeapYears(2000, 2000)); // Year 2000 is a leap year
        assertEquals(2, APCalendar.numberOfLeapYears(1999, 2004)); // Years 2000 and 2004 are leap years
        assertEquals(25, APCalendar.numberOfLeapYears(1900, 2000)); // From 1900 to 2000 (1900 is not a leap year)
    }

    @Test
    void testDayOfWeek() {
        // Assuming Sunday is 0, Monday is 1, ..., Saturday is 6
        assertEquals(6, APCalendar.dayOfWeek(1, 1, 2000)); // January 1, 2000, was a Saturday
        assertEquals(2, APCalendar.dayOfWeek(7, 4, 2000)); // July 4, 2000, was a Tuesday
        assertEquals(5, APCalendar.dayOfWeek(12, 25, 2020)); // December 25, 2020, was a Friday
        assertEquals(1, APCalendar.dayOfWeek(1, 1, 2018)); // January 1, 2018, was a Monday
    }

}

