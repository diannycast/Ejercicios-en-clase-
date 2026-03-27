import java.time.LocalDate; // <-- Fíjate en el cambio aquí

public class Persona {
    public int id;
    public String name;
    public LocalDate nacimiento;
    public String nacionalidad;
    public double altura;
    public double peso;

    public String mostrar() {
        return "ID: " + id + " | Nombre: " + name + " | Nacionalidad: " + nacionalidad;
    }
}
