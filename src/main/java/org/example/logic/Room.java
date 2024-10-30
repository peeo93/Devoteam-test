package org.example.logic;

public class Room {
    static Exception IndexOutOfBoundsException = new IndexOutOfBoundsException("Index Out of Bounds");
    private static int width;
    private static int depth;

    public static int getWidth() {
        return width;
    }

    public static int getDepth() {
        return depth;
    }

    public static void setWidth(int x) {
       width = x - 1;
        try {
            if (width <= 0 || width >= 10) {
                throw IndexOutOfBoundsException;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }

    public static void setDepth(int y) {
        depth = y - 1;
        try {
            if (depth <= 0 || depth >= 10) {
                throw IndexOutOfBoundsException;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}
