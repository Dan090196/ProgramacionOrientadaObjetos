package Java_Advanced.Polimorfismo.SobreCargaDeMetodo;

public class SobrecargaDeMetodo
{
    public void suma (int a, int b) //Método con parámetros
    {
        System.out.println("El resultado es: " + (a + b));
    }

    public void suma (int a, int b, int c)
    {
        System.out.println("El resultado es: " + (a + b + c));
    }

    public static void main(String[] args)
    {
        SobrecargaDeMetodo objSobreCarga = new SobrecargaDeMetodo(); //Se crea objeto de la clase para mandar a llamar a los distintos métodos
        objSobreCarga.suma(100, 100);
        objSobreCarga.suma(200,200,200);
    }


}
