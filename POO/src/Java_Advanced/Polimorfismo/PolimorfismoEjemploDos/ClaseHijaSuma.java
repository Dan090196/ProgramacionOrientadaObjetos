package Java_Advanced.Polimorfismo.PolimorfismoEjemploDos;

public class ClaseHijaSuma extends ClasePadre
{
    @Override //-----> A esto se le conoce como sobre-escribir métodos, es decir, cuando estamos utilizando el polimorfismo
    public void Operaciones()
    {
        resultado = valorUno + valorDos;
    }
}
