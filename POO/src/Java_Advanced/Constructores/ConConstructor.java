package Java_Advanced.Constructores;

import java.util.Scanner;

public class ConConstructor
{
   public ConConstructor()
   {
       Scanner entrada = new Scanner(System.in);
       String nombre = "";

       System.out.println("¿Cuál es tú nombre?");
       nombre = entrada.nextLine();
       System.out.println("Tú nombre es: " + nombre);
   }
}
