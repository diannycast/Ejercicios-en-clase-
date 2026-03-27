import java.time.LocalDate; 

public class Futbol {
    public static void main(String args[]) {
        Persona p1 = new Persona();
        // Nota: Usa 3 y 2 en lugar de 03 y 02 para evitar confusiones de formato
        p1.nacimiento = LocalDate.of(1950, 3, 2); 
        p1.name = "Maduro";
        p1.id = 1;
        p1.nacionalidad = "Venezuela";
        p1.altura = 1.93;
        p1.peso = 81.3;

        Persona p2 = new Persona();
        p2.name = "Mencho";
        p2.id = 2;
        p2.nacionalidad = "Mexico";

        Persona p3 = new Persona();
        p3.name = "Ayatola";
        p3.id = 3;
        p3.nacionalidad = "Iran";

        System.out.println(p1.mostrar());
        System.out.println(p2.mostrar());
        System.out.println(p3.mostrar());
    }
}