package Util;

import java.util.Scanner;

public class ScannerListener {
    private static Scanner scanner;

    public static Scanner getUserInput() {
        scanner = new Scanner(System.in);
        return scanner;
    }
}
