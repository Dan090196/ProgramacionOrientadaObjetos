package Java_Advanced.Polimorfismo.DatosPersona;

import java.util.Scanner;

public abstract class Informacion {

    protected String nacionalidad,genero,idioma,id, pasaporte;

    Scanner entrada = new Scanner(System.in);


    public void pedirDatos()
    {
        System.out.println("Escribe tu nacionalidad: ");
        nacionalidad = entrada.nextLine();

        System.out.println("Escribe tu Genero: ");
        genero = entrada.nextLine();

        System.out.println("Escribe tu Idioma: ");
        idioma = entrada.nextLine();
    }
    public abstract void mostrarInformacion();
    public void mostrarIdentificacion()
    {
        //mostrar la identidad
        System.out.println("Identificacion:  "+ id + "\n Nacionalidad: " + nacionalidad + "\n Genero: " + genero +"\n Idioma: " + idioma);
        //System.out.println("Una persona de nacionalidad " + nacionalidad + " profesa una religion "+ religion+ " y su idioma es "+ idioma);
    }
}
