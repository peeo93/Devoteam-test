package logic;

import org.example.logic.Room;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoomTest {

    @BeforeEach
    void setUp(TestInfo testInfo) {
        System.out.println("Running test: " + testInfo.getDisplayName());
    }

    @Test
    void testSetAndGetWidth() {
        try {
            Room.setWidth(5);
            assertEquals(4, Room.getWidth());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void testSetAndGetDepth() {
        try {
            Room.setDepth(5);
            assertEquals(4, Room.getDepth());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
