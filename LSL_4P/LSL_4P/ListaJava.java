import java.util.ArrayList;
import java.util.Scanner;

public class ListaJava {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Opciones:");
            System.out.println("1. Agregar");
            System.out.println("2. Eliminar");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el elemento a agregar:");
                    String elementoAgregar = scanner.next();
                    lista.add(elementoAgregar);
                    break;
                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("La lista está vacía, no hay elementos para eliminar.");
                    } else {
                        String elementoEliminado = lista.remove(lista.size() - 1);
                        System.out.println("Elemento eliminado: " + elementoEliminado);
                    }
                    break;
                case 3:
                    System.out.println("Elementos en la lista:");
                    for (String elemento : lista) {
                        System.out.println(elemento);
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}