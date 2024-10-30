package scanner;

import Util.ScannerListener;
import org.example.logic.Robot;
import org.example.logic.Room;
import org.example.scanner.ReadAndSet;
import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadAndSetTest {
    private static final InputStream originalIn = System.in;

    @BeforeEach
    void setUp(TestInfo testInfo) {
        System.out.println("Running test: " + testInfo.getDisplayName());
    }

    @AfterAll
    static void teardown() {
        System.setIn(originalIn);
    }

    @Test
    void testReadAndSetRoomSize() {
        String simulateInput = "5 5";
        System.out.println("ReadAndSetRoomSize by Scanner will be tested with simulated Input: " + simulateInput);

        System.setIn(new ByteArrayInputStream(simulateInput.getBytes()));
        ReadAndSet.readAndSetRoomSize(ScannerListener.getUserInput());

        assertEquals(4, Room.getWidth());
        assertEquals(4, Room.getDepth());
    }

    @Test
    void testReadAndSetStartingPosAndFaceDir() {
        Room.setWidth(5);
        Room.setDepth(5);
        String simulateInput = "1 2 N";
        System.out.println("ReadAndSetStartingPosAndFaceDir by Scanner will be tested with simulated Input: " + simulateInput);

        System.setIn(new ByteArrayInputStream(simulateInput.getBytes()));
        ReadAndSet.readAndSetStartingPosAndFaceDir(ScannerListener.getUserInput());

        assertEquals(1, Robot.getPosX());
        assertEquals(2, Robot.getPosY());
        assertEquals("N", Robot.getFacingDirection());
    }
}
