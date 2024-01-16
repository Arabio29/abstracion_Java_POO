public abstract class Miembro {

    //variables
    private String nombre;
    private String cargo;
    private int edad;
    private int horasTrabajadas;

    //constructor
    public Miembro(String nombre, String cargo, int edad, int horasTrabajadas) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.edad = edad;
        this.horasTrabajadas = horasTrabajadas;
    }

    //toString para mostrar la infrmacion
    public String mostrarInformacion(String nombre, String cargo, int edad, int horasTrabajadas) {
        return "Miembro{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", edad=" + edad +
                ", horasTrabajadas=" + horasTrabajadas +
                '}';
    }

    public abstract int calcularSalario();

}
