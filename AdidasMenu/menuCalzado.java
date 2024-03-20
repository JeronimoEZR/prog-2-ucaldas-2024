import java.util.Scanner;
  
class MenuCalzado {
    public static int mostrarMenu() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\nFiltrar Calzado:");
            System.out.println("1. Todos los tennis running de talla 38");
            System.out.println("2. Todos los tennis running que tengan más de 5 colores disponibles");
            System.out.println("3. Todos los tennis running y classic que tengan un precio mayor a 150 dolares");
            System.out.println("4. Todos los tennis running cuyo envio a casa esté disponible");
            System.out.print("Seleccione una opción: ");
            return scanner.nextInt();
        }
    }
}