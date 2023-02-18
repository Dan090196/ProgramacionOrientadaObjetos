package Java_Advanced.Constructores;

public class ClasePrincipal
{
    public static void main(String[] args)
    {
        //Instancia a la clase que no tiene constructor
        SinConstructor sin  = new SinConstructor();
        sin.PedirNombre();
        sin.imprimir();

        //Instancia a la clase que tiene el constructor
        ConConstructor con = new ConConstructor();

    }
}
