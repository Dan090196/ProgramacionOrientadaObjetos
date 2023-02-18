package Java_Advanced.Polimorfismo.PolimorfismoEjemploDos;

import java.util.Scanner;

public abstract class ClasePadre
{
    protected int valorUno, valorDos, resultado;
    Scanner entrada = new Scanner(System.in);


    public void pedirDatos()
    {
        System.out.println("Dame el primer valor: ");
        valorUno = entrada.nextInt();

        System.out.println("Dame el segundo valor: ");
        valorDos = entrada.nextInt();
    }

    //Para el Polimorfismo debemos crear métodos abstractos, y por ende la clase también tiene que ser abstracta
    //Cabe mencionar que los métodos abstractos no llevan "{ }", ya que su lógica (código), se implementa en otra clase

    public abstract void Operaciones();

    public void MostrarResultado ()
    {
        System.out.println("El resultado es: " + resultado);
    }

}
