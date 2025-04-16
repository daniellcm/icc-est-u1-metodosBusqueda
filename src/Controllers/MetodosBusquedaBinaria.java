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

    public void showPersonByCode() {
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

    private int findPersonaByName(String name) {
        int bajo = 0;
        int alto = personas.length - 1;

        while (alto >= bajo) {
            int central = (alto + bajo) / 2;

            if (personas[central].getName().equals(name)) {
                return central;
            }
            if (personas[central].getName().compareTo(name) > 0) {
                alto = central - 1;
            } else {
                bajo = central + 1;
            }
        }
        return -1;
    }

    public void showPersonaByName() {
        String nameToFind = pantalla.inputName();
        int indexPerson = findPersonaByName(nameToFind);

        if (indexPerson == -1) {
            pantalla.showMessage("Persona con nombre: " + nameToFind + " no encontrada");
        } else {
            pantalla.showMessage("Persona con nombre: " + nameToFind + " encontrada");
            pantalla.showMessage(personas[indexPerson].toString());
        }
    }

}
