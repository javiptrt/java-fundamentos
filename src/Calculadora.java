/**
 * clase que almacena operaciones basicas de una calculadora
 */

public class Calculadora {

    /**
     * Suma de dos numeros enteros
     * @param numero1 primer valor de la suma
     * @param numero2 segundo valor de la suma
     * @return resultado de la suma
     */
    int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    /**
     * Resta de dos numeros enteros
     * @param numero1 primer valor de la resta
     * @param numero2 segundo valor de la resta
     * @return resultado de la resta
     */
    int restar(int numero1, int numero2) {
        return numero1 - numero2;
    }

    /**
     * Multiplicacion de dos numeros enteros
     * @param numero1 primer valor de la multiplicacion
     * @param numero2 segundo valor de la multiplicacion
     * @return resultado del valor de la multiplicacion
     */
    int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }

    /**
     * Division de dos números enteros
     * @param numero1 primero valor de la division
     * @param numero2 segundo valor de la division
     * @return resultado del valor de la division
     */
    double dividir(double numero1, double numero2) {
        return numero1 / numero2;
    }

    /**
     * En el main se imprimen los resultados de cada operacion
     */

    void main() {
        System.out.println("La suma: " + sumar(3, 6));
        System.out.println("La resta: " + restar(5, 2));
        System.out.println("La multiplicacion: " + multiplicar(5, 2));
        System.out.println("La division: " + dividir(30, 3));
    }
}
