package logic;

import org.example.logic.Direction;
import org.example.logic.Robot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirectionTest {

    @BeforeEach
    void setUp(TestInfo testInfo) {
        System.out.println("Running test: " + testInfo.getDisplayName());
    }

    @Test
    void testTurnRight() {
        Robot.setFacingDirection("N");
        Direction.turnRight();
        assertEquals("E", Robot.getFacingDirection());
    }

    @Test
    void testTurnLeft() {
        Robot.setFacingDirection("W");
        Direction.turnLeft();
        assertEquals("S", Robot.getFacingDirection());
    }

    /**
     * All possible turns could be tested
     */
}
