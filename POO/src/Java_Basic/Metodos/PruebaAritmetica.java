package Java_Basic.Metodos;

public class PruebaAritmetica
{
    public static void main(String[] args)
    {
        Aritmetica aritmetica = new Aritmetica();
        aritmetica.b = 8;
        aritmetica.a = 5;

        aritmetica.sumar();

        var resultado = aritmetica.SumarConRetorno();
        System.out.println("Resultado con retorno: " + aritmetica.SumarConRetorno());

        resultado = aritmetica.SumarConParametros(10, 29);
        System.out.println("Resultado usando parametros: " + resultado);

    }
}
