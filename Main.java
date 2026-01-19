public class Main {

    public static void main(String[] args) {
        // Ejercicio 1.1 >>>
        System.out.println("");
        System.out.println("Ejercicio 1.1");
        ClasePrint datos = new ClasePrint("nash juan", 10004129, "Ingeniería en Sistemas");
        datos.mostrarDatos(); 

        // Ejercicio 1.2 >>
        /* el codigo de mas arriba para ser un ejercicio 'simple' decidi clearle una clase. 
        y dentro de esa clase decidi crearle una funcion llamada mostrar datos.
         */

        /** la clase ClasePrint no hace mas que establecer los datos que recibira, usar un constructor, 
        y una funcion dedicada a Imprimir los datos que va a recibir en el Main instanciando primero la clase 
        y luego agregando los datos. */

        // Ejercicio 1.3

        /* 
        public class Ejercicio {
            public static void main(String[] args) {
                System.out.println("Hola") <<<< esta linea falta el ';'
                system.out.println("Mundo"); <<<<< el system.out.println esta mal escrito debe ser con la S mayuscula.
                int numero = "10"; <<< en este caso el usar las "" esta intentando asignar un String a la variable int         
            }
        }
        */ 

        // Ejercicio 1.4
        System.out.println("");
        System.out.println("Ejercicio 1.4");
        ClaseRectangulo rectangulo = new ClaseRectangulo(5, 3);
        rectangulo.AreaRectangulo();

    }
}
