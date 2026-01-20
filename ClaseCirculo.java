public class ClaseCirculo {
    private double radio;
    final double PI = 3.14159;

    public ClaseCirculo(double radio) {
        this.radio = radio;
    }

    public void calcularArea() {
        double area = PI * (radio * radio);
        System.out.println("Como el radio es: " + radio);
        System.out.println("El area es π × r², por lo tanto el resultado es: " + area);
    }

    public void calcularPerimetro() {
        double perimetro = 2 * PI * radio;
        System.out.println("El perimetro es 2 × π × r, por lo tanto el resultado es: " + perimetro);
    }
}

