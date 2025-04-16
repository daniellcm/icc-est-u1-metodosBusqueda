package Controllers;

import Models.Persona;
import Views.ShowConsole;

public class MetodosBusqueda {
    private ShowConsole showConsole;
    private Persona[] people;

    public MetodosBusqueda(){

    }
    
    public MetodosBusqueda(Persona[] personas){
        showConsole = new ShowConsole();
        this.people = personas;
        showPersona();
    }


    public int busquedaLineal(int[] arr, int num) {
        int tam = arr.length;

        for (int i = 0; i < tam; i++ ) {
            if (arr[i] == num) {
                return i; 
            }
        }
        return -1;
    }

    public void showPersona(){
        int codeToFind = showConsole.inputCode();
        int indexPersona = findPersonaByCode(codeToFind);

        if(indexPersona >= 0){
            showConsole.showMessage("Persona en posicion " + indexPersona + " encontrada.");
            showConsole.showMessage(people[indexPersona].toString());    
        }else{
            showConsole.showMessage("Persona en posicion " + indexPersona + " no encontrada.");
        }
    }

    public  int findPersonaByCode(int code){
        int tam = people.length;

        for (int i = 0; i < tam; i++ ) {
            if (people[i].getCode() == code) {
                return i; 
            }
        }
        return -1;
    }

    public void imprimirArreglo(int[] arreglo){
        int tam = arreglo.length;
    
        for(int i = 0; i < tam; i ++){   
            System.out.print( arreglo[i] + " / ");
        }
        System.out.println();
    }
}