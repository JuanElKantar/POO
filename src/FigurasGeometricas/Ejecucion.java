package FigurasGeometricas;
import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        float lado, base, altura, radio;
        int escoge, i=1;
        Scanner Lectura = new Scanner(System.in);

        do {
            System.out.println("Digita el número correspondiente a la figura para calcular el área");
            System.out.println("1 para RECTÁNGULO");
            System.out.println("2 para TRIÁNGULO");
            System.out.println("3 para CÍRCULO");
            escoge = Lectura.nextInt();

            if (escoge == 1) {
                System.out.println("Ingrese el valor de la base del rectángulo");
                base = Lectura.nextFloat();
                System.out.println("Ingrese el valor de la altura del rectángulo");
                altura = Lectura.nextFloat();
                Rectangulo rect = new Rectangulo(base, altura);
                rect.calcularArea();
            } else if (escoge == 2) {
                System.out.println("Ingrese el valor de la base del triángulo");
                base = Lectura.nextFloat();
                System.out.println("Ingrese el valor de la altura del triángulo");
                altura = Lectura.nextFloat();
                Triangulo tri = new Triangulo(base, altura);
                tri.calcularArea();
            } else if (escoge == 3) {
                System.out.println("Ingrese el valor del radio del círculo");
                radio = Lectura.nextFloat();
                Circulo cir = new Circulo(radio);
                cir.calcularArea();
            }
            
            System.out.println("¿Desea calcular el área de otra figura geométrica? Digite 1 para Sí o cualquier otro número para No");
            i = Lectura.nextInt();
        } while (i == 1);

        System.out.println("Ya calculaste el area");
    }
}
