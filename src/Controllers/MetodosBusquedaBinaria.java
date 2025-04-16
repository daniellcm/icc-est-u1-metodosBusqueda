package Controllers;

import Models.Persona;
import Views.ShowConsole;

public class MetodosBusquedaBinaria {
    private Persona[] personas;
    private ShowConsole pantalla;

    public MetodosBusquedaBinaria(Persona[] personas) {
        this.personas = personas;
        this.pantalla = new ShowConsole();
        pantalla.showMessage("Metodo de busqueda final ");
    }

    public int findPersonByCode(int code) {
        int bajo = 0;
        int alto = personas.length - 1;

        while (alto >= bajo) {
            int central = (bajo + alto) / 2;

            if (personas[central].getCode() == code) {
                return central;
            }
            if (personas[central].getCode() < code) {
                bajo = central - 1; // izq
            } else {
                alto = central + 1; // der
            }
        }
        return -1;
    }

    public void showPersonByName() {
        int codeToFinde = pantalla.inputCode();
        int indexPerson = findPersonByCode(codeToFinde);
        if (indexPerson == -1) {
            pantalla.showMessage("Persona con codigo "
                    + codeToFinde + " no encontrada");
        } else {
            pantalla.showMessage("Persona con codigo "
                    + codeToFinde + " encontrada: " + personas[indexPerson].getName());
        }
    }

}
