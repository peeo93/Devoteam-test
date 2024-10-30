package org.example.logic;

import java.util.Objects;

import static org.example.logic.Robot.getFacingDirection;
import static org.example.logic.Robot.updateFaceDir;

public class Direction {

    public static void turnRight() {
        if (Objects.equals(getFacingDirection(), "N")) {
            updateFaceDir("E");
        } else if (Objects.equals(getFacingDirection(), "E")) {
            updateFaceDir("S");
        } else if (Objects.equals(getFacingDirection(), "S")) {
            updateFaceDir("W");
        } else if (Objects.equals(getFacingDirection(), "W")) {
            updateFaceDir("N");
        }
    }

    public static void turnLeft() {
        if (Objects.equals(getFacingDirection(), "N")) {
            updateFaceDir("W");
        } else if (Objects.equals(getFacingDirection(), "W")) {
            updateFaceDir("S");
        } else if (Objects.equals(getFacingDirection(), "S")) {
            updateFaceDir("E");
        } else if (Objects.equals(getFacingDirection(), "E")) {
            updateFaceDir("N");
        }
    }
}
