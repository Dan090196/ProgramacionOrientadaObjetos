package Java_Advanced.Constructores;

import java.util.Scanner;

public class SinConstructor
{
    private Scanner entrada = new Scanner(System.in);
    String nombre = "";

    // ***** DECLARACIÓN DE MÉTODOS *****
    public void PedirNombre()
    {
        System.out.println("¿Cuál es tú nombre?");
        nombre = entrada.nextLine();
    }

    public void imprimir()
    {
        System.out.println("Tú nombre es: " + nombre);
    }

}
