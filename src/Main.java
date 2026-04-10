//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//Metodos
void saludar() {
    int edad = 37;
    String nombre = "Javi";
    System.out.println("Hola mi nombre es " + nombre + " y tengo " + edad + " años");
}

//Metodos con parámetros
double calcularDescuento(int precio, double descuento) {
    return precio - (precio * descuento / 100);
}

void main() {

    //Variables e imprimir por consola
    String nombre = "Javi";
    char inicial = 'J';
    int edad = 37;
    double salarioDeseado = 70000;
    double altura = 1.84;
    boolean meGustaProgramar = true;

    System.out.println("Nombre : " + nombre);
    System.out.println("Inicial nombre : " + inicial);
    System.out.println("Edad : " + edad);
    System.out.println("Altura : " + altura);
    System.out.println("Salario deseado : " + salarioDeseado);
    System.out.println("Le gusta programar : " + meGustaProgramar);


    //Operadores
    int precio = 300;
    int descuento = 15;
    int precioFinal = precio - (precio * descuento / 100);

    System.out.println("El precio del producto es " + precio + " y tiene un descuento de " + descuento + "%" + " por lo tanto el precio total es de " + precioFinal);
    System.out.println(" ");

    //Condicionales
    if ( precioFinal < 200){
        System.out.println("Oferta");
    } else {
        System.out.println("Precio Normal");
    }

    System.out.println(" ");

    int temperatura = 36;

    if (temperatura > 25) {
        System.out.println("Calor");
    } else if (temperatura >= 16 && temperatura <= 25){
        System.out.println("Agradable");
    } else if (temperatura >= 0 && temperatura <= 15){
        System.out.println("Frio");
    } else {
        System.out.println("Bajo cero");
    }

    //Bucles
    for ( int i = 1; i <= 10; i++){
        if (i % 2 == 0){
            System.out.println(i + " Es par");
        } else
            System.out.println(i + " Es impar");
    }

    saludar();
    calcularDescuento(30, 15);
    calcularDescuento(300,50);
    double resultado = calcularDescuento(48,10);
    System.out.println("El resultado es: " + resultado);

}
