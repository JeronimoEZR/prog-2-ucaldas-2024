import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Calzado> calzados = new ArrayList<>();
        // Agregar algunos productos de ejemplo
        calzados.add(new Calzado("Zapatillas de Running", 99.99, "foto1.jpg", "38", "Negro", true));
        calzados.add(new Calzado("Zapatillas de Running", 149.99, "foto2.jpg", "38", "Blanco", true));
        calzados.add(new Calzado("Zapatillas Classic", 199.99, "foto3.jpg", "38", "Azul", false));
        calzados.add(new Calzado("Zapatillas de Running", 159.99, "foto4.jpg", "39", "Rojo", true));
        calzados.add(new Calzado("Zapatillas de Running", 169.99, "foto5.jpg", "38", "Verde", true));
        calzados.add(new Calzado("Zapatillas Classic", 129.99, "foto6.jpg", "37", "Blanco", true));

        int opcionPrincipal = MenuPrincipal.mostrarMenu();

        switch (opcionPrincipal) {
            case 1:
                MenuCalzado.mostrarMenu();
                // Lógica para manejar las opciones de filtrado para hombre
                break;
            case 2:
                MenuCalzado.mostrarMenu();
                // Lógica para manejar las opciones de filtrado para mujer
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}