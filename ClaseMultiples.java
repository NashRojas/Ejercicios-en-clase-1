public class ClaseMultiples {
    private String universidad;
    private String semestre;
    private String materiafav;
    private String mensaje;

    public ClaseMultiples(String universidad, String semestre, String materiafav, String mensaje) {
        this.universidad = universidad;
        this.semestre = semestre;
        this.materiafav = materiafav;
        this.mensaje = mensaje;
    }

    public void mostrarMultiples() {
        System.out.println("Universidad: " + universidad);
        System.out.println("Semestre: " + semestre);
        System.out.println("Materia Favorita: " + materiafav);
        System.out.println("Mensaje Motifacional: " + mensaje);
    }
}
