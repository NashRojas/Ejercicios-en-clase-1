public class ClasePrint {
    private String nombre;
    private int matricula;
    private String carrera;

    public ClasePrint(String nombre, int matricula, String carrera) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Carrera: " + carrera);
    }
}

