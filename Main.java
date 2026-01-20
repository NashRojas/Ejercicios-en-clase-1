import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Ejercicio 1.1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        System.out.println("");
        System.out.println("Ejercicio 1.1");
        ClasePrint datos = new ClasePrint("nash juan", 10004129, "Ingeniería en Sistemas");
        datos.mostrarDatos(); 

        // Ejercicio 1.2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        /* el codigo de mas arriba para ser un ejercicio 'simple' decidi clearle una clase. 
        y dentro de esa clase decidi crearle una funcion llamada mostrar datos.
         */

        /** la clase ClasePrint no hace mas que establecer los datos que recibira, usar un constructor, 
        y una funcion dedicada a Imprimir los datos que va a recibir en el Main instanciando primero la clase 
        y luego agregando los datos. */

        // Ejercicio 1.3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        /* 
        public class Ejercicio {
            public static void main(String[] args) {
                System.out.println("Hola") <<<< esta linea falta el ';'
                system.out.println("Mundo"); <<<<< el system.out.println esta mal escrito debe ser con la S mayuscula.
                int numero = "10"; <<< en este caso el usar las "" esta intentando asignar un String a la variable int         
            }
        }
        */ 

        // Ejercicio 1.4 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        System.out.println("");
        System.out.println("Ejercicio 1.4");
        ClaseRectangulo rectangulo = new ClaseRectangulo(5, 3);
        rectangulo.AreaRectangulo();


        // Ejercicio 1.5 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        System.out.println("");
        System.out.println("Ejercicio 1.5");
        ClaseMultiples multiples = new ClaseMultiples("ucne", "2026-1", "Programacion 3 o Arquitectura del computador" , "Nunca te rindas");
        multiples.mostrarMultiples();

        // cap 2

        // Ejercicio 2.1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        System.out.println("");
        System.out.println("Ejercicio 2.1");
        byte ejemploByte = 127;
        short ejemploShort = 32000;
        int ejemploInt = 100000;
        long ejemploLong = 1000000L;
        float ejemploFloat = 3.14f;
        double ejemploDouble = 3.141592;
        char ejemploChar = 'A';
        boolean ejemploBoolean = true;

        System.out.println("byte: " + ejemploByte);
        System.out.println("short: " + ejemploShort);
        System.out.println("int: " + ejemploInt);
        System.out.println("long: " + ejemploLong);
        System.out.println("float: " + ejemploFloat);
        System.out.println("double: " + ejemploDouble);
        System.out.println("char: " + ejemploChar);
        System.out.println("boolean: " + ejemploBoolean);
        
        // Ejercicio 2.2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        System.out.println("");
        System.out.println("Ejercicio 2.2");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicacion: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulo: " + (num1 % num2));

        // Ejercicio 2.3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        System.out.println("");
        System.out.println("Ejercicio 2.3");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.print("Elige una opcion: ");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.print("Ingresa Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println("Fahrenheit: " + fahrenheit);
        } else if (opcion == 2) {
            System.out.print("Ingresa Fahrenheit: ");
            double fahrenheit = sc.nextDouble();
            double celsius = (fahrenheit - 32) * 5/9;
            System.out.println("Celsius: " + celsius);
        }

        // Ejercicio 2.4 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        System.out.println("");
        System.out.println("Ejercicio 2.4");
        System.out.print("Ingresa el radio del circulo: ");
        double radio = sc.nextDouble();
        ClaseCirculo circulo = new ClaseCirculo(radio);
        circulo.calcularArea();
        circulo.calcularPerimetro();

        // ejercicio 2.5 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        System.out.println("");
        System.out.println("Ejercicio 2.5");
        
        // Conversion implicita (tipo int a double)
        int entero = 10;
        double decimal = entero;  
        System.out.println("Conversion implicita:");
        System.out.println("Entero: " + entero + ", Decimal: " + decimal);
        
        // Conversion explicita (tipo double a int)
        double d = 9.7;
        int i = (int) d;  
        System.out.println("Conversion explicita:");
        System.out.println("Double: " + d + ", Int: " + i);
        
        // Capitulo 3

        //Ejercicio 3.1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        System.out.println("");
        System.out.println("Ejercicio 3.1");
        System.out.print("Ingresa la calificacion (0-100): ");
        double calificacion = sc.nextDouble();
        
        char letra;
        if (calificacion >= 90 && calificacion <= 100) {
            letra = 'A';
        } else if (calificacion >= 80) {
            letra = 'B';
        } else if (calificacion >= 70) {
            letra = 'C';
        } else if (calificacion >= 60) {
            letra = 'D';
        } else {
            letra = 'F';
        }
        
        System.out.println("Calificacion en letra: " + letra);
        
        if (calificacion >= 70) {
            System.out.println("El estudiante APROBO");
        } else {
            System.out.println("El estudiante REPROBO");
        }
        
        // Ejercicio 3.2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        System.out.println("");
        System.out.println("Ejercicio 3.2");
        
        int option;
        do {
            // Mostrar menú
            System.out.println("\n=== Calculadora Menu ===");
            System.out.println("1. Sumar dos numeros");
            System.out.println("2. Restar dos numeros");
            System.out.println("3. Multiplicar dos numeros");
            System.out.println("4. Dividir dos numeros");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion (1-5): ");
            option = sc.nextInt();
            
            switch (option) {
                case 1:
                    System.out.print("Ingresa el primer numero: ");
                    double numero1 = sc.nextDouble();
                    System.out.print("Ingresa el segundo numero: ");
                    double numero2 = sc.nextDouble();
                    System.out.println("Resultado: " + numero1 + " + " + numero2 + " = " + (num1 + num2));
                    break;
                    
                case 2:
                    System.out.print("Ingresa el primer numero: ");
                    double num3 = sc.nextDouble();
                    System.out.print("Ingresa el segundo numero: ");
                    double num4 = sc.nextDouble();
                    System.out.println("Resultado: " + num3 + " - " + num4 + " = " + (num3 - num4));
                    break;
                    
                case 3:
                    System.out.print("Ingresa el primer numero: ");
                    double num5 = sc.nextDouble();
                    System.out.print("Ingresa el segundo numero: ");
                    double num6 = sc.nextDouble();
                    System.out.println("Resultado: " + num5 + " * " + num6 + " = " + (num5 * num6));
                    break;
                    
                case 4:
                    System.out.print("Ingresa el primer numero: ");
                    double num7 = sc.nextDouble();
                    System.out.print("Ingresa el segundo numero: ");
                    double num8 = sc.nextDouble();
                    if (num8 != 0) {
                        System.out.println("Resultado: " + num7 + " / " + num8 + " = " + (num7 / num8));
                    } else {
                        System.out.println("Error: No se puede dividir por cero");
                    }
                    break;
                    
                case 5:
                    System.out.println("¡Gracias por usar la calculadora! Hasta luego.");
                    break;
                    
                default:
                    System.out.println("Opcion no valida. Por favor elige una opcion del 1 al 5.");
            }
        } while (option != 5);
        
    }
}
