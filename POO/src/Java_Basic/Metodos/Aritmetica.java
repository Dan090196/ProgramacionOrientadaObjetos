package Java_Basic.Metodos;

public class Aritmetica
{
    //Atributos
    int a;
    int b;
    int resultado;


    //Método Sumar
    public void sumar () //No se regresa nada
    {
        int resultado = a + b;
        System.out.println("El resultado es: " + resultado);
    }

    public int SumarConRetorno() //Se tiene que regresar algo para que funcione
    {
        int resultado = a + b;
        return resultado;

        // return a + b; ---> esto es correcto pero se queda comentado
    }

    //Parametros y argumentos es lo mismo
    public int SumarConParametros(int param1, int param2)
    {
        a = param1;
        b = param2;
        return a + b;

    }





}
