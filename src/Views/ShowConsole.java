package Views;

import java.util.Scanner;

public class ShowConsole {
    private Scanner scanner;

    public ShowConsole() {
        this.scanner = new Scanner(System.in);
        showBanner();
    }

    public void showBanner() {
        System.out.println("\n/// Metodos de busqueda ///\n");
    }

    public int inputCode() {
        System.out.println("Ingrese un codigo:");
        return scanner.nextInt();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
