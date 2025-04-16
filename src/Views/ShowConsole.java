package Views;
import java.util.Scanner;

public class ShowConsole {
    private Scanner sacnner;

    public ShowConsole() {
        this.sacnner = new Scanner(System.in);
        showBanner();
        inputCode();
    }

    public void showBanner(){
        System.out.println("\n/// Metodos de busqueda ///\n");
    }

    public int inputCode(){
        System.out.println("Ingrese un codigo:");
        int code = sacnner.nextInt();
        return code;
    }

    public void showMessage(String message){
        System.out.println(message);
    }
}