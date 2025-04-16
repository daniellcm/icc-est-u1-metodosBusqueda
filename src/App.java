import Controllers.MetodosBusquedaLineal;
import Controllers.MetodosBusquedaBinaria;
import Models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n---- Programa funcionando ----\n");

        Persona[] personas = new Persona[7];
        personas[0] = new Persona(101, "Juan");
        personas[1] = new Persona(105, "Maria");
        personas[2] = new Persona(103, "Carlos");
        personas[3] = new Persona(107, "Ana");
        personas[4] = new Persona(102, "Luis");
        personas[5] = new Persona(106, "Sofia");
        personas[6] = new Persona(104, "Pedro");

        // MetodosBusquedaLineal mB = new MetodosBusquedaLineal(personas);
        MetodosBusquedaBinaria mBB = new MetodosBusquedaBinaria(personas);
        mBB.showPersonByName();

    }
}