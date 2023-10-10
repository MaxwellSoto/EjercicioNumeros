package ejercicionumeros;

/**
 * @author Maswell
 */
import java.util.Scanner;

public class EjercicioNumeros {

    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int opcion;
        int res = 0;
        char operacion = '.';

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al Sistema");

        System.out.println("Ingrese un valor");

        a = sc.nextInt();

        System.out.println("Que operación desea realizar? ");

        System.out.println("Por favor, elija una de las opciones: ");

        System.out.println("1. Sumar ");
        System.out.println("2. Restar ");
        System.out.println("3. Multiplicar ");
        System.out.println("4. Dividir ");
        System.out.println("5. Verificación de número primo");

        opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.println("Usted ha elegido la operación Suma");
        } else if (opcion == 2) {
            System.out.println("Usted ha elegido la operación Resta");
        } else if (opcion == 3) {
            System.out.println("Usted ha elegido la operación Multiplicación");
        } else if (opcion == 4) {
            System.out.println("Usted ha elegido la operación División");
        } else if (opcion == 5) {
            System.out.println("Usted ha elegido la operación Verificación de número primo");
        }

        if (opcion
                != 5) {

            System.out.println("Ingrese su Segundo valor ");
            b = sc.nextInt();
        }

        switch (opcion) {
            case 1:
                res = a + b;
                operacion = '+';
                System.out.println(
                "El resultado a la siguiente operación " + a + " " + operacion + " " + b + " es igual a " + res);
                break;

            case 2:
                res = a - b;
                operacion = '-';
                System.out.println(
                "El resultado a la siguiente operación " + a + " " + operacion + " " + b + " es igual a " + res);
                break;

            case 3:
                res = a * b;
                operacion = '*';
                System.out.println(
                "El resultado a la siguiente operación " + a + " " + operacion + " " + b + " es igual a " + res);
                break;

            case 4:
                res = a / b;
                operacion = '/';
                System.out.println(
                "El resultado a la siguiente operación " + a + " " + operacion + " " + b + " es igual a " + res);
                break;

            case 5:
                // El 0, 1 y 4 no son primos 
                if (a == 0 || a == 1 || a == 4) {
                    System.out.println("El 0, 1 y 4 no son primos");
                }

                for (int x = 2; x < a / 2; x++) {
                    // Si es divisible por cualquiera de estos números, no
                    // es primo
                    if (a % x == 0) {
                        System.out.println("El número no es primo");
                    }
                }

                System.out.println("El número sí es primo");

                break;

        }

    }
    
}
