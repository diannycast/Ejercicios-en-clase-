import java.util.Scanner;

public class Cuestionario {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Pregunta 1
        System.out.println("¿Cuál es tu nombre?");
        String nombre = leer.nextLine();

        // Pregunta 2
        System.out.println("¿Cuál de estos youtubers prefieres?");
        System.out.println("1. Kika Nieto");
        System.out.println("2. La Divaza");
        System.out.println("3. Pautips");
        int opcion = leer.nextInt();

        // Pregunta 3
        System.out.println("¿Cuál es tu año de nacimiento?");
        int nacimiento = leer.nextInt();
        int edad = 2026 - nacimiento;

        // Resultado
        System.out.println("\n--- RESULTADO ---");
        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");

        if (opcion == 1) {
            System.out.println("Tu estilo se parece al de Kika Nieto.");
        } else if (opcion == 2) {
            System.out.println("Tu estilo se parece al de La Divaza.");
        } else if (opcion == 3) {
            System.out.println("Tu estilo se parece al de Pautips.");
        } else {
            System.out.println("No seleccionaste una opción válida.");
        }

        System.out.println("¡Gracias por responder el cuestionario!");
    }
}