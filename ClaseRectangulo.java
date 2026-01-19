public class ClaseRectangulo {
    private int base;
    private int altura;

    public ClaseRectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public void AreaRectangulo() {
        System.out.println("Como la base es: " + base);
        System.out.println("y la altura es: " + altura);
        System.out.println("El area es base x altura, por lo tanto el resultado es: " + (base * altura));
    }
}
