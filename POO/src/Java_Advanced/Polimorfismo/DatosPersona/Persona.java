package Java_Advanced.Polimorfismo.DatosPersona;

public class Persona {

    public static void main(String []args) {

        Informacion identificaion = new DatosIdentificacionDos();
        identificaion.pedirDatos();
        identificaion.mostrarInformacion();
        identificaion.mostrarIdentificacion();

        Informacion identificacion = new DatosIdentificacionUno();
        identificaion.pedirDatos();
        identificaion.mostrarInformacion();
        identificaion.mostrarIdentificacion();

    }
}
