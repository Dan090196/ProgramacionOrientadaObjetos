package Java_Basic.SwitchCase;

public class SwitchCase
{
    public static void main(String[] args)
    {
        var numero = 2;
        var numeroTexto = "Valor Desconocido";

        switch (numero)
        {
            case 1:
                numeroTexto = "Numero Uno";
                break;

            case 2:
                numeroTexto = "Numero Dos";
                break;

            case 3:
                numeroTexto = "Numero Tres";
                break;

            case 4:
                numeroTexto = "Numero Cuatro";
                break;

            default:
                numeroTexto = "Desconozco ese numero";
        }

        System.out.println("Texto: " + numeroTexto);


    }
}
