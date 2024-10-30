package org.example;

import java.util.Scanner;

import static org.example.logic.Robot.*;
import static org.example.scanner.InputListener.*;
import static org.example.scanner.ReadAndSet.*;

public class Main {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean gameIsOngoing = true;

        while(gameIsOngoing) {

            inputRoomSize(input);
            readAndSetRoomSize(input);

            inputStartingPosAndFaceDir(input);
            readAndSetStartingPosAndFaceDir(input);

            inputNavCom(input);
            readAndCalcFinalPos(input);

            printReport();

            gameIsOngoing = false;
        }
        input.close();
    }

    /**
     * Print Report
     */
    public static void printReport() {
        System.out.println("Report: " + getPosX() + " " + getPosY() + " " + getFacingDirection());
    }
}