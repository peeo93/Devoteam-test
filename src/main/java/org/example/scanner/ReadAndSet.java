package org.example.scanner;

import java.util.Scanner;

import static org.example.logic.Move.move;
import static org.example.logic.Robot.*;
import static org.example.logic.Room.setDepth;
import static org.example.logic.Room.setWidth;

public class ReadAndSet {

    /**
     * Read and Set Room size
     */
    public static void readAndSetRoomSize(Scanner input) {
        setWidth(input.nextInt());
        setDepth(input.nextInt());
    }

    /**
     * Read and Set startingPosition and facingDirection
     */
    public static void readAndSetStartingPosAndFaceDir(Scanner input) {
        updatePosX(input.nextInt());
        updatePosY(input.nextInt());
        setFacingDirection(input.next());
    }

    /**
     * Read, Calculate new Pos
     */
    public static void readAndCalcFinalPos(Scanner input) {
        String in = input.next();
        String[] arr = in.split("(?<=.)");
        move(arr);
    }
}
