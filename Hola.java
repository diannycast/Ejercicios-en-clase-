import java.util.Scanner;

public class Hola {

    // Método que devuelve un mensaje con la cantidad de letras
    public static String resultado(int cantidad) {
        return "Tu nombre tiene " + cantidad + " letras.";
    }

    // Método que cuenta la longitud del nombre
    public static int contando(String name) {
        return name.length();
    }

    // Método que convierte a mayúsculas y concatena un saludo
    public static String mayus(String name) {
        return name.toUpperCase().concat(" BIENVENIDE");
    }

    // Método que imprime la suma
    public static void otraSuma(int a, int b) {
        System.out.println("El resultado es: " + (a + b));
    }

    // Método que retorna la suma
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método principal para probar
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = leer.nextLine();

        // Usamos los métodos
        System.out.println(resultado(contando(nombre)));
        System.out.println(mayus(nombre));

        System.out.println("Ingrese dos números para sumar:");
        int x = leer.nextInt();
        int y = leer.nextInt();

        otraSuma(x, y);
        System.out.println("La suma retornada es: " + sumar(x, y));
    }
}