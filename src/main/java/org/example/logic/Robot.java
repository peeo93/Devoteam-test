package org.example.logic;

import java.util.Objects;

import static org.example.logic.Room.getDepth;
import static org.example.logic.Room.getWidth;

public class Robot {
    static IndexOutOfBoundsException IndexOutOfBoundsException = new IndexOutOfBoundsException("Position Out of Bounds");
    static StringIndexOutOfBoundsException StringIndexOutOfBoundsException = new StringIndexOutOfBoundsException("String not equal to either N, E, S or W");
    private static int posX, posY;
    private static String facing;

    public static int getPosX() {
        return posX;
    }

    public static int getPosY() {
        return posY;
    }

    public static String getFacingDirection() {
        return facing;
    }

    public static void updatePosX(int x) {
        posX = x;
        try {
            if (posX < 0 || posX > getWidth()) {
                throw IndexOutOfBoundsException;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(
                    e.getMessage() + " Room width: " + getWidth() + " Position X: "+ getPosX());
            System.exit(1);
        }
    }

    public static void updatePosY(int y) {
        posY = y;
        try {
            if (posY < 0 || posY > getDepth()) {
                throw IndexOutOfBoundsException;
            }
        } catch (Exception e) {
            System.out.println(
                    e.getMessage() + " Room depth: " + getDepth() + " Position Y: "+ getPosY());
            System.exit(1);
        }
    }

    public static void setFacingDirection(String F) {
        facing = F;
        try {
            if (!Objects.equals(facing, "N") && !Objects.equals(facing, "E") && !Objects.equals(facing, "S") && !Objects.equals(facing, "W")) {
                throw StringIndexOutOfBoundsException;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + ", Input is: " + getFacingDirection());
            System.exit(1);
        }
    }

    public static String updateFaceDir(String z) {
        return facing = z;
    }
}
