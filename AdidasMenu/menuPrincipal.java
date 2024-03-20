import java.util.Scanner;

class MenuPrincipal {
    public static int mostrarMenu() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bienvenido al sistema de compras");
            System.out.println("1. Hombre");
            System.out.println("2. Mujer");
            System.out.print("Seleccione una opción: ");
            return scanner.nextInt();
        }
    }
}