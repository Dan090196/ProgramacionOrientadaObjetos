package Java_Advanced.Polimorfismo.DatosPersona;

public class DatosIdentificacionUno extends Informacion
{
    @Override
    public void mostrarInformacion(){
        id= "UNO" + genero+ "" + Math.random();
    }


}

