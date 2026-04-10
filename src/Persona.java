public class Persona {

    //Atributos
    String nombre;
    int edad;
    String profesion;

    //Metodos
    void presentarse() {
        System.out.println("Hola, me llamo " + nombre + " tengo " + edad + " años, y soy " + profesion);
    }

    Persona(String nombre, int edad, String profesion){
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
    }

    public static void main(String[] args){
        Persona hombre = new Persona("Javi",37,"Programador");
        hombre.presentarse();
        Persona mujer = new Persona("Phoebe",25, "masajista");
        mujer.presentarse();
    }

}
