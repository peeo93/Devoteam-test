import Util.ScannerListener;
import org.example.scanner.ReadAndSet;
import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.example.logic.Robot.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainE2ETest {
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
    void testE2E() {
        System.out.println();
        String simulateInput = "5 5";
        System.out.println("ReadAndSetRoomSize by Scanner will be tested with simulated Input: " + simulateInput);
        System.setIn(new ByteArrayInputStream(simulateInput.getBytes()));
        ReadAndSet.readAndSetRoomSize(ScannerListener.getUserInput());

        simulateInput = "1 2 N";
        System.out.println("ReadAndSetStartingPosAndFaceDir by Scanner will be tested with simulated Input: " + simulateInput);
        System.setIn(new ByteArrayInputStream(simulateInput.getBytes()));
        ReadAndSet.readAndSetStartingPosAndFaceDir(ScannerListener.getUserInput());

        simulateInput = "RFRFFRFRF";
        System.out.println("ReadAndSetStartingPosAndFaceDir by Scanner will be tested with simulated Input: " + simulateInput);
        System.setIn(new ByteArrayInputStream(simulateInput.getBytes()));
        ReadAndSet.readAndCalcFinalPos(ScannerListener.getUserInput());

        assertEquals("Report: 1 3 N", "Report: " + getPosX() + " " + getPosY() + " " + getFacingDirection());
    }
}
