public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 38;
        cliente.nombre = "Fercho";
        cliente.telefono = 950170583;
        cliente.credito = 50000;

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 23;
        trabajador.nombre = "Carlos";
        trabajador.telefono = 28884847;
        trabajador.salario = 800;

        System.out.println("Hola mi edad es " + cliente.edad + " años");
        System.out.println("Me llamo " + cliente.nombre );
        System.out.println("Mi telefono es " + cliente.telefono );
        System.out.println("Tengo un credito de " + cliente.credito + " soles");

        System.out.println("Hola mi edad es " + trabajador.edad + " años");
        System.out.println("Me llamo " + trabajador.nombre );
        System.out.println("Mi telefono es " + trabajador.telefono );
        System.out.println("Cobro un salario de " + trabajador.salario + " soles");




    }
}

class Persona{

    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{

    int credito;
}
class Trabajador extends Persona{

    int salario;
}