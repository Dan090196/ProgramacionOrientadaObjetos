package Java_Basic.OperadoresYVariables;

public class UsoDeVar
{
    public static void main(String[] args)
    {
        //Uso de la palabra reservada (todas aquellas palabras que ya son de java, las que se encuentran de color naranja)
        // "var", infiere en los tipos de datos
        var intEntera = 10;
        System.out.println(intEntera); //envia informacion en nuestra pantalla
        var miNombre = "Daniela";

        // Concatenacion de variables
        System.out.println("Mi nombre es: " + miNombre);


        //Concatenacion de variables, Ejemplo 2
        var usuario = "Aguilar";
        var ocupacion = "Tester";
        var perfil = ocupacion + " " + usuario;
        System.out.println("Perfil: " + perfil);

        var i = 5;
        var j = 3;
        System.out.println(i + j); // Se realiza la suma, dado que no hay un texto previo
        System.out.println(i + j + " " + perfil); // Evalua de izquierda a derecha, realiza la suma y coloca el texto
        System.out.println(perfil + i + j); // Contexto cadena
        System.out.println(perfil + "" + " " + (i + j)); // Uso de parentesis modifica la prioridad

    }
}
