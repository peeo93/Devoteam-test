package org.example.scanner;

import java.util.Scanner;

public class InputListener {

    /**
     * Input Room size
     * Example: 5 5
     */
    public static void inputRoomSize(Scanner input) {
        input.reset();
        System.out.println("Please input Room size, Example: 5 5");
    }

    /**
     * Input Position and what
     * direction you are facing
     * Example: 1 2 N
     */
    public static void inputStartingPosAndFaceDir(Scanner input) {
        input.reset();
        System.out.println("Please input start position and what direction to face, Example: 1 2 N");
    }

    /**
     * Inpot Navigation Commands
     * Example: RFRFFRFRF
     */
    public static void inputNavCom(Scanner input) {
        input.reset();
        System.out.println("Please enter the navigation commands, Example: RFRFFRFRF");
    }
}
