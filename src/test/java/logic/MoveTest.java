package logic;

import org.example.logic.Move;
import org.example.logic.Robot;
import org.example.logic.Room;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoveTest {
    String[] arrR = {"R"};
    String[] arrL = {"L"};
    String[] arrF = {"F"};

    @BeforeEach
    void setUp(TestInfo testInfo) {
        System.out.println("Running test: " + testInfo.getDisplayName());
    }

    @Test
    void testMove() {
        try {
            Room.setDepth(5);
            Robot.setFacingDirection("N");
            Robot.updatePosY(3);
            Move.move(arrF);
            assertEquals(2, Robot.getPosY());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void testMoveRight() {
        try {
            Robot.setFacingDirection("N");
            Move.move(arrR);
            assertEquals("E", Robot.getFacingDirection());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void testMoveLeft() {
        try {
            Robot.setFacingDirection("W");
            Move.move(arrL);
            assertEquals("S", Robot.getFacingDirection());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
