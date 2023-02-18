package Java_Advanced.Polimorfismo.DatosPersona;

public class DatosIdentificacionDos extends Informacion
{
    @Override
    public void mostrarInformacion(){
        id= "DOS" + genero+ "" + Math.random();
    }


}
