import java.util.Scanner;

/**
 * Small console/UI helper utilities: clearing the screen, printing a
 * consistent header/footer around every menu, a startup banner, and a
 * "press enter to continue" pause between operations.
 *
 * Note: Java itself cannot control the terminal screen directly. clearScreen()
 * shells out to the OS's own clear command (cls on Windows, clear on Linux/Mac).
 * If that isn't available (e.g. some IDE consoles or non-interactive terminals),
 * it silently falls back to an ANSI escape sequence, which works in most
 * terminals such as the VS Code integrated terminal and Linux terminals.
 */
public class ConsoleUtils {

    public static void clearScreen() {
        try{
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        }catch (Exception e){
            // Fallback: ANSI escape codes
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }

    // One-time splash banner shown when the program starts.
    public static void banner() {
        System.out.println("==================================================");
        System.out.println("           UNIVERSITY MANAGEMENT SYSTEM");
        System.out.println("==================================================");
        System.out.println();
        System.out.println("                ---------------");
        System.out.println("               |  Developed by |");
        System.out.println("               |    Anik Sen   |");
        System.out.println("               | ID: 232-15-776|");
        System.out.println("                ---------------");
        System.out.println();
    }

    // Compact header printed at the top of every menu screen.
    public static void header(String title) {
        System.out.println("========================================");
        System.out.println("      " + title);
        System.out.println("========================================");
    }

    // Footer printed under every menu screen, re-drawn on every refresh
    // so it always appears "stuck" to the bottom of the visible menu.
    public static void footer() {
        System.out.println("----------------------------------------");
        System.out.println("Developed by Anik Sen");
        System.out.println("----------------------------------------");
    }

    public static void pause(Scanner sc) {
        System.out.print("\nPress Enter to continue...");
        sc.nextLine();
    }
}