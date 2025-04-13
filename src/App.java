import java.util.Scanner;

public class App {
    MetodosBusqueda metodosBusqueda = new MetodosBusqueda();

    public static void main(String[] args) {
        App app = new App(); 

        Scanner sc = new Scanner(System.in);
        int[] arreglo = {22, 4, 99, 40, 42};

        System.out.print("Ingresa el número a buscar: ");
        int objetivo = sc.nextInt();

        int resultado = app.metodosBusqueda.busquedaLineal(arreglo, objetivo);

        if (resultado != -1) {
            System.out.println("Elemento encontrado en el indice - " + resultado);
        } else {
            System.out.println("No se encontro el elemento");
        }

        sc.close();
    }
}
