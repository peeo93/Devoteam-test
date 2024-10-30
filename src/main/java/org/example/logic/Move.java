package org.example.logic;

import java.util.Objects;

import static org.example.logic.Direction.turnLeft;
import static org.example.logic.Direction.turnRight;
import static org.example.logic.Robot.*;

public class Move {
    public static void move(String[] arr) {
        for (String s : arr) {
            if (Objects.equals(s, "R")) {
                turnRight();
            } else if (Objects.equals(s, "L")) {
                turnLeft();
            } else if (Objects.equals(s, "F")) {
                String dir = getFacingDirection();
                if (Objects.equals(dir, "N")) {
                    updatePosY(getPosY() - 1);
                } else if (Objects.equals(dir, "E")) {
                    updatePosX(getPosX() + 1);
                } else if (Objects.equals(dir, "S")) {
                    updatePosY(getPosY() + 1);
                } else if (Objects.equals(dir, "W")) {
                    updatePosX(getPosX() - 1);
                }
            }
        }
    }
}
