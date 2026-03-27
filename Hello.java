import java.util.Scanner;

public class Hello {
    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESA TU NOMBRE");
        String name = leer.nextLine();

        System.out.println(name + " HOLA EN JAVA DESDE CONSOLA");
        System.out.println(name + " INGRESA UN NUMERO PARA LA TM ");
        byte numero;
        numero = leer.nextByte();
        System.out.println("La tabla del " + numero + " es: ");
        byte i = 0;
        while (numero >= i) {
            System.out.println(numero + " X " + i + " = " + (numero * i));
            i = (byte) (i + 1);
        }
    }
}