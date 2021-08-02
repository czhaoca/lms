package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LeaseRecordTest {
    private LeaseRecord testLeaseRecord;
    private Property testProperty;
    private String testStartDate = "01/01/2020";
    private String testEndDate = "12/31/2021";

    @BeforeEach
    public void setUp() {
        testProperty = new Property("PropertyA", "LandlordA");
        testLeaseRecord = new LeaseRecord(1,1,testStartDate,testEndDate,1000);
    }

    @Test
    void testConstructor() {
        assertEquals(1,testLeaseRecord.getLeasePropId());
        assertEquals(testStartDate,testLeaseRecord.getStartDate());
        assertEquals(testEndDate,testLeaseRecord.getEndDate());
        assertTrue(testLeaseRecord.isCurrent());
    }

    @Test
    void generalTests() {
        assertEquals(1000,testLeaseRecord.getRentAmt());
        assertEquals(testStartDate,testLeaseRecord.getStartDate());
        assertEquals(testEndDate,testLeaseRecord.getEndDate());
        assertEquals(1,testLeaseRecord.getLeasePropId());
    }

    @Test
    void testPropertyOperatingStatus() {
        testLeaseRecord.setLeaseInactive();
        assertFalse(testLeaseRecord.isCurrent());

        testLeaseRecord.setLeaseActive();
        assertTrue(testLeaseRecord.isCurrent());
    }

}