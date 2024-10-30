package logic;

import Util.NoExitSecurityManager;
import org.example.logic.Robot;
import org.example.logic.Room;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotTest {

    private SecurityManager originalSecurityManager;

    @BeforeEach
    void setup(TestInfo testInfo) {
        System.out.println("Running test: " + testInfo.getDisplayName());

        originalSecurityManager = System.getSecurityManager();

        System.setSecurityManager(new NoExitSecurityManager());
    }

    @AfterEach
    void teardown() {
        System.setSecurityManager(originalSecurityManager);
    }

    @Test
    void testSetAndGetPosX() {
        try {
            Room.setWidth(5);
            Robot.updatePosX(4);
            assertEquals(4, Robot.getPosX());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void testPosXOutOfBounds() {
     try {
         Robot.updatePosX(13);
     } catch (NoExitSecurityManager.ExitException e) {
         assertEquals(1, e.getStatus());
     }
    }

    @Test
    void testNegativeValueOfPosX() {
        try {
            Robot.updatePosX(-3);
        } catch (NoExitSecurityManager.ExitException e) {
            assertEquals(1, e.getStatus());
        }
    }

    @Test
    void testNonUsableFaceDir() {
        try {
            Robot.setFacingDirection("H");
        }  catch (NoExitSecurityManager.ExitException e) {
            assertEquals(1, e.getStatus());
        }
    }
}
